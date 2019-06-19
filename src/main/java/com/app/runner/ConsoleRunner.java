package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		/*repo.getMyData() 
		.forEach(System.out::println);*/
		
		/*repo.getCostsOnly()
		.forEach(System.out::println);*/
		
		/*repo.getInfo()
		.forEach(p->System.out.println(p[0]+","+p[1]));*/
		
		/*repo.getNewData(6, 3.3)
		.forEach(System.out::println);*/
		
		repo.getMyDataName(6, 3.3)
		.forEach(System.out::println);
		
		
		
		

	}

}
