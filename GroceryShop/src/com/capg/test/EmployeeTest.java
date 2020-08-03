package com.capg.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.capg.beans.Product;
import com.capg.beans.Items;
import com.capg.beans.User;
import com.capg.beans.Details;
import com.capg.service.GroceryShop;
import com.capg.service.GroceryShopImp;

class EmployeeTest {

	@Test
	void test() {
		
		GroceryShop retail=new GroceryShopImp();
		List<Product> list=new ArrayList<Product>();
		Product product=new Product();
		Product product1=new Product();
		User user=new User();
		
		user.setUserId(1);
		user.setUserName("Swathi");
		user.setUsertype(Details.EMPLOYEE);
		user.setRegistrationDate(LocalDate.now());
		
		product.setProductId(7346);
		product.setProductName("Moong Dal");
		product.setProductType(Items.GROCERIES);
		product.setQuantity(5);
		product.setRatePerQuantity(58);
		
		list.add(product);
		product1.setProductId(847856);
		product1.setProductName("FRENCH FRIES");
		product1.setProductType(Items.FROGENFOODS);
		product1.setQuantity(5);
		product1.setRatePerQuantity(32);
		list.add(product1);
		user.setProduct(list);
		double bill=retail.calculateBill(user);
		System.out.println(bill);
		assertEquals(165, bill);
		}

}
