package ro.ase.acs.cts;

public class TestBuilder {
	public static void main(String[] args){
		
		
		SmartDevice smartphone = new SmartDevice(
				"Galaxy S7",
				"Samsung",
				true,
				new TelCoSIMCard(),
				new GPSIntern(),
				new DisplaySuperAmoled(5.1),
				new SDCard(64));
		
		
		smartphone.setDisplay(new DisplaySuperAmoled(5.1) );
		
		// alte instructiuni
		
		smartphone.setDisplay(new DisplaySuperAmoled(3.1) );
		
		//definire builder dispozitiv
		ACMESmartDeviceBuilder builder = new ACMESmartDeviceBuilder("X5");
		
		//definire configurator
		ConfiguratorDispozitiv configurator = new ConfiguratorDispozitiv(builder);
		
		//construire dispozitiv
		configurator.construieste();
		//obtin dispozitiv
		SmartDevice dispozitiv = configurator.getDispozitiv();
		
		
		DispozitivMobil dispozitivMobil = 
				new DispozitivMobil.DispozitivMobilBuilder("S6", "Samsung")
				.adaugaWiFi()
				.adaugaDisplay(new DisplaySuperAmoled(5.1))
				.build();
		
	}

}
