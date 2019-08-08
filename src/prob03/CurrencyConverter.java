package prob03;

public class CurrencyConverter {
	private static double rate;
	
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate; // static 이므로 this 가 안되니 클래스명을 붙여서 충돌 방지
	}
	public static double toDollar(double dollar) {
		return dollar/rate;
	}
	public static double toKRW(double krw) {
		return rate * krw;
	}
}
