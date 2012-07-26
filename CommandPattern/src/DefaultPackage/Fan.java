package DefaultPackage;

public class Fan implements ElectricalAppliance {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Fan is ON");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Fan is OFF");
	}

}
