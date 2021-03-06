/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */

public class Car3 {

   private String company = "현대자동차";
   private String model = "제네시스";
   private String color = "검정색";
   private int maxSpeed;
   private int price; 

   public Car3(String company, String model, String color, int maxSpeed, int price) {
	   this.company=company;
	   this.model=model;
	   this.color=color;
	   this.maxSpeed=maxSpeed;
	   this.price=price;
	   
   }
   public Car3(String company, String model, String color, int maxSpeed) {
	   this.company=company;
	   this.model=model;
	   this.color=color;
	   this.maxSpeed=maxSpeed;
   }
   public Car3(String company, String model, String color) {
	   this.company=company;
	   this.model=model;
	   this.color=color;
   }
   
   public String getCompany() {
      return company;
   }
   
  
   public String getModel() {
      return model;
   }
   
   
   public String getColor() {
      return color;
   }
   
   
   public int getmaxSpeed() {
      return maxSpeed;
   }
   
   
   public int getPrice() {
      return price;
   }

}