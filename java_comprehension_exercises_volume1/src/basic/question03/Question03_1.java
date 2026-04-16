package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_1 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int price = 30;
		int totalBudget = 300;
		//購入予算を意味する
		int quantity = totalBudget / price;
		//購入個数を意味する
		System.out.println("商品の購入数は" + quantity + "です。");

	}
}
