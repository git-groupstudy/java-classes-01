package chapter06.sec00;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member member1 = new Member();
		
		member1.setID("abc123");
		member1.setPW("1234");
		
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			String inputID = sc.next();
			System.out.println("비밀번호를 입력해주세요.");
			String inputPW = sc.next();
			
			boolean logOn = member1.login(inputID, inputPW);
			
			if(logOn) {
				break;
			}
		}
		
		
	}

}
