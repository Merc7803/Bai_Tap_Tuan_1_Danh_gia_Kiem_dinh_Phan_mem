package com.tlh.testjunit5;

public class Main {
    public static void main(String[] args) {
		int[] a = {2, 3, 5, 6, 4, 8, 9, 11};
		
		int sum = 0;
		for (int x = 0; x <= a.length; x++) {
			if (KiemtraNguyento.ktnt(x) == true)
				sum += x;
		}
		System.out.print(sum);
	}

}