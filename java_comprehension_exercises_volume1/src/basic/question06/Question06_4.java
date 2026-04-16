package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amountBooks = 0;
		//本の冊数
		int sellFlag = 0;
		//本を売却するかの判定
		int bookPrice = 200;
		//ほんの値段
		System.out.println("本を売却します");

		do {
			amountBooks += 1;
			System.out.println("売却する本の冊数を1つ増やしますか？");
			System.out.println("はい：0、いいえ：1");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String sellFlagString = reader.readLine();
			sellFlag = Integer.parseInt(sellFlagString);

		} while (sellFlag == 0);

		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + amountBooks * bookPrice + "円です。");

	}

}
