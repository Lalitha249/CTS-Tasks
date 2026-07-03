package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagmentApplication {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println("Application Started");
	BookService service =
			context.getBean("bookService", BookService.class);

			System.out.println(service);
}
}
