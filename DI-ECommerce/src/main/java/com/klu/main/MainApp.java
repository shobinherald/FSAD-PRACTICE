package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.ProductOrder;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductOrder pr=(ProductOrder)Context.getBean("order");
		pr.display();
		
		ApplicationContext Context1=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductOrder pr1=Context1.getBean(ProductOrder.class);
		pr1.display();
	}
	

}