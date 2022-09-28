package chapter04.sec01;

import java.util.ArrayList;

public class Exam03_ArrayList {

	public static void main(String[] args) {
		//1. ArrayList 생성
//		ArrayList pitches = new ArrayList();
		ArrayList<String> pitches = new ArrayList<>();
		
		//2. 값 집어넣기
		pitches.add("140");
		pitches.add("150");
		pitches.add("160");
		
		System.out.println(pitches);

		//3. 특정 위치에 값 집어넣기
		pitches.add(0, "160");
		System.out.println(pitches);
		
		pitches.add(1, "100");
		System.out.println(pitches);
		
		//4. 특정 위치 값 가져오기
		System.out.println(pitches.get(1));
//		System.out.println(pitches.get(10));
		
		//5. arrayList 길이 가져오기
		System.out.println(pitches.size());
		
		//6. 특정 값이 있는지 확인
		System.out.println(pitches.contains("200"));
		
		//7. 특정 값 삭제
		System.out.println(pitches);
		
		pitches.remove(0);
		System.out.println(pitches);
		
		pitches.remove("160");
		System.out.println(pitches);
	}

}
