package mx.edu.itlapiedad;

public class Triangulo {

	private int base, altura;

	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Triangulo() {
		super();
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public float getArea() {
		return base  * altura /2;		
	}
}
