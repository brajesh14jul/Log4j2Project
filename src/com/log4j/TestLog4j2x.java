package com.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  
  
public class TestLog4j2x{  
  
   /* Get the class name to be printed on */ 
	static Logger log = LogManager.getLogger(TestLog4j2x.class.getName());  
     
   public static void main(String[] args){  
	   System.out.println("Start");
	   log.trace("Hello this is a trace message");
      log.debug("Hello this is a debug message");  
      log.info("Hello this is an info message");  
      log.warn("Hello this is a warn message");  
      log.error("Hello this is an error message"); 
      log.fatal("Hello this is a debug message");  
      log.log(Level.INFO, "========================"); 
      System.out.println("End");
   }  
} 