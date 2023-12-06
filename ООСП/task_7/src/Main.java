import Builder.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    HtmlBuilder builder = new SimpleHtmlBuilder();
    HtmlDirector director = new HtmlDirector(builder);

    String htmlDocument = director.constructSampleHtml();
    System.out.println(htmlDocument);
  }
}