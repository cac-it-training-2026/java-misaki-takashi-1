package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int basePrice = 1200;
		//通常料金を意味する
		int tickets = 3;
		//チケットの購入間数を意味する
		int reducePrice = basePrice - 200;
		//最終的な価格を意味する
		int reducetickets = tickets--;
		int totalPrice = reducePrice * reducetickets;
		//税抜き価格
		double taxRate = 1.1;
		//税率
		int totalWithTax = (int) ((int) totalPrice * taxRate);

		System.out.println("購入可能枚数は" + reducetickets + "枚です。");
		System.out.println("値下げ後の1枚当たりの料金は" + reducePrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "です。");

	}
}
