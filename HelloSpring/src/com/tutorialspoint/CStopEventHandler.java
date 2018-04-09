package com.tutorialspoint;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

//This is a stop Application event

public class CStopEventHandler 
implements ApplicationListener<ContextStoppedEvent>{

public void onApplicationEvent(ContextStoppedEvent event) {
   System.out.println("ContextStoppedEvent Received");
}
}