package com.app.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
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
		
		/*repo.getMyDataName(6, 3.3)
		.forEach(System.out::println);*/
		
		/*int count=repo.updateCost(10.8, 8);
		System.out.println(count);*/
		
		/*int count=repo.removeData(8);
		System.out.println(count);*/
		
		//System.out.println(repo.getData(2));
		
		Optional<Product> p=repo.getData(5);
		if(p.isPresent()) {
			Product prd=p.get();
			System.out.println(prd.getProdCode());
		}else {
			System.out.println("No Data Found");
		}
		
		
		
		

	}

}
