package ro.ase.acs.cts.singleton.version;


public class Singleton {
	//referinta instanta unica
    public static final Singleton instance = new Singleton();

	//constructor privat
    private Singleton() { }
}
