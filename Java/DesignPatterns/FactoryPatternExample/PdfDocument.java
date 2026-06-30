package FactoryPatternExample;

public class PdfDocument implements Document {

	@Override
	public void SendDocument() {
		System.out.println("Pdf Document has sent");
		
	}

}
