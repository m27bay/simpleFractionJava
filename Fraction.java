public class Fraction {
    private int a;
	private int b;
	
	Fraction(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Fraction() {
		this.a = 1;
		this.b = 1;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}


	@Override
	public String toString() {
		return this.a + "/" + this.b;
	}

	private int pgcd(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}

		return b;
	}

	public Fraction sommes(Fraction f, Fraction f2) {
		if(f.getB() != f2.getB()) {
			int a, b;
			a = f.getA() * f2.getB() + f2.getA() * f.getB();
			b = f.getB() * f2.getB();
			
			int pgcd = f.pgcd(a, b);
			a /= pgcd;
			b /= pgcd;

			return new Fraction(a, b);
		}
		else {
			return new Fraction(f.getA() + f2.getA(), f.getB());
		}
	}
}
