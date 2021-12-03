//仲間を選ぶ。

import java.util.Scanner;

public class Member {

    String str;

    public void nakama() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("今度は、4つの扉が現れた。");
        System.out.println("運命の別れ道は、一度しか選べない。");

        try {

            while (true) { // 入力ミスをしたら、やり直し。

                System.out.println("さぁ、どの道を選ぶ？好きな扉を開けてみよう！( A / B / C / D ）");

                str = scanner.nextLine();

                // if文で条件分岐
                if (str.equals("A")) {

                    System.out.println(
                            "ドフラミンゴが待ち構えていた！！どうやら君を気に入ったらしい！ピーカ、シュガー、セニョール・ピンクも迎えに来てくれたよ！強制的に、ドンキホーテファミリーへ仲間入りだ！");
                    System.out.println("ログポースは、カマバッカ王国を指している...！行ってみよう...！");
                    break;

                } else if (str.equals("B")) {

                    System.out.println("そこには、ゾロが待っていた！！迷子になるのを心配して、ペローナとウソップもついてきた！");
                    break;

                } else if (str.equals("C")) {

                    System.out.println("なんと、バギーに迎えられた！！Mr.3、アルビダ、ガイモンも一緒に、今日から君も、バギーズデリバリー♪");
                    System.out.println("ログポースは、ジャヤを指している。みんなで行ってみよう☆");
                    break;

                } else if (str.equals("D")) {

                    System.out.println("ルフィがうずうずしながら待っていた！！何故か後方にハンコックを発見！（しかし、ルフィは気が付いていないようだ...！）");
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
