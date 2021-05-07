package main.chap04;

public class Min4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Min4[] m4a = new Min4[20];
        int x = 0;
        while (x < 9) {
            m4a[x] = new Min4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 5) {
            Min4 m4 = new Min4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
