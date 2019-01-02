package com.sso;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// declare a new annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface Demo {

	String str();
	int val();
   
}
 


public class Test {

   // set values for the annotation
   @Demo(str = "Demo Annotation", val = 100)
     // a method to call in the main
   public static void example() {
       Test ob = new Test();
       try {
         Class c = ob.getClass();
          // get the method example
         Method m = c.getMethod("example");
          // get the annotations
         Annotation[] annotation = m.getDeclaredAnnotations();

         // print the annotation
         for (int i = 0; i < annotation.length; i++) {
            System.out.println(annotation[i]);
         }
      } catch (NoSuchMethodException exc) {
         exc.printStackTrace();
      }
   }

   public static void main(String args[]) {
      example();
   }
}

 