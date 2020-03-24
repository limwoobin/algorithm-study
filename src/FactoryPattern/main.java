package FactoryPattern;

public class main {

	public static void main(String[] args) {
		ShoppingMall timon = new Timon();
		Shopping vitamin = timon.shopping("Health");
		Shopping chickenBreast = timon.shopping("Food");

		ShoppingMall coupang = new Coupang();
		Shopping egg = coupang.shopping("Food");
		Shopping omega = coupang.shopping("Health");

	}
}
