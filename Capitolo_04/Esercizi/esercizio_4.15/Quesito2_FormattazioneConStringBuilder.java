void main() {
    StringBuilder html = new StringBuilder();
    html.append("<html>\n");
    html.append("    <head>\n");
    html.append("        <title>Pagina di prova</title>\n");
    html.append("    </head>\n");
    html.append("    <body>\n");
    html.append("        <h1>Testiamo un text block</h1>\n");
    html.append("    </body>\n");
    html.append("</html>");

    System.out.println(html.toString());
}
