package FactoryPattern;

public class Timon extends ShoppingMall{

	@Override
	Shopping selectCategory(String category) {
		// TODO Auto-generated method stub

		System.out.println("--------------TIMON-----------");

		if(category.equals("Food")) {
			return new TimonFoodCategory();
		}else if(category.equals("Health")) {
			return new TimonHealthCategory();
		}
		return null;
	}

}
