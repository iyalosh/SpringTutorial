package com.tutorialspoint;
// This is an example for Injecting Inner Beans

public class Editor {
	   private SpellingChecker spellingChecker;
	   
	   // a setter method to inject the dependency.
	   public void setSpellingChecker(SpellingChecker spellingChecker) {
	      System.out.println("Inside setSpellingChecker." );
	      this.spellingChecker = spellingChecker;
	   }
	   
	   // a getter method to return SpellingChecker
	   public SpellingChecker getSpellingChecker() {
	      return spellingChecker;
	   }
	   public void spellCheck() {
	      spellingChecker.checkSpelling();
	   }
}
