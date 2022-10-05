package chapter06.sec02;

public class App {

	public static void main(String[] args) {
		//생성자 응용
//		Member member1 = new Member();
//		System.out.println(member1.toString());
		
		Member member2 = new Member("chul-soo", 15, "축구", "국어국문", "01012345678");
		System.out.println(member2.toString());
		
		Member member3 = new Member("young-hee", 20);
		System.out.println(member3.toString());
		
		Member member4 = new Member("min-soo", 18, "독서");
		System.out.println(member4.toString());
		
		Member member5 = new Member("min-ji", 24 , "요리", "수학과");
		System.out.println(member5.toString());
	}

}
