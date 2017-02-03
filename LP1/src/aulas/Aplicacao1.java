package aulas;

public class Aplicacao1 {

	public static void main(String[] args) {
		A a;
		a = new A(10,20);
		System.out.println("Soma A = " + a.soma());
		System.out.println("Media A = "+ a.media());
	
		I i;
		i = new B(10,20,30);
		System.out.println("\nSoma B = "+i.soma());
		System.out.println("Media B = "+i.media());
		
		}
	}

