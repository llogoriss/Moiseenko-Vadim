package Builder;

public interface HtmlBuilder {
  HtmlBuilder addStartTag(String tag);
  HtmlBuilder addAttribute(String attribute, String value);
  HtmlBuilder addContent(String content);
  HtmlBuilder addEndTag(String tag);

  String getResult();
}
