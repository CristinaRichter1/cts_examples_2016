package ro.ase.acs.cts;

public class Test {
	public static void main(String[] args) throws Exception {
		System.out.println("Testare unicitate instanta Singleton");
		Singleton referinta1 = Singleton.getInstance();
		Singleton referinta2 = Singleton.getInstance();
		
		//verificare referinte
		if(referinta1==referinta2)
			System.out.println("Referintele sunt identice");
		else
			System.out.println("Obiecte diferite");
		
	}
	

	
}
