/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public class SmartPhone {
	
	public String model;
	public String company;
	public int price;
	
	
	public SmartPhone(){
		
	}
	
	
	public SmartPhone(String model, String company, int price){
		this.model=model;
		this.company=company;
		this.price=price;
	}
	
	public void turnOn(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println(model+"의 전원을 끕니다.");
	}
	
	public void pay(){
		System.out.println(company+"페이로 결제합니다.");
	}
	
	public void useSpecialFunction(SmartPhone phone){
		if(phone==null) return;
		if(phone instanceof Galaxy) {
			((Galaxy) phone).useWirelessCharging();
		
		}
		else if(phone instanceof IPhone) {
			((IPhone) phone).useAirDrop();
		}
		
	}


	public String toString() {
		return "모델명 : "+ model + ", 제조사 : "+ company + ", 가격 : "+ String.format("%,d",price)+"원";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
