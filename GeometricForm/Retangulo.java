/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE RETANGULO */
public class Retangulo extends Ponto implements Figura {

	private Ponto cimaesq;
	private Ponto cimadir;
	private Ponto baixoesq;
	private Ponto baixodir;
	private float lado;
	private float lado2;

	public String Desenhar() {
		
		return (this.toString());
	
	}
/* POLIMORFISMO DE SOBRECARGA -> CONSTRUTORES */
	Retangulo(){
		this.lado = 0;
		this.lado2 = 0;
		Ponto f = new Ponto(0,0);
		this.cimaesq = f;
		this.cimadir = f;
		this.baixoesq = f;
        this.baixodir = f;
	}

	Retangulo(float lado, float lado2, Ponto x) {
		
		this.lado=lado;
		this.lado2=lado2;
		this.cimaesq = x;
		this.cimadir = new Ponto(x.x+lado2, x.y);
		this.baixoesq = new Ponto(x.x, x.y-lado);
        this.baixodir = new Ponto(x.x+lado2, x.y-lado);		
	
	}

	public double CalcularArea() {
		
		return (this.lado * this.lado2);
	
	}
	//Getters
	public Ponto getCimaesq(){

		return this.cimaesq;
	}

	public Ponto getCimadir(){

		return this.cimadir;
	}

	public Ponto getBaixoesq(){

		return this.baixoesq;
	}

	public Ponto getBaixodir(){

		return this.baixodir;
	}
	//

	public void Mover(float dx, float dy) {
        
        this.cimaesq.moverPonto(dx, dy);
        this.cimadir.moverPonto(dx, dy);
        this.baixoesq.moverPonto(dx, dy);
        this.baixodir.moverPonto(dx, dy);
    
    }

    public void Apagar(){

    	this.lado=0;
    	this.lado2=0;
    	this.cimaesq.apagarPonto(); 
    	this.baixoesq.apagarPonto();
    	this.cimadir.apagarPonto(); 
    	this.baixodir.apagarPonto();

    }
    
    public void Redimensionar(float dxy){
    	
    	this.lado=lado+dxy;
    	this.lado2=lado2+dxy;
    	this.cimaesq.moverPonto(dxy, dxy);
        this.cimadir.moverPonto(dxy, dxy);
        this.baixoesq.moverPonto(dxy, dxy);
        this.baixodir.moverPonto(dxy, dxy);	
    
    }

    public double CalcularPerimetro(){

    	return (2*this.lado)+(2*this.lado2);
    
    }

     public String toString(){
	    return "Retangulo" + " de lados " + this.lado + " e " + this.lado2 + " e vertices " + this.cimaesq.imprimirPonto() + this.cimadir.imprimirPonto() + this.baixoesq.imprimirPonto() + this.baixodir.imprimirPonto();
		
	}

	public boolean equals(Retangulo obj){

		Retangulo aux = (Retangulo)obj;
		if (this.cimaesq.equals(obj.getCimaesq()) && (this.cimadir.equals(obj.getCimadir())) && (this.baixoesq.equals(obj.getBaixoesq())) && (this.baixodir.equals(obj.getBaixodir()))){ 
			return true;
		} else { return false; }
	}

}