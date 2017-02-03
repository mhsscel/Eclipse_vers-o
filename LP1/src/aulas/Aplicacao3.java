package aulas;

public class Aplicacao3 {
	public static void main(String args[]){
		I listaI[] = new I[3];
		int lista[] = {10,40,30,50};
		listaI[0] = new A(10,20);
		listaI[1] = new B(10,20,30);
		listaI[2] = new C(lista);
		for(I i: listaI){
			System.out.println("Soma lista = "+i.soma());
			System.out.println("Media lista = "+i.media()+"\n");
		}	
	}
}

