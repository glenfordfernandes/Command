package DefaultPackage;
public class ElectricItemButton implements IButton {
ElectricalAppliance eApp; 
	public ElectricItemButton(ElectricalAppliance eApp) {
		super();
		this.eApp=eApp;
	}

	@Override
	public void buttonOn() {
		// TODO Auto-generated method stub
		eApp.start();
	
	}

	@Override
	public void buttonOff() {
		// TODO Auto-generated method stub
		eApp.stop();
	}

}