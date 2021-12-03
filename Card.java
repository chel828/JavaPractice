// High & Low。
// 【 参考： https://teacher-it-akiho817.hatenablog.com/entry/2020/04/20/205058 】

import java.util.Scanner;

public class Card {

	public void HandL() {

		System.out.println("ココロばあさんとフランキー一家に出会った！！ひと遊びしてから船に戻ろう！");
		System.out.println("************");
		System.out.println("*High & Low*");
		System.out.println("************");
		System.out.println("");

		Scanner scanner = new Scanner(System.in);

		while (true) { // 乱数の作成処理

			int leftCard = (int) (Math.random() * 9) + 1; // 1～13までの数値を生成し、元値とする。
			int rightCard = (int) (Math.random() * 9) + 1; // 1～13までの数値を生成し、比較値とする。

			System.out.println(" [問題表示] ");
			System.out.println("*****    *****");
			System.out.println("*   *    * * *");
			System.out.println("* " + leftCard + " *    * * *");
			System.out.println("*   *    * * *");
			System.out.println("*****    *****");
			System.out.println(" High  or  Low?(H/L)>"); // 元値と比較値どちらが大きいですか。

			String select = scanner.nextLine();

			// H or L を選ぶ。
			if (select.equals("H")) {

				System.out.println("→Highを選択しました。");

			} else if (select.equals("L")) {

				System.out.println("→Lowを選択しました。");

			} else {

				System.out.println("正しい文字を入力してください。");
			}

			System.out.println("");
			System.out.println("  [結果表示]  ");
			System.out.println("*****    *****");
			System.out.println("*   *    * * *");
			System.out.println("* " + leftCard + " *    * " + rightCard + " *");
			System.out.println("*   *    * * *");
			System.out.println("*****    *****");

			String result = null;

			// 答え合わせ。
			if (leftCard < rightCard) {

				result = "H";

			} else if (leftCard > rightCard) {

				result = "L";

			} else {

				result = select;

			}

			// 勝敗を決める。
			if (select.equals(result)) {

				System.out.println("→You Win!!!!");

			} else {

				System.out.println("→You Lose...");

				System.out.println("--ゲーム終了--");
				System.out.println("---See you again ♪---");

				System.out.println("★ ★ ☆ ☆ ★ ☆ ★ ☆ ☆ ★ ★ ☆ ★ ☆ ☆ ★ ★");

				break;

			}
		}
	}
}