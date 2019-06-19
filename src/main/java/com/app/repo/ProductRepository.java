package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	/*@Query("select p from com.app.model.Product p")
	public List<Product> getMyData(); */
	
	/*@Query("select p.prodCost from Product p")
	public List<Double> getCostsOnly();*/
	
	/*@Query("select p.prodCost,p.prodCode from Product p")
	public List<Object[]> getInfo(); */
	
	//--passing parameters(inputs at runtime)--
	/*@Query("select p from Product p where p.prodId=?1 or p.prodCost=?2")
	public List<Product> getNewData(Integer id,Double cost);*/
	
	//--named parameters--
	@Query("select p from Product p where p.prodId=:a or p.prodCost=:b")
	public List<Product> getMyDataName(Integer a,Double b);
 
}
