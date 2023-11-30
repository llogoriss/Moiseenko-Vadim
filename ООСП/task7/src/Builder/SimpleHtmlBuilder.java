package Builder;

public class SimpleHtmlBuilder implements HtmlBuilder{
  private StringBuilder html;

  public SimpleHtmlBuilder() {
    this.html = new StringBuilder();
  }

  @Override
  public HtmlBuilder addStartTag(String tag) {
    html.append("<").append(tag).append(">");
    return this;
  }

  @Override
  public HtmlBuilder addAttribute(String attribute, String value) {
    html.insert(html.length() - 1, " " + attribute + "=\"" + value + "\"");
    return this;
  }

  @Override
  public HtmlBuilder addContent(String content) {
    html.append(content);
    return this;
  }

  @Override
  public HtmlBuilder addEndTag(String tag) {
    html.append("</").append(tag).append(">");
    return this;
  }

  @Override
  public String getResult() {
    return html.toString();
  }
}
