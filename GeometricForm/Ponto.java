public class Ponto {
	
	float x,y;

	public Ponto(){
		
		this.x=0;
		this.y=0;
	
	}

	public Ponto(float x, float y){
		
		this.x=x;
		this.y=y;
	
	}
	
	public void moverPonto(float dx, float dy){
		
		x = x+dx;
		y = y+dy;
	
	}

	String imprimirPonto() {
		
		return "("+this.x+","+this.y+")";
	
	}

	public boolean equals(Ponto obj){
		
			Ponto aux = (Ponto)obj;
			if(this.x == obj.x && this.y == obj.y)
				return true;
			else { return false; }
	
	}

	public void apagarPonto(){
		this.x=0;
		this.y=0;
	
	}

	
}