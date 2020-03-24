package FactoryPattern;

public class TimonHealthCategory implements Shopping{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("비타민C 찾기");
	}

	@Override
	public void cart() {
		// TODO Auto-generated method stub
		System.out.println("비타민C 카드에 담기");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("비타민C 주문하기");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("비타민C 확인하기");
	}

}
