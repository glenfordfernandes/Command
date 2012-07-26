package DefaultPackage;

public class LightBulb implements ElectricalAppliance {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Light  ON");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Light Off");
	}

}
