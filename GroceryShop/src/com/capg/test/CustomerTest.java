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

class CustomerTest {

	@Test
	void test() {
		
		GroceryShop retail=new GroceryShopImp();
		List<Product> list=new ArrayList<Product>();
		
		Product product=new Product();
		Product product1=new Product();
		
		User user=new User();
		user.setUserId(45);
		user.setUserName("Sarah");
		user.setUsertype(Details.CUSTOMER);
		user.setRegistrationDate(LocalDate.now());
		
		product.setProductId(11234);
		product.setProductName("Eggs");
		product.setProductType(Items.GROCERIES);
		product.setQuantity(12);
		product.setRatePerQuantity(5);
		
		list.add(product);
		
		product1.setProductId(100234);
		product1.setProductName("Chicken Balls");
		product1.setProductType(Items.FROGENFOODS);
		product1.setQuantity(2);
		product1.setRatePerQuantity(260);
		
		list.add(product1);
		user.setProduct(list);
		double bill=retail.calculateBill(user);
		System.out.println(bill);
		assertEquals(190, bill);
}

}
