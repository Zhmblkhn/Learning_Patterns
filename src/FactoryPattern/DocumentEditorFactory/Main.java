package FactoryPattern.DocumentEditorFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new WordFactory();
        Document word =  documentFactory.createDocument();
        word.open();

        DocumentFactory documentFactory1 = new PdfFactory();
        Document pdf =  documentFactory1.createDocument();
        pdf.open();
    }
}
