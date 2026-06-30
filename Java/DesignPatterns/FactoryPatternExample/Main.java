package FactoryPatternExample;

public class Main {
public static void main(String[] args) {
	DocumentFactory f = new DocumentFactory();
	  Document doc =f.ShareDocument("word");
	  if(doc!=null)
	  {
	  doc.SendDocument();
	  }
}
}
