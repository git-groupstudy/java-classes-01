package chapter06.sec04;

import java.util.Scanner;

public class Member {

	private String id;
	private String password;
	private Scanner sc = new Scanner(System.in);
	
	public Member() {
		System.out.println("ID를 입력해주세요.");
		this.id = sc.next();
		
		System.out.println("PASSWORD를 입력해주세요.");
		this.password = sc.next();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + "]";
	}
	
	public boolean memberLogin() {
		System.out.print("회원 아이디 : ");
		String id = sc.next();
		System.out.print("회원 비밀번호 : ");
		String pw = sc.next();
		
		if(id.equals(this.id) && pw.equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
