// こんにちは！を、（日・英・仏）で。

public class Greething1 implements Test2 {

    public void hello() {

        String[] str = { "こんにちは！", "Hello!", "Bonjour!" };

        int num = (int) (Math.random() * (str.length));

        System.out.print(str[num]);

    }
}
