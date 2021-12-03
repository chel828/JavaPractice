// またね！を、（日・英・仏）で。

public class Greething2 {

    public void byebye() {

        String[] str = { "またね！ありがとう！", "Thank u! See u next time♪", "Merci beaucoup! Au revor♪" };

        int num = (int) (Math.random() * (str.length));

        System.out.print(str[num]);

    }
}
