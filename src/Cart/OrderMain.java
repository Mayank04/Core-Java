package Cart;

import java.util.Iterator;

public class OrderMain {
	public static void main (String[] s) throws Exception {
		 
        Order o = new Order("Mayank Sharma");
        o.addProduct(new Product("Banana","Banana",12,120));
        o.addProduct(new Product("Apple","Apple",4,140));
        o.addProduct(new Product("Lemon","Lemon",8,140));
        o.addProduct(new Product("Orange","Oranges",6,140));
        o.addProduct(new Product("Peach","Peaches",3,140));
 
        System.out.println("\nNo. of Product : "+o.productCount());
        System.out.println ("Order Places By: "+o.uid);
 
        System.out.println (o.getCartPrice());
        final Iterator it = o.getCartDetails().iterator();
        while(it.hasNext()){
            System.out.println (it.next());
        }
    }
}
