package aulas;

public class C implements I{

	private int lista[];
	
	public C(int lista[]){
		this.lista = lista;
	}
	
	public int soma(){
		int soma=0;
		for(int x : this.lista ){
			soma+=x;
		}
		return soma;
	}
	public float media(){
		return (float)this.soma()/this.lista.length;
	}
}
