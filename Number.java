//空島に行った人は、サトリの数当てゲーム
// 【 参考：https://ict-skillup.com/java/2595/ 】

import java.util.Random;
import java.util.Scanner;

public class Number {

    public void number() {

        System.out.println("ついに、到着してしまった...。カマバッカ王国に...");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // コンピュータの答えを作成。
        int randomNumber = random.nextInt(1001);

        System.out.println("ヒーハー！ヴァナタ、よくぞヴァターシの所へ来てくれたっちゃブルね ★ ここは、数当ての間。");
        System.out.println("0から1000まで数字を入力して、7回以内で当ててみなさンナ☆彡（野生のイワンコフが飛び出してきた。）");

        int number = scanner.nextInt();

        int i; // 初期値

        final int LIMIT = 8;

        for (i = 0; i <= LIMIT; i++) {

            int th = i + 2;

            if (th == LIMIT) { // ---gameover---

                System.out.println(LIMIT + "回目。残念、ゲームオーバッシブル！正解は" + randomNumber + "！！！");
                break;

            } else { // 答え合わせ。

                if (number > randomNumber) { // 大き杉。

                    System.out.print("残念！もっと小さい数字をいれておっシブル！");
                    System.out.println("もう一度頑張ってみよ！" + th + "回目の挑戦。");

                    number = scanner.nextInt();

                } else if (number < randomNumber) { // 小さ杉。

                    System.out.print("ヒーハー！もっと大きい数字を入れておっシブル！！");
                    System.out.println("残念。もう一度。チャンスをあげタッチャッシブル ★" + th + "回目の挑戦。");

                    number = scanner.nextInt();

                } else if (number == randomNumber) { // 大き杉。

                    System.out.println("ﾝﾝﾝﾝヒーハー！お見事。僅か" + (i + 2) + "回で辿り着くとは...。完全にヴァナタを、侮っていたわね。");
                    break;

                }

            }

        }
    }
}