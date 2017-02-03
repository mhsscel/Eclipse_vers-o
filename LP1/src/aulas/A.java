package aulas;

public class A implements I{
	private  int x;
	private int y;
	
	public A(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int soma(){
		return x+y;
	}
	public float media(){
		return this.soma()/2f;
	}
}
