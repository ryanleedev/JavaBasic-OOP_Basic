
public class PizzaOven {
	
	public static void main(String[] args) {
		
		Pizza p1 = new Pizza("pepperoni", "mushrooms", true, 5, 10.99);
		
//		System.out.print(p1.toString());
		
		Pizza p2 = new Pizza(5);
		
		System.out.println(p2);
		
		Pizza p3 = new Pizza();
		System.out.println(p3);
		
		p3.setFirstTopping("ham");
		p3.setSecondTopping("pineapple");
		p3.setExtraCheese(true);
		p3.setSize(5);
		p3.setPrice(15.99);
		
		System.out.println(p3.toString());
		
		double sumPrice = p1.getPrice() + p3.getPrice();
		System.out.println("sum price of p1, p3 : " + sumPrice);
		
	}

}
