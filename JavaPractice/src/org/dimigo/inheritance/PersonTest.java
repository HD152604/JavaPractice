/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
	
		Person a = new Person("Tom");
		System.out.println(a);
                         
		Korean b = new Korean("홍길동");
		System.out.println(b);

		Japanese c = new Japanese("다나카");
		System.out.println(c);
		
		Chinese d = new Chinese("왕밍");
		System.out.println(d);
		System.out.println("");
		
		a.sayHello();	
		b.sayHello();
		c.sayHello();
		d.sayHello();
		
		System.out.println("");
		a.sayBye();
		b.sayBye();
		c.sayBye();
		d.sayBye();
		
		

		
	}

}
