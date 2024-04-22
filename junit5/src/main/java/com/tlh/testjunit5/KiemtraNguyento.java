package com.tlh.testjunit5;

public class KiemtraNguyento {
    public static boolean ktnt(int n) {
		if (n>=2) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			return true;
			}
		}
		return true;
	}

}
