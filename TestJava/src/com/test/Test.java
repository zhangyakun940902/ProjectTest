package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Test {

	public static void main(String[] args) {
		
		double rate = divide(1.878065747E9,9434.9,4);
  
		
		//double busiincome = 24370*10000;

		System.out.println(rate);
	}
	
	
	public static Double divide(double dividend, double divisor, int length) {
		try {
			if (dividend == 0) {
				return 0D;
			}
			BigDecimal big = new BigDecimal(divisor);
			double d = big.divide(new BigDecimal(dividend), length,
					RoundingMode.HALF_UP).doubleValue();
			return d;
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
