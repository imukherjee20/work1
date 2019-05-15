package apPhysicsFinal;

public class Electricity {
	
	private int area, force, current, length, power, charge1, charge2, resistance, resistivity, radius, timeInit, timeFin, electricPoten;
	
	private final int k = 9
	public Electricity() {
		
	}

	public Electricity(int c1, int c2, int r)
	{
		charge1 = c1;
		charge2 = c2;
		radius = r;
	}
	
	public Electricity(int c1, int c2, int t1, int t2)
	{
		charge1= c1;
		charge2 = c2;
		timeInit = t1;
		timeFin = t2;
	}
	
	
}
