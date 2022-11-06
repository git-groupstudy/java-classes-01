package chapter06.sec00;
import java.util.Scanner;

public class Member {



	private String ID;
	private String PW;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public boolean login(String inputID, String inputPW) {
		if (inputID.equals(this.ID)) {
			if (inputPW.equals(this.PW)) {
				System.out.println("로그인 성공");
				return true;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
				return false;
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
			return false;
		}
	}

}
