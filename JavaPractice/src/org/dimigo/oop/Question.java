/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public class Question {
	public static void main(String[] args) {
		
		String[] answers = {"우주소녀","박보영","지구과학"};
		String a = "정답입니다!";
		String b = "틀렸습니다!";
		Scanner scanner = new Scanner(System.in);
		String[] answer = {null,null,null};
		
		
		StringBuilder[] question = {
				new StringBuilder("1.가장 좋아하는 가수는?"),
				new StringBuilder("2.가장 좋아하는 배우는?"),
				new StringBuilder("3.가장 좋아하는 과목은?")
		};
		
		for(int i=0; i<3; i++){
			System.out.println(question[i]);
			answer[i]= scanner.nextLine();
			
			if(answers[i].equals(answer[i])){
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
		
		System.out.println(" << 결과 출력 >>");
		
		for(int i = 0; i < 3; i++){
			question[i].append(" " + answers[i] + "입니다.");
			System.out.println(question[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
