public class TestTextBlock {
    public static void main(String args[]) {
        String oneString =
            "<html>\n  <body>\n    <h1>Hello World!</h1>\n  </body>\n</html>";
        System.out.println(oneString);
        
        String stringConcatenation = "<html>\n" +
                          "  <body>\n" +
                          "    <h1>Hello World!</h1>\n" +
                          "  </body>\n" +
                          "</html>";
        System.out.println(stringConcatenation);
        
        String textBlock = """
                           <html>
                             <body>
                               <h1>Hello World!</H1>
                             </body>
                           </html>""";
        System.out.println(textBlock);
    }
}