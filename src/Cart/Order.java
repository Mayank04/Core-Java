package Cart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Order implements OrderTask{
	public String uid;
    private Map<String, Product> map;
    private List<String> products = null;
    
    public Order(){}
    public Order(String uid){
        this.uid=uid;
        map = new HashMap<String, Product>();
    }//Order
    
    	public List<String> productsAvailable(){
    		List<String> prdts = new ArrayList<String>();
    		prdts.add("Banana");
    		prdts.add("Apple");
    		prdts.add("Orange");
    		prdts.add("Lemon");
    		prdts.add("Peach");
    		return prdts;
    	}
 
    public boolean addProduct(Product p){
    	products = new ArrayList<String>(productsAvailable());
    	        if (products.contains(p.getPid())){
    	        	if(map.containsKey(p.getPid())){
    	                Product p1 = map.get(p.getPid());
    	                p1.setPrice(p1.getPrice()+p.getPrice());
    	                p1.setQty(p1.getQty()+p.getQty());
    	                return true;
    	            }
    	            map.put(p.getPid(),p);
    	        }
        return false;
    }//addProduct

    public Collection getCartDetails(){
        return map.values();
    }
 
    public int productCount(){
        return map.size();
    }
 
  public double getCartPrice() {
    double price = 0.0d;
    Iterator iterator = getCartDetails().iterator();
    while(iterator.hasNext()){
      price+= ((Product) iterator.next()).getPrice();
    }
    return price;
  }
}

