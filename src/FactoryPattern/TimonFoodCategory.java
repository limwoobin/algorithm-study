package FactoryPattern;

public class TimonFoodCategory implements Shopping {

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("닭가슴살 찾기");
	}

	@Override
	public void cart() {
		// TODO Auto-generated method stub
		System.out.println("닭가슴살 카드에 담기");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("닭가슴살 주문하기");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("닭가슴살 확인하기");
	}
}
