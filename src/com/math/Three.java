package com.math;

/**
 * 经典算法题每日演练——第三题 猴子吃桃
 * 
 * @author yang 
 * 猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾就多吃了一个。第二天早上又将剩下的桃子吃了一半，还是不过瘾又多
 * 吃了一个。以后每天都吃前一天剩下的一半再加一个。到第10天刚好剩一个。问猴子第一天摘了多少个桃子？
 */
public class Three {

	public static void main(String[] args) {
		System.out.println("第一天摘的桃子个数是: " + sumPeach(1));
		System.out.println("第一天摘的桃子个数是: " + SumPeachTail(1, 1));
	}

	// 递归
	public static int sumPeach(int day) {
		if (day == 10)
			return 1;
		return 2 * (sumPeach(day + 1) + 1);
	}

	// 尾递归
	public static int SumPeachTail(int day, int total) {
		if (day == 10) {
			return total;
		}
		return SumPeachTail(day + 1, 2 * (total + 1));
	}
}
