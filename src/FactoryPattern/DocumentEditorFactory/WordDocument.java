package FactoryPattern.DocumentEditorFactory;

public class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening a WordDocument");
    }
}
