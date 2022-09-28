package chapter04.sec01;

import java.time.LocalDate;

public class Exam01_Pre_Ref_Type {

	public static void main(String[] args) {
		// 1. 원시타입
		int num1 = 10;
		char char1 = 'A';
		boolean bool1 = true;

		// 2. 참조타입
		String string1 = "문자열";
		LocalDate date1 = LocalDate.now();

		// 3. 출력
		System.out.println(num1);
		System.out.println(char1);
		System.out.println(bool1);
		System.out.println(string1);
		System.out.println(date1);

		// 4. 실제 값이 같은지 비교
		int num2 = 10;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		System.out.println(num1 == num2);

		LocalDate date2 = LocalDate.now();
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		System.out.println(date1 == date2);

		String string2 = "문자열";
		System.out.println("string1 : " + string1);
		System.out.println("string2 : " + string2);
		System.out.println(string1 == string2);

		String string3 = new String("문자열");
		System.out.println("string3 : " + string3);
		System.out.println(string1 == string3);

		// 5. 같은 객체인지 알아보기(해시코드 사용)
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));

		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));

		System.out.println(System.identityHashCode(string1));
		System.out.println(System.identityHashCode(string2));
		System.out.println(System.identityHashCode(string3));

		// 6. 그렇다면 참조타입 값을 비교하는 방법
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
		System.out.println(date1.equals(date2));

	}

}
