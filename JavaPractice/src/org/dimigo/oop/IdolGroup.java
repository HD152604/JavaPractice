/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public class IdolGroup {
	public static void main(String[] args) {
		
		String[ ] groupName = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] memberName = new String[][]{
			{"GD", "태양", "대성", "탑", "승리"}, 
			{"CL", "산다라박", "박봄", "민지"},
			{"유라", "혜리", "소진", "민아"}
	      };
	      for(int i=0;i<groupName.length;i++){
	    	   System.out.println("<< " + groupName[i] + " >>");
	    	  for(String member:memberName[i]){
	    		System.out.println(member);
	    	  }
	    	  System.out.println("");
	      }

		
		
		
	}

}
