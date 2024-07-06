package Class1;
public class ProductOrderMain {
	public static void main(String[] args) {
		
		ProductOrder[] pro = new ProductOrder[3];
		int sum = 0;
		
		pro[0] = new ProductOrder();
		pro[1] = new ProductOrder();
		pro[2] = new ProductOrder();
		
		pro[0].productName = "두부";
		pro[0].price = 2000;
		pro[0].quantity = 2;
				
		pro[1].productName = "김치";
		pro[1].price = 5000;
		pro[1].quantity = 1;
		
		pro[2].productName = "콜라";
		pro[2].price = 1500;
		pro[2].quantity = 2;
		
		for (int i = 0; i < pro.length; i++) {
			System.out.println("상품명: " + pro[i].productName + ", 가격: " + pro[i].price + ", 수량: " + pro[i].quantity);
			sum += pro[i].price * pro[i].quantity;
		}
		System.out.println("총 결제 금액: " + sum);
	}
}
