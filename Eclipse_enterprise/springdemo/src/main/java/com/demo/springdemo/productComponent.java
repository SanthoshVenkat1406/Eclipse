package com.demo.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope(value="prototype")
public class productComponent {
	@Autowired
	CartComponent cart;
	@Value("${cname}")
	String cname;
	public List<String> viewAddProduct(String prdname){
		return cart.addProduct(cname + ":" + prdname);
	}
}
//	public void setCart() {
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		cart=context.getBean(CartComponent.class);
//	}
//	public List<String> viewAddProduct(String prdname){
//		return cart.addProduct(prdname);
//	}
//}


