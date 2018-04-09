package com.tutorialspoint;
//This class inherits HelloWorld class
/* In order to enable the inheritance of HelloWorld bean, we need to add this text to xml file:

<bean id = "helloFrance" class = "com.tutorialspoint.HelloFrance" parent = "helloWorld">
   <property name = "message" value = "Hello France!"/>
   <property name = "message2" value = "Bonjour France!"/>
</bean>
*/
public class HelloFrance {
	   private String message;
	   private String message2;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void setMessage2(String message){
	      this.message2 = message;
	   }

	   public void getMessage(){
	      System.out.println("World Message : " + message);
	   }
	   public void getMessage2(){
	      System.out.println("France Message2 : " + message2);
	   }

}
