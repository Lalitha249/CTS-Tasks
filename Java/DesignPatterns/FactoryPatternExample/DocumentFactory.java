package FactoryPatternExample;

public class DocumentFactory {

	public Document ShareDocument(String doc)
	{
		
		if(doc.equalsIgnoreCase("Excel"))
			return new ExcelDocument();
		else if(doc.equalsIgnoreCase("PDF"))
			return new PdfDocument();
		else if (doc.equalsIgnoreCase("word"))
			return new WordDocument();

	 throw new IllegalArgumentException("Invalid Document Type");
		
	}
}
