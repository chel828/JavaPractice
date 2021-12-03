// クリスマスイベント in アラバスタ -クリスマスツリー編-
// 【 参考：https://teratail.com/questions/156686 】

public class Xmas {

    public void xmas() {

        System.out.println("アラバスタに到着...！");
        System.out.println("ビビ、カルー、クンフージュゴン達が、お出迎えしてくれたよ！");
        System.out.println("さぁ、みんなでクリスマスパーティだ♪");

        // てっぺんに星を付ける。
        System.out.print(".□○□.□○□.□○□..□○□.□○□.□○□.□○□.□○□.°");
        System.out.println(".★ 彡");

        for (int i = 4; i >= 2; i--) { // ツリーを作成。

            for (int j = i; j >= i - 2; j--) {

                print_square(j, (-2 * j + 9));

            }

        }

        print_square(4, 1);
        print_square(4, 1);

    }

    public static void print_square(int a, int b) {

        for (int i = 0; i < a; i++) { // ツリー前の空白を、クリスマスっぽく、可愛く。

            System.out.print(".□○□");
            System.out.print(".□○□");

        }
        for (int i = a; i < a + b; i++) { // ツリーの部分を、よりクリスマスっぽく、豪華に。

            System.out.print(".▲▼▲");
            System.out.print(".▲▼▲");
        }

        System.out.println();
    }

}
