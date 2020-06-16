package test;

public class test {
	public static void main(String[] args) {
		String[] arr = {"10" , "a10"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			} catch (NumberFormatException e) {
				System.out.println("숫자변환 불가");
			} finally {
				System.out.println(value);
			}
		}
	}
}