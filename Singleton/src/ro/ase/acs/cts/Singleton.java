package ro.ase.acs.cts;

public class Singleton {
	//referinta instanta unica
    private static Singleton instance = null;

	//constructor privat
    private Singleton() throws Exception {
    	if(instance!=null)
    		throw new Exception("Singleton deja creat !");
    }

 	//metoda publica statica
    public static synchronized Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton ();
        }
        return instance;
    }
    
    private Object readResolve() throws Exception {
        return Singleton.getInstance();
    }

}

