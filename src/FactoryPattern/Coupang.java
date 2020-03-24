package FactoryPattern;

public class Coupang extends ShoppingMall{

	@Override
	Shopping selectCategory(String category) {
		System.out.println("--------------COUPANG-----------");
		// TODO Auto-generated method stub
		if(category.equals("Food")) {
			return new CoupangFoodCategory();
		}else if(category.equals("Health")) {
			return new CoupangHealthCategory();
		}
		return null;
	}
}
