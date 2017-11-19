package org.itstep.model;

public class SumWithConversion {
	private int a;
	private int sum;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void CountSum() {
		String[] numArr = Integer.toString(a).split("");
		for (int i =0;i < numArr.length;i++) {
		sum += Integer.parseInt(numArr[i]);
		}
		System.out.println("Сумма цифр числа " +a +" равна "+ sum);
	}
	
}
