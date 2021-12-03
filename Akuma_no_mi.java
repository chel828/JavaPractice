// 悪魔の実を選ぶ。

import java.util.Scanner;

public class Akuma_no_mi {

    public void akuma() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("(/・ω・)/");
        System.out.println("突然、4つの宝箱が現れた。");
        System.out.println("どれかを選ばないと、先に進めないみたいだ。");

        try {

            while (true) { // 入力ミスをしたら、やり直し。

                System.out.println("どの箱を選ぶ？( 1 / 2 / 3 / 4 ）");
                String box = scanner.nextLine();

                // if文で条件分岐
                if (box.equals("1")) {

                    System.out.println("【 超人系（パラミシア）：キビキビの実 】が出てきた！！");
                    break;

                } else if (box.equals("2")) {

                    System.out.println("【 超人系（パラミシア）：ニュキニュキの実 】が出てきた！！");
                    break;

                } else if (box.equals("3")) {

                    System.out.println("【自然系（ロギア）：メラメラの実 】が出てきた！！");
                    break;

                } else if (box.equals("4")) {

                    System.out.println("【 動物系（ゾオン）：クモクモの実≪ロサミガレ・グラウボゲリィ<古代種>≫ 】が出てきた！！");
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
