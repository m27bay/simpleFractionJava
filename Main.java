public class Main {
    static void printf(String mString) {
        System.out.println(mString);
    }
    public static void main(String[] args) {
        Fraction f = new Fraction(1,4);
        Fraction f2 = new Fraction(1,2);
		printf(f.toString());
		printf(f2.toString());
		Fraction f3 = f.sommes(f, f2);
		printf(f3.toString());
    }
}