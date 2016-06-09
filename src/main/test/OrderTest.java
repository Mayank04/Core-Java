package main.test;

import org.junit.Assert;
import org.junit.Test;

import Cart.Order;
import Cart.Product;

public class OrderTest {

	@Test
	public void testAddProductToOrder() {
		Order o = new Order("Mayank");
        Product product = new Product("Banana","Banana",12,120);
		o.addProduct(product);
		Assert.assertEquals(1, o.productCount());
	}
	
	@Test
	public void testGetPriceOfProductsOrdered(){
		Order o = new Order("Mayank");
		Product product = new Product("Apple","Apple",2,60);
		o.getCartPrice();
		Assert.assertEquals(1,o.getCartPrice());
	}
}
