package aulas;

public class B extends A{

	private int z;
	
	public B(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	public int soma(){
		return super.soma()+z;
	}
	public float media(){
		return this.soma()/3f;
	}
}
