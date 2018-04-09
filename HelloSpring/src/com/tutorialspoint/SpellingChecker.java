package com.tutorialspoint;
//This is the inner bean to be injected in Editor outer bean
public class SpellingChecker {
	public SpellingChecker(){
	      System.out.println("Inside SpellChecker constructor." );
	   }
	   public void checkSpelling(){
	      System.out.println("Inside checkSpelling." );
	   }
}
