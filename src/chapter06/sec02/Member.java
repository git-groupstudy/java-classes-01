package chapter06.sec02;

public class Member {
	
	public String name;
	public int age;
	public String hobby;
	public String major;
	public String phoneNumber;
	
//	public Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	public Member(String name, int age) {
		this(name, age, "취미 없음");
	}
	
	public Member(String name, int age, String hobby) {
		this(name, age, hobby, "전공 없음");
	}
	
	public Member(String name, int age, String hobby, String major) {
		this(name, age, hobby, major, "번호 없음");
	}
	
	public Member(String name, int age, String hobby, String major, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.major = major;
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", hobby=" + hobby + ", major=" + major + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}
