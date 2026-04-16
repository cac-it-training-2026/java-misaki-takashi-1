package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String itemNames[] = new String[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {

			System.out.println(i + 1 + "つ目の商品名を入力してください。");

			itemNames[i] = reader.readLine();
		}

		int prices[] = new int[5];

		for (int i = 0; i < prices.length; i++) {

			System.out.println(i + 1 + "つ目の商品の単価を入力してください。");

			String pricesstring = reader.readLine();
			prices[i] = Integer.parseInt(pricesstring);
		}

		for (int i = 0; i < 5; i++) {

			System.out.println(i + 1 + "つ目の商品" + itemNames[i] + "は" + prices[i] + "円です。");

		}

	}

}
