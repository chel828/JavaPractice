//クリスマスイベント in アラバスタ

public class Gift extends Santa {
    // コンストラクタ
    public Gift(String name, String hope) {

        super(name, hope);

    }

    // 調査結果
    public void introduce() {

        System.out.println("★ あなたの名前は、" + getName() + "。");
        System.out.println("★ あなたの願いは、" + getHope() + "。");
        System.out.println("★ いつかきっと叶うように、サンタさんに、届けておくよ ♪");

    }

    public void merryXmas() {

        int random = (int) (Math.random() * 3);

        switch (random) { // メリークリスマス（日・英・仏）

            case 1:

                System.out.println("メリークリスマス ♪");
                break;

            case 2:

                System.out.println("Merry X'mas ★");
                break;

            case 3:

                System.out.println("Joyeux Noël ♪");
                break;

        }
    }
}
