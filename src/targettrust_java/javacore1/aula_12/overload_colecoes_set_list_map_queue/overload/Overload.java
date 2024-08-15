package overload;

public class Overload {

    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    public String concatenar(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Overload cal = new Overload();

        int result = cal.soma(1, 2);
        System.out.println("result: " + result);

        double result2 = cal.soma(2, 3);
        System.out.println("result2: " +result2);

        int result3 = cal.soma(3, 4,6);
        System.out.println("result3: " + result3);

        String result4 = cal.concatenar("Hello", " World");
        System.out.println("result4: " + result4);
    }

}
