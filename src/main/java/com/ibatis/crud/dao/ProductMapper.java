package com.ibatis.crud.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ibatis.crud.entities.Product;
import com.ibatis.crud.util.MyBatisUtil;

@Repository
public class ProductMapper {

	public void saveProduct(Product product) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertProduct", product);
		session.commit();
		session.close();
	}

	public void updateProduct(Product product) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateProduct", product);
		session.commit();
		session.close();
	}

	public void deleteProduct(int productId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteProduct", productId);
		session.commit();
		session.close();
	}

	public List<Product> getAllProduct() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Product> productList = session.selectList("getAllProduct");
		session.commit();
		session.close();
		return productList;
	}

	public Product findById(int productId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Product product = (Product) session.selectOne("findById", productId);
		session.commit();
		session.close();
		return product;
	}
}
