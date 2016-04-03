package ro.ase.acs.cts;

public class DocumentFactory {
	
	public InterfataDocument creareDocument(TipDocument tipDocument, String titlu){
		
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			document = new DocumentText();
			document.setTitlu(titlu);
			break;
		case HTML:
			document = new DocumentHtml();
			document.setTitlu(titlu);
			break;
		}
		
		return document;
	}
}


