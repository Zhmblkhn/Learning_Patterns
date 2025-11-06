package FactoryPattern.DocumentEditorFactory;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening a PdfDocument");
    }
}
