package DefaultPackage;

public class CommandPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricalAppliance eapp = new Fan();
		eapp.start();
		eapp.stop();
		IButton eButton= new ElectricItemButton(eapp);
		eButton.buttonOn();
		eButton.buttonOff();
		IButton lightButton = new ElectricItemButton(new LightBulb());
		lightButton.buttonOn();
		lightButton.buttonOff();
		
	}

}
