package FactoryPattern;

public abstract class ShoppingMall{

	public Shopping shopping(String category) {
		Shopping shopping = selectCategory(category);
		shopping.find();
		shopping.cart();
		shopping.order();
		shopping.check();
		return shopping;
	}

	abstract Shopping selectCategory(String category);
}
