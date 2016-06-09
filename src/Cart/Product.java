package Cart;

import java.io.Serializable;

public class Product implements Serializable{
	 public String pid;
	    public String pname;
	    public int qty;
	    public double price;
	 
	    public Product(){}
	    public Product(String pid, String pname, int qty, double price) {
	        this.pid = pid;
	        this.pname = pname;
	        this.qty = qty;
	        this.price = price;
	    }
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	    
}
