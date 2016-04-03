package ro.ase.acs.cts;

public class TestFactory {

	public static void main(String[] args) {
		//creare Factory documente
		DocumentFactory factory = new DocumentFactory();
		
		//creare document text
		InterfataDocument doc1 = factory.creareDocument(TipDocument.TEXT, "Factory.txt");
		
		//creare document html
		InterfataDocument doc2 = factory.creareDocument(TipDocument.HTML, "Factory.html");
		
		System.out.println("Tip document doc1: "+doc1.getTip());
		System.out.println("Tip document doc2: "+doc2.getTip());
		
	}

}
