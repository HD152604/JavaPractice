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

public class Car2 {

   private String company = "현대자동차";
   private String model = "제네시스";
   private String color = "검정색";
   private int maxSpeed = 225;
   private int price = 50000000; 

   public Car2(String getCompany, String getModel, String getColor, int getmaxSpeed, int getPrice) {
	   company = getCompany;
	   model = getModel;
	   color = getColor;
	   maxSpeed = getmaxSpeed;
	   price = getPrice;
	   
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