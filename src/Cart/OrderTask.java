package Cart;

import java.util.Collection;

public interface OrderTask {
	boolean addProduct(Product p);
    Collection getCartDetails();
    int productCount();
  double getCartPrice();
}
