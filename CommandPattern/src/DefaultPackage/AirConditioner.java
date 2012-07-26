package DefaultPackage;


public class AirConditioner implements ElectricalAppliance {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("A/C is ON");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("A/C is OFF");
	}

}
