package ro.ase.acs.cts;

import java.util.ArrayList;

public class SRPTest {
	
	public static void main (String args[])
	{
		PlainTextPrinter plainTextPrinter = new PlainTextPrinter();
		Carte carte = new Carte();
		plainTextPrinter.printPage(carte.paginaUrmatoare());
		
	}
}



class Pagina{
	String continut;
	
	String getContinut(){
		return continut;
	}
}

class Carte {
	
	String titlu;
	String autor;
	
	ArrayList<Pagina> pagini;
	int paginaCurenta = 0;

    String getTitlu() {
        return "A Great Book";
    }
 
    String getAutor() {
        return "John Doe";
    }
 
    Pagina paginaUrmatoare() {
    	return new Pagina();
    }
 
    //NU E OK - cartea nu trebuie sa stie sa se printeze
    void printCurrentPage() {
        System.out.println("current page content");
    }
}

interface Printer {
	 
    public void printPage(Pagina pagina);
}
 
class PlainTextPrinter implements Printer {
 
    public void printPage(Pagina pagina) {
       System.out.println(pagina.getContinut());
    }
 
}
 
class HtmlPrinter implements Printer {
 
	public void printPage(Pagina pagina) {
		System.out.println("<div style='box'>"+pagina.getContinut()+"</div>");
    }
 
}
