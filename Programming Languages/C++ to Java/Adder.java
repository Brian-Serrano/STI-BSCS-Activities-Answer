package Main;

public class Adder {
    private int total;

    public Adder(int a) {
        total = a;
    }

    public Adder() {
        total = 0;
    }

    public void addNum(int number) {
        total += number;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Adder a = new Adder();
        a.addNum(10);
        a.addNum(20);
        a.addNum(30);
        System.out.println("Total: " + a.getTotal());
    }
}
