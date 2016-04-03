package ro.ase.acs.cts;

public abstract class AbstractSmartDeviceBuilder {
	public abstract void adaugaWiFi(boolean areWiFi);
	public abstract void adaugaGPS(InterfataGPS modulGPS);
	public abstract void adaugaDisplay(InterfataDisplay display);
	public abstract void adaugaSDCard(InterfataExternalMemory cardMemorie);
	public abstract SmartDevice getDispozitiv();
}
