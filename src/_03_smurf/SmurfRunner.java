package _03_smurf;

public class SmurfRunner {
	
	public static void main(String[] args) {
		
		Smurf a = new Smurf("Handy");
		String n1 = a.getName();
		System.out.println(n1);
		a.eat();
		
		Smurf b = new Smurf("Papa Smurf");
		String n2 = b.getName();
		System.out.println(n2);
		String h1 = b.getHatColor();
		System.out.println(h1);
		String g1 = b.isGirlOrBoy();
		System.out.println(g1);
		
		Smurf c = new Smurf("Smurfette");
		String n3 = c.getName();
		System.out.println(n3);
		String h2 = c.getHatColor();
		System.out.println(h2);
		String g2 = c.isGirlOrBoy();
		System.out.println(g2);
		
	}
}
