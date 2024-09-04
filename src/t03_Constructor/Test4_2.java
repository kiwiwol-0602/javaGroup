package t03_Constructor;
//공장에서 만들어진 부품
public class Test4_2 {
	String model;
	String color = "블랙";
	int speed;
	
	public Test4_2(String model) { // #1
//		this.model = model;
//		this.color = "흰색";
//		this.speed = 250;
		this(model, "흰색", 250);
	}
		
	public Test4_2(String model, String color) {  //#2
//		this.model = model;
//		this.color = color;
//		this.speed = 250;
		this(model, color, 250);
	}
	
	public Test4_2(String model, String color, int speed) {  //#3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
