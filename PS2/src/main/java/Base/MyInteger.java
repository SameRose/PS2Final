package Base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {

		setiValue(iValue);

	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {

			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		return !isEven();
	}

	public boolean isPrime() {
		for (int num = 2; num < iValue; num++) {
			if (iValue % num == 0) {
				return false;

			}
		}

		return true;

	}
	
	public static boolean isEven(int i) {
		if (i % 2 == 0) {

			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int i) {
		return !isEven(i);
	}

	public static boolean isPrime(int i) {
		for (int num = 2; num < i; num++) {
			if (i % num == 0) {
				return false;

			}
		}

		return true;

	}
	
	public static boolean isEven(MyInteger m ) {
		if (m.getiValue() % 2 == 0) {

			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger m) {
		return !isEven(m);
	}

	public static boolean isPrime(MyInteger m) {
		for (int num = 2; num < m.getiValue(); num++) {
			if (m.getiValue() % num == 0) {
				return false;

			}
		}

		return true;

	}
	
	public boolean equals(int i) {
		
		if(i == iValue) {
		return true;}
		return false;
	}
	
	public boolean equals(MyInteger m) {
		
		return equals(m.getiValue());
	}

}
