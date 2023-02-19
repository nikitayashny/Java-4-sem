package by.belstu.it.yashny;

public class TextFunction {
    public int getValue(int n) {
        n++;
        return n;
    }

    public TextFunction() {
    }
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int onCreate()
    {
        for (int count = 0; count < 10; count++) {
            System.out.println("Counter "+count);
        }
        return 0;
    }
}
