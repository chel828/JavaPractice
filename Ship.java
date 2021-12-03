//ルフィかゾロなら船を選ぶ。

import java.util.Scanner;

public class Ship {

    String ship = ""; // 初期値の設定。

    public void fune() {

        Scanner scanner = new Scanner(System.in);

        try {

            while (true) { // 入力ミスをしたら、やり直し。

                System.out.println("どの船で行く？( M / S ）");
                ship = scanner.nextLine();

                // if文で条件分岐
                if (ship.equals("M")) {

                    System.out.println("あなたが選んだのは、ゴーイング・メリー号！！と、サンジとロビン！");
                    System.out.println("さぁ、アラバスタへ行こう！！！");

                    break;

                } else if (ship.equals("S")) {

                    System.out.println("あなたが選んだのは、サウザンド・サニー号！！と、ナミとチョッパー！");
                    System.out.println("さぁ、行こう！ウォーターセブンへ！！");

                    break;

                } else {

                    System.out.println("正しい文字を入力してください。");

                }

            }

        } catch (Exception e) { // エラー（Exception）発生時のみ

            e.printStackTrace();

        } finally { // 必ず最後に通る

        }
    }
}
