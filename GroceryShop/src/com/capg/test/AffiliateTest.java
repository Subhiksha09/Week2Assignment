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

class AffiliateTest {
	
	@Test
	void test() {
		
		GroceryShop retail=new GroceryShopImp();
		List<Product> list=new ArrayList<Product>();
		Product product=new Product();
		Product product1=new Product();
		User user=new User();
		
		user.setUserId(2);
		user.setUserName("Bhantu");
		user.setUsertype(Details.AFFILIATE );
		user.setRegistrationDate(LocalDate.now());
		
		product.setProductId(182938);
		product.setProductName("SALT Packet");
		product.setProductType(Items.GROCERIES);
		product.setQuantity(1);
		product.setRatePerQuantity(20);
		list.add(product);
		
		product1.setProductId(10037282);
		product1.setProductName("Sweet Corn");
		product1.setProductType(Items.FROGENFOODS);
		product1.setQuantity(3);
		product1.setRatePerQuantity(155);
		list.add(product1);
		
		user.setProduct(list);
		double bill=retail.calculateBill(user);
		System.out.println(bill);
		assertEquals(185, bill);
		
	}


}
