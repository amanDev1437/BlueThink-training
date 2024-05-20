@FunctionalInterface
interface Showable {
    void show(int i);
}

@FunctionalInterface
interface Watchable{
    int watch(int n1, int n2);
}

public class TestThree {
    public static void main(String[] args) {
        Showable obj = i -> System.out.println("Inside show:"+5);
        obj.show(5);

        Watchable w = (a,b) -> a+b;
        System.out.println(w.watch(15,10));

    }
}


