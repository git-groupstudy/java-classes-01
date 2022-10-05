package chapter06.sec01;

public class Dog {
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(int selector) {
		if(selector == 0) {
			this.name = "골든리트리버";
		} else if (selector == 1) {
			this.name = "불독";
		} else {
			this.name = "백구";
		}
	}
	
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
}
