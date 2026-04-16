package basic.question04;

import java.io.IOException;

/**
 * 第7章 配列
 */

public class Question04_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		int[] agegroup = new int[5];
		agegroup[0] = 12;
		agegroup[1] = 18;
		agegroup[2] = 24;
		agegroup[3] = 19;
		agegroup[4] = 20;

		System.out.println("3番目の人の年齢は" + agegroup[2] + "歳です。");

	}

}
