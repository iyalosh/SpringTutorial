package com.tutorialspoint;
//This is the main function to test the inner injection between two beans
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppInnerInjection {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans_innerInjection.xml");
      Editor teEd = (Editor) context.getBean("editor");
      teEd.spellCheck();
   }
}
