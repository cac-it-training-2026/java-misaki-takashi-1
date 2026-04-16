package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amount = 0;
		//鉛筆の個数
		int price = 100;
		//鉛筆の値段

		System.out.println("鉛筆を購入しますか？");
		System.out.println("はい：0、いいえ：1＞");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String buyFlagString = reader.readLine();
		int buyFlag = Integer.parseInt(buyFlagString);

		while (buyFlag == 0) {
			amount += 1;
			System.out.println("購入する鉛筆の本数を1つ増やしますか？");
			System.out.println("はい：0、いいえ：1");

			String buyFlagString2 = reader.readLine();
			buyFlag = Integer.parseInt(buyFlagString2);
		}

		System.out.println("購入した鉛筆の本数は" + amount + "本です。");

	}
}
