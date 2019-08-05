package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	
	public static void main(String[] args) {
		
		TeaBag t = new TeaBag("mint");
		
		Kettle k = new Kettle();
		k.boil();
		Water w = k.getWater();
		
		Cup c = new Cup();
		c.makeTea(t, w);
	}
}
