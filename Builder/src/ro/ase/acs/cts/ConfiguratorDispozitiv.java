package ro.ase.acs.cts;

public class ConfiguratorDispozitiv {
	
	//referinta catre builder
	AbstractSmartDeviceBuilder builder;
	
	//constructor
	public ConfiguratorDispozitiv(AbstractSmartDeviceBuilder builder){
		this.builder = builder;
	}
	
	
	public SmartDevice getDispozitiv(){
		return this.builder.getDispozitiv();
	}

	//metoda prin care este construit un dispozitiv
	public void construieste(){
		this.builder.adaugaDisplay(new DisplaySuperAmoled(5.1));
		this.builder.adaugaSDCard(new SDCard(32));
		this.builder.adaugaWiFi(true);
		
	}
}
