package _06_minion;

public class Minion {
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getEyes() {
		return eyes;
	}
	void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	String getMaster() {
		return master;
	}
	void setMaster(String master) {
		this.master = master;
	}
}