// メインクラス。

import java.util.*;

public class Test { // ONEPIECE-RPG-
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // こんにちは（日・英・仏）
        Greething1 greeting1 = new Greething1();
        greeting1.hello();

        // 悪魔の実を選ぼう♪
        Akuma_no_mi akumanomi = new Akuma_no_mi();
        akumanomi.akuma();

        // 仲間を増やそう♪
        Member member = new Member();
        member.nakama();

        // B・Dを選んだ人は、船を選べるよ★
        String box1 = member.str;

        Ship ship = new Ship();

        if (box1.equals("B") || box1.equals("D")) {

            ship.fune();

        } else if (box1.equals("A")) { // A（ドフラミンゴ）を選んだ人は、カマバッカ王国で数当てゲームイベント発生。

            Space spacedayo = new Space();
            spacedayo.space();

            Number numgame = new Number();
            numgame.number();

        } else if (box1.equals("C")) { // C（バギー）を選んだ人は、ジャヤでチェリーパイイベント発生。

            Space spacedayo = new Space();
            spacedayo.space();

            Question cherry = new Question();
            cherry.question();
        }

        String box2 = ship.ship;

        if (box2.equals("M")) { // B（ゾロ）・D（ルフィ）を選んだ人で、Mの船（メリー号）を選んだ人は、アラバスタで、クリスマスイベント発生。

            Xmas christmas = new Xmas();
            christmas.xmas();

            // サンタさんにみんなの願いを届ける為に、名前と願いを入力してもらうよ♪
            System.out.println("あなたの名前を入力してください。");
            String name = scanner.nextLine();
            System.out.println("あなたの願いを入力してください。");
            String hope = scanner.nextLine();

            Gift present = new Gift(name, hope);

            present.introduce();
            present.getName();
            present.getHope();
            present.merryXmas();

        } else if (box2.equals("S")) { // B（ゾロ）・D（ルフィ）を選んだ人で、Sの船（サニー号）を選んだ人は、ウォーターセブンで、High&Lowイベント発生。

            Card card = new Card();
            card.HandL();
        }

        // ログポースに、あと何日でログが溜まるかを、確認してみよう♪
        TodayCalendar calender = new TodayCalendar();
        calender.log();

        // ここまで遊んでくれたお礼に、今のあなたにおすすめの曲を教えちゃうよ♪
        Music MUSIC = new Music();
        MUSIC.music();

        // またね（日・英・仏）
        Greething2 greething2 = new Greething2();
        greething2.byebye();

    }

}
