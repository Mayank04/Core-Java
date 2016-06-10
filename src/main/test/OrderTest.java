package main.test;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import Cart.Order;
import Cart.Product;

public class OrderTest {

	@Test
	public void testAddProductToOrder() {
		Order o = new Order("Mayank");
        Product product1 = new Product("Banana","Banana",12,120);
        Product product2 = new Product("Apple","Apple",2,60);
        Product product3 = new Product("Lemon","Lemon",12,50);
        Product product4 = new Product("Orange","Orange",2,70);
        Product product5 = new Product("Peach","Peach",2,80);
        Product product6 = new Product("Peach","Peach",6,240);
		o.addProduct(product1);
		o.addProduct(product2);
		o.addProduct(product3);
		o.addProduct(product4);
		o.addProduct(product5);
		o.addProduct(product6);
		Assert.assertEquals(5, o.productCount());
	}
	
	@Test
	public void testGetPrice(){
		Order o = new Order("Mayank");
		Product product1 = new Product("Banana","Banana",12,120);
		o.addProduct(product1);
		double d;
		d = getCartDetailsss(o);
		int result = (int)d;
		Assert.assertEquals(120,result);
	}
	
	public double getCartDetailsss(Order o){
        double price;
        price = o.getCartPrice();
		return price ;
    }
}
