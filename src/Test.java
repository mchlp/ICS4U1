public class Test {

    protected int a = 10;

    void talk() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        TestChild[] arr = new TestChild[5];
        for (int i=0; i<5; i++) {
            arr[i] = new TestChild();
        }
        for (int i=0; i<5; i++) {
            arr[i].eat();
        }
        TestChildChild testChildChild = new TestChildChild();
        System.out.println(testChildChild.a);
    }
}

class TestChild extends Test {

    void talk() {
        System.out.println("test child");
    }

    void eat() {
        System.out.println("eating");
    }
}

class TestChildChild extends TestChild {
}
