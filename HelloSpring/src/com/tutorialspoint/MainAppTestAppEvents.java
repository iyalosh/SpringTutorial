package com.tutorialspoint;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// In this class we test application start/stop events
public class MainAppTestAppEvents {
	public static void main(String[] args) {
	      ConfigurableApplicationContext context = 
	         new ClassPathXmlApplicationContext("Beans_ApplicationEvents.xml");

	      // Raise a start event.
	      context.start();
		  
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();

	      // Raise a stop event.
	      context.stop();
	   }
}
