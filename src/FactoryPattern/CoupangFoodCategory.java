package FactoryPattern;

public class CoupangFoodCategory implements Shopping{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("계란 찾기");
	}

	@Override
	public void cart() {
		// TODO Auto-generated method stub
		System.out.println("계란 카드에 담기");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("계란 주문하기");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("계란 확인하기");
	}

}
