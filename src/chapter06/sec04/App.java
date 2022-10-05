package chapter06.sec04;

public class App {

	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		System.out.println("회원가입 완료. 회원정보 : " + member1.toString());
		
		if(member1.memberLogin()) {
			System.out.println("성공!!");
		} else{
			System.out.println("실패!!");
		};
	}

}
