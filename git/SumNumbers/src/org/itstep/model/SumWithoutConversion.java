package org.itstep.model;

public class SumWithoutConversion {

	private int a;
	private int sum;
	private int progress = 10;

	public void setA(int a) {
		this.a = a;
	}
	
	public void CountSum() {
		for (int i =0;i < String.valueOf(a).length();i++) {
			if (i == 0) {
				sum += (a%10);
			}else {
				sum += ((a/progress)%10);
				progress *= 10;	
			}
		}
		System.out.println("Сумма цифр числа " +a +" равна "+ sum);
	}
	
}

