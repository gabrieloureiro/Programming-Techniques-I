public class Quadrado extends Ponto implements Figura,Colorida {
/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE QUADRADO */
	private Ponto cimaesq;
	private Ponto cimadir;
	private Ponto baixoesq;
	private Ponto baixodir;
	private float lado;
	private String cor;

 	public String Desenhar() {
		
		return this.toString();
	}
/* POLIMORFISMO DE SOBRECARGA -> CONSTRUTORES */
	Quadrado(){
		this.lado = 0;
		Ponto origem = new Ponto(0,0);
		this.cimaesq = origem;
		this.cimadir = origem;
		this.baixoesq = origem;
        this.baixodir = origem;	
		this.cor= "";	
	}

	Quadrado(float lado, Ponto x, String cor) {
		
		this.lado=lado;
		this.cimaesq = x;
		this.cimadir = new Ponto(x.x+lado, x.y);
		this.baixoesq = new Ponto(x.x, x.y-lado);
        this.baixodir = new Ponto(x.x+lado, x.y-lado);	
		this.cor=cor;	
	
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

	public double CalcularArea() {
		
		return (this.lado * this.lado);
	
	}

	public void Mover(float dx, float dy) {
        
        this.cimaesq.moverPonto(dx, dy);
        this.cimadir.moverPonto(dx, dy);
        this.baixoesq.moverPonto(dx, dy);
        this.baixodir.moverPonto(dx, dy);
    
    }

     public void Redimensionar(float dxy){
    	
    	this.lado=lado+dxy;
		this.cimadir.moverPonto(dxy,dxy);
		this.baixoesq.moverPonto(dxy,dxy);
        this.baixodir.moverPonto((dxy),dxy);
    
    }

    public void Apagar(){

    	this.lado=0;
    	this.cimaesq.apagarPonto(); 
    	this.baixoesq.apagarPonto();
    	this.cimadir.apagarPonto(); 
    	this.baixodir.apagarPonto(); 

    }

    public double CalcularPerimetro(){

    	return (4*this.lado);
    
    }

     public String toString(){
	    return "Quadrado" + " de lado " + this.lado + " e vertices " + this.cimaesq.imprimirPonto() + this.cimadir.imprimirPonto() + this.baixoesq.imprimirPonto() + this.baixodir.imprimirPonto();
		
	}

	public boolean equals(Quadrado obj){

		Quadrado aux = (Quadrado)obj;
		if (this.cimaesq.equals(obj.getCimaesq()) && (this.cimadir.equals(obj.getCimadir())) && (this.baixoesq.equals(obj.getBaixoesq())) && (this.baixodir.equals(obj.getBaixodir()))){ 
			return true;
		} else { return false; }
	}


}