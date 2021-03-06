package ro.ase.acs.cts;

public class WordDocumentFactory extends AbstractDocumentFactory{

	@Override
	public InterfataDocument creareDocument(TipDocument tipDocument) {
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			//generare document text de tip Word - specific generatorului
			document = new DocumentWordText();
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		}
		
		return document;
	}
}
