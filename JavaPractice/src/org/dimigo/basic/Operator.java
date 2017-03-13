/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public class Operator {
	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		int a = 1700000;
		int b = 3;
		int c = 1500;
		long d = a*12L*b*c;
		System.out.println("월 평균 급여 : "+String.format("%,d", a)+"원");
		System.out.println("점포 내 직원 수 : "+b+"명");
		System.out.println("점포 수 : "+String.format("%,d", c)+"개");
		System.out.println("연간 인건비 : "+String.format("%,d", d)+"원");
	
		
	}
}
