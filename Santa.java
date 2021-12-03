// クリスマスイベント in アラバスタ用の継承クラス。

class Santa {

    private String name;
    private String hope;

    // コンストラクタ
    public Santa(String name, String hope) {

        this.name = name;
        this.hope = hope;
    }

    // あなたの名前を調べる
    public String getName() {

        return name;
    }

    // あなたの願いを調べる
    public String getHope() {

        return hope;
    }

    // 調査結果
    public void introduce() {

        System.out.println("♡ あなたの名前は、" + name + "。");
        System.out.println("♡ あなたの願いは、" + hope + "。");

    }

}