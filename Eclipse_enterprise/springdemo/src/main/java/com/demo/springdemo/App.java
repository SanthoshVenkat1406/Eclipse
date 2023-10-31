package com.demo.springdemo;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
 public static void main(String[] args) {
   ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	productComponent product=context.getBean(productComponent.class);
	productComponent product2=context.getBean(productComponent.class);

	if(product==product2) {
    	System.out.println("Same Object");
    }
    else {
    	System.out.println("Different Object");
    }
    Scanner sc=new Scanner(System.in);
    while(true) {
    	System.out.print("Enter product ");
    	String prd=sc.nextLine();
   	if(prd.equals("end")) {
   		break;
   	}
   	System.out.println(product.viewAddProduct(prd));
   }
 }
}