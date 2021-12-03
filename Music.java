//おすすめの曲を教える。

import java.util.Scanner;
import java.util.Random;

public class Music {

    public void music() {

        // 配列
        String[] happy = { "♪きらり/藤井風", "♪虹/SUPER BEAVER", "♪俺たちの明日/エレファントカシマシ", "♪バンザイ/ウルフルズ", "♪ピカチュウのうた/ピカチュウ" };
        String[] angry = { "♪何なんｗ/藤井風", "♪アボカド/yonige", "♪F/マキシマム ザ ホルモン", "♪罪と罰/椎名林檎", "♪おとなの掟/Doughnuts Hole" };
        String[] sad = { "♪202 feat.泉まくら/ラブリーサマーちゃん", "♪me time feat.Aile The Shota/SKY-HY", "三文小説/King Gnu",
                "♪獣ゆく細道/椎名林檎と宮本浩次", "♪プラネタリウム/大塚愛" };
        String[] funny = { "♪ハッピーポンコツ/キュウソネコカミ", "♪Shining One/BE:FIRST", "Gifted/BE:FIRST",
                "Plankton/millennium parade", "♪今夜はブギー・バックfeat.清水翔太&SHUN/加藤ミリヤ" };

        try { // 選んだ気分によって、おすすめの曲を提供。

            while (true) { // 入力ミスしたら、やり直しできるようにする。

                System.out.println("今の気分は？( 喜/怒/哀/楽 ）");
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                // 配列の中身をランダムに出力。
                int h = random.nextInt(5);
                int a = random.nextInt(5);
                int s = random.nextInt(5);
                int f = random.nextInt(5);
                String feel = scanner.nextLine();

                // if文で条件分岐。
                if (feel.equals("喜")) {

                    System.out.println("今のあなたにおすすめの曲は、" + happy[h]);
                    System.out.println("是非、聴いてみてね。");
                    System.out.println("きっと、もっとhappyになれるはず(●´ω｀●)");
                    System.out.println("それでは、素敵な旅にしてくださいませ♪");

                    break;

                } else if (feel.equals("怒")) {

                    System.out.println("今のあなたにおすすめの曲は、" + angry[a]);
                    System.out.println("是非、聴いてみてね。");
                    System.out.println("きっと、あなたの心を代弁してくれるはず。");
                    System.out.println("それでは、穏やかな旅を♪");

                    break;

                } else if (feel.equals("哀")) {

                    System.out.println("今のあなたにおすすめの曲は、" + sad[s]);
                    System.out.println("是非、聴いてみてね。");
                    System.out.println("きっと、あなたの心を癒してくれるでしょう。");
                    System.out.println("もしかしたら、素直に涙も流せたりもするかも。。？");
                    System.out.println("それでは、あなたの旅路に素敵な花が咲きますように♪");

                    break;

                } else if (feel.equals("楽")) {

                    System.out.println(funny[f]);
                    System.out.println("是非、聴いてみてね。");
                    System.out.println("きっと、今日は最高な一日になりますよ♪");
                    System.out.println("それでは、良い旅を続けてくださいね♪");

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
