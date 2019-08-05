package _01_getters_and_setters;

public class PersonRunner {
	
	public static void main(String[] args) {
		
		Person a = new Person();
		a.setName("a");
		a.setSuperpower("telepathic");
		String n1 = a.getName();
		System.out.println(n1);
		String s1 = a.getSuperpower();
		System.out.println(s1);
		String t1 = a.toString();
		System.out.println(t1);
		Person b = new Person();
		b.setName("b");
		b.setSuperpower("invisibility");
		String n2 = b.getName();
		System.out.println(n2);
		String s2 = b.getSuperpower();
		System.out.println(s2);
		String t2 = b.toString();
		System.out.println(t2);
		Person c = new Person();
		c.setName("c");
		c.setSuperpower("teleportation");
		String n3 = c.getName();
		System.out.println(n3);
		String s3 = c.getSuperpower();
		System.out.println(s3);
		String t3 = b.toString();
		System.out.println(t3);
	}
}
