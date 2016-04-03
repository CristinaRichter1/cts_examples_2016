package ro.ase.acs.cts.test;

import ro.ase.acs.cts.LoggerInterface;
import ro.ase.acs.cts.SingletonCollection;

public class TestCollection {

	public static void main(String[] args) {
		
		//LoggerConsola consola = new LoggerConsola();
		
		//obtinem referinta catre SingletonCollection
		SingletonCollection loggerCollection = SingletonCollection.LoggerCollection;
		
		//obtin referintele unice catre diferite tipuri de Logger
		LoggerInterface loggerConsola = 
				loggerCollection.getInstance(
						"ro.ase.acs.cts.LoggerConsola");
		LoggerInterface loggerFisier = 
				loggerCollection.getInstance(
						"ro.ase.acs.cts.LoggerFisier");
		
		//test logger
		loggerConsola.printLog("Test log");
		
		//cerere catre o noua referinta LoggerConsola
		LoggerInterface  loggerConsola2 = 
				loggerCollection.getInstance("ro.ase.acs.cts.LoggerConsola");
		
		//verificare egalitate referinte
		if(loggerConsola==loggerConsola2)
			System.out.println("Referintele sunt identice");
		else
			System.out.println("Obiecte diferite");
		
	}

}
