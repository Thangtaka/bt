package b3.th.lth;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;

	public class Order {
	    private int orderID;
	    private LocalDate orderDate;
	    private List<OrderDetail> lineItems;

	    
	    public Order() {
	        lineItems = new ArrayList<>();
	    }

	   
	    public Order(int orderID, LocalDate orderDate) {
	        this.orderID = orderID;
	        this.orderDate = orderDate;
	        lineItems = new ArrayList<>();
	    }

	    
	    public int getOrderID() {
	        return orderID;
	    }

	    public void setOrderID(int orderID) {
	        this.orderID = orderID;
	    }

	    
	    public LocalDate getOrderDate() {
	        return orderDate;
	    }

	    public void setOrderDate(LocalDate orderDate) {
	        this.orderDate = orderDate;
	    }

	    public List<OrderDetail> getLineItems() {
	        return lineItems;
	    }
	    
	    public void addLineItems(Product product, int quantity) {
	        lineItems.add(new OrderDetail(quantity, product));
	    }

	    public double calcTotalCharge(int n) {
	        double totalCharge = 0;
	        int count = 0;
	        for (int i = n; count < lineItems.size(); i++) {
	            OrderDetail orderDetail = lineItems.get(count);
	            totalCharge += orderDetail.calcTotalPrice();
	            count++;
	        }
	        return totalCharge;
	    }

		@Override
		public String toString() {
			return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + "]";
		} 
	}
public class OrderDetail {
	private int quantily;
	private Product product;
	
	public OrderDetail(int quantily, Product product) {
		super();
		this.quantily = quantily;
		this.product = product;
	}

	public int getQuantily() {
		return quantily;
	}

	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderDetail [quantily=" + quantily + ", product=" + product + "]";
	}
	
	public double calcTotalPrice() {
		return quantily * product.getPrice();
		
	}
}
public class Product {
	private String des;
	private String productID;
	private double price;
	public Product() {
		
	}
	public Product(String des, String productID, double price) {
		this.des = des;
		this.productID = productID;
		this.price = price;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [des=" + des + ", productID=" + productID + ", price=" + price + "]";
	}
	

}
public class Test {
	    public static void main(String[] args) {
	        Product product1 = new Product("Nước tương", "sp4", 8000);
	        Product product2 = new Product("Gạo", "sp1", 18000);
	        Product priduct3 = new Product("Đường", "sp3", 10000);
	        Product product4 = new Product("Gạo", "sp1", 18000);
	        Product product5 = new Product("Muối", "sp5", 10000);
	        Product product6 = new Product("Bột ngọt", "sp6" , 5000);

	        Order order = new Order(1, LocalDate.of(2023, 5, 15));
	        
	        order.addLineItems(product1, 10);
	        order.addLineItems(product2, 5);
	        order.addLineItems(priduct3, 1);
	        order.addLineItems(product4, 1);
	        order.addLineItems(product5, 2);	
	        order.addLineItems(product6, 1);
	        
	        System.out.println("Mã hóa đơn: " + order.getOrderID());
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String formattedDate = order.getOrderDate().format(dateFormatter);
	        System.out.println("Ngày lập hóa đơn: " + formattedDate);
	        System.out.println("STT       |  Mã Sp   |         Mô tả         |     Đơn giá     |     Số lượng    |    Thành tiền");

	        DecimalFormat decimalFormat = new DecimalFormat("#,### VND");
	        List<OrderDetail> lineItems = order.getLineItems();
	        int stt = 1;
	        for (OrderDetail orderDetail : lineItems) {
	            System.out.printf("%-10s|  %-8s|   %-20s|  %-15s|  %-15s|  %-15s\n",
	                    stt,
	                    orderDetail.getProduct().getProductID(),
	                    orderDetail.getProduct().getDes(),
	                    decimalFormat.format(orderDetail.getProduct().getPrice()),
	                    orderDetail.getQuantily(),
	                    decimalFormat.format(orderDetail.calcTotalPrice()));
	            stt++;
	        }

	        System.out.println("Tổng tiền thanh toán: " + decimalFormat.format(order.calcTotalCharge(0)));
	    }
	}





