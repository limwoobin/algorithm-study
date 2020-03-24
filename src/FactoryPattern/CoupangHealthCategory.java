package FactoryPattern;

public class CoupangHealthCategory implements Shopping{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("오메가3 찾기");
	}

	@Override
	public void cart() {
		// TODO Auto-generated method stub
		System.out.println("오메가3 카드에 담기");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("오메가3 주문하기");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("오메가3 확인하기");
	}

}
