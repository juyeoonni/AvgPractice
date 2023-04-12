package day0412;

import java.util.Scanner;

public class AvgPractice {

	public static void main(String[] args) {
		
		// 길이가 n인 1차원 배열 a[] 선언
		Scanner sc = new Scanner(System.in);
		int subjectNum = sc.nextInt();
		
		// 배열을 선언하고 배열에 입력받은 과목의 점수 입력하기 
		int a[] = new int[subjectNum];
		for (int i = 0; i < subjectNum; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < subjectNum; i++) {
			if(a[i] > max) {
			max = a[i];
			sum =sum + a[i];
			}
		}
		
		System.out.println(sum + 100 / max / subjectNum);
		
	}

}
