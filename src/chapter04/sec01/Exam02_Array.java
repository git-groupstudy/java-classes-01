package chapter04.sec01;

import java.util.HashMap;
import java.util.Map;

public class Exam02_Array {

	public static void main(String[] args) {
		//1. 배열 만들기
		System.out.println("========== arr1 ==========");
		
		int[] arr1 = new int[4];
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//2. 배열 만들기 2
		System.out.println("========== arr2 ==========");
		
		int[] arr2 = new int[] {1, 2, 3, 4};
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		//3. 배열만들기
		System.out.println("========== arr3 ==========");
		
		int[] arr3 = {1, 2, 3, 4};
		for (int k = 0; k < arr3.length; k++) {
			System.out.println(arr3[k]);
		}
		
		//4. 배열에 값 넣기
		System.out.println("========== arrTo100 ==========");
		
		int[] arrTo100 = new int[100];
		
		for (int i = 0; i < arrTo100.length; i++) {
			arrTo100[i] = i + 1;
		}
		
		for (int i = 0; i < arrTo100.length; i++) {
			System.out.println(arrTo100[i]);
		}
		
		//5. 1 ~ 100 합계 구하기
		System.out.println("========== sum ==========");
		
		int sum = 0;
		
		for (int i = 0; i < arrTo100.length; i++) {
			sum += arrTo100[i];
		}
		
		System.out.println("1 ~ 100까지 합 : " + sum);
		
		
		
	}

}
