package _02_sea_creature;

public class SeaCreatureRunner {
	
	public static void main(String[] args) {
		
		SeaCreature a = new SeaCreature("spongebob");
		a.eat();
		a.laugh();
		SeaCreature b = new SeaCreature("patrick");
		String n1 = b.getName();
		System.out.println(n1);
		b.eat();
		b.laugh();
		SeaCreature c = new SeaCreature("squidward");
		String n2 = c.getName();
		System.out.println(n2);
		c.eat();
		c.laugh();
	}
}
