package FactoryPatternExample;

public class ExcelDocument implements Document{

	@Override
	public void SendDocument() {
		System.out.println("ExcelDocument has sent");
	}

}
