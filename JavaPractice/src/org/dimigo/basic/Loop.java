/**
 * 
 */
package org.dimigo.basic;

import java.util.*;
/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public class Loop {
	public static void main(String[] args) {
		
		String[] character = {"마법사","영주","기사","농민"};
		Random random = new Random();
		
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		int power = 100;
		
		do {
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				power = power+10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+power);
				break;
			case 2:
				power = power-10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : ");
				break;
			case 3:
					int a = random.nextInt(4);
					System.out.println(character[a]+"(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
		} while (choice != 9);
		
		
	}

}
