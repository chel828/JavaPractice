//ジャヤ島に行った人向けの、チェリーパイイベント

import java.util.Scanner;

public class Question {

  public void question() {

    Scanner scanner = new Scanner(System.in);

    try {

      while (true) { // 入力ミスをしたら、やり直し。

        System.out.println("ジャヤに到着♪");
        System.out.println("西にあるモックタウンの酒場に入り、チェリーパイを頼んだ。");
        System.out.println("チェリーパイのお味は、如何でしたか？(美味しかった。/不味かった。）");

        String tast = scanner.nextLine();

        // if文で条件分岐。
        if (tast.equals("美味しかった。")) {

          System.out.println("黒ひげと気が合いそうですね。");
          break;

        } else if (tast.equals("不味かった。")) {

          System.out.println("ルフィと気が合いそうですね。");
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