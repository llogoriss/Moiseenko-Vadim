package Builder;

public class HtmlDirector {
  private HtmlBuilder builder;

  public HtmlDirector(HtmlBuilder builder) {
    this.builder = builder;
  }

  public String constructSampleHtml() {
    builder.addStartTag("html")
        .addStartTag("head")
        .addStartTag("title").addContent("Заголовок страницы").addEndTag("title")
        .addEndTag("head")
        .addStartTag("body")
        .addStartTag("h1").addContent("Привет, мир!").addEndTag("h1")
        .addStartTag("p").addContent("Это пример HTML-документа.").addEndTag("p")
        .addEndTag("body")
        .addEndTag("html");

    return builder.getResult();
  }
}
