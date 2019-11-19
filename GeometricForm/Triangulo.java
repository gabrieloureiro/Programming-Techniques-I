public class Triangulo extends Ponto implements Figura {
/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE TRIANGULO */
	private Ponto cima;
	private Ponto esq;
	private Ponto dir;
	private float lado1,base,lado2,altura,m;


	public String Desenhar() {
		
		return (this.toString());
	
	}
/* POLIMORFISMO DE SOBRECARGA -> CONSTRUTORES */		
	Triangulo(){

		this.lado1=0;
		this.lado2=0;
		this.base=0;
		Ponto origem = new Ponto(0,0);
		this.altura = (float)(lado1*Math.sqrt(3))/2;
		this.esq = origem;
		this.cima = origem;
		this.dir = origem;
	}

	Triangulo(float lado1, float base, float lado2, Ponto x){
		//Equilatero
		if(lado1 == base && base == lado2){
			this.lado1=lado1;
			this.base=base;
			this.lado2=lado2;
			this.altura = (float)(lado1*Math.sqrt(3))/2;
			this.esq = x;
			this.cima = new Ponto(x.x+(base/2),x.y+altura);
			this.dir = new Ponto(x.x+base,x.y);
		}
		//Isosceles
		if(lado1 == base || lado1 == lado2 || base == lado2){
			this.lado1=lado1;
			this.base=base;
			this.lado2=lado2;
			this.altura = (float) Math.sqrt((lado1*lado1)-(base*base/2));
			this.esq = x;
			this.cima = new Ponto(x.x+(base/2),x.y+altura);
			this.dir = new Ponto(x.x+base,x.y);
		}
		//Escaleno
		if (lado1 != base && lado1 != lado2 && lado2 != base){
			this.lado1=lado1;
			this.base=base;
			this.lado2=lado2;
			this.m = (float) Math.sqrt((lado1*lado1)-(altura*altura));
			this.altura = (float) Math.sqrt((lado2*lado2)-(m*m)/2);
			this.esq = x;
			this.cima = new Ponto(x.x+m,x.y+altura);
			this.dir = new Ponto(x.x+base,x.y);
		}
		
	}

	public double CalcularArea(){
		
		return ((this.base*this.altura)/2);
	
	}		

	public void Mover(float dx, float dy) {
        
        this.esq.moverPonto(dx, dy);
        this.cima.moverPonto(dx,dy);
        this.dir.moverPonto(dx,dy);
    
    }

    public void Apagar(){

    	this.lado1=0;
		this.base=0;
		this.lado2=0;
		this.altura = 0;
		this.esq.apagarPonto();
		this.cima.apagarPonto();
		this.dir.apagarPonto();
    
    }

     public void Redimensionar(float dxy){
    	
    	this.lado1=lado1+dxy;
    	this.base=base+dxy;
    	this.lado2=lado2+dxy;
    	this.esq.moverPonto(dxy, dxy);
        this.cima.moverPonto(dxy,dxy);
        this.dir.moverPonto(dxy,dxy);
    
    }

    public double CalcularPerimetro(){
    	
    	return (this.lado1+this.base+this.lado2);

    }
    //Getters
    public Ponto getCima(){
    	return this.cima;
    }
    public Ponto getEsq(){
    	return this.esq;
    } 
    public Ponto getDir(){
    	return this.dir;
    } 
    //
    public String toString(){
	    if(lado1 == base && base == lado2){
	    	return "Triangulo Equilatero de vertices " + this.esq.imprimirPonto() + this.cima.imprimirPonto() + this.dir.imprimirPonto() + ", de lado e de base  " + this.lado1 + " e altura " + this.altura;
	    }

	    else if (lado1 == base || lado1 == lado2 || base == lado2){
			return "Triangulo Isosceles de vertices " + this.esq.imprimirPonto() + this.cima.imprimirPonto() + this.dir.imprimirPonto() + ", de lados " + this.lado1 + " e " + this.lado2 + ", de base  " + this.base + " e de altura " + this.altura;
		}
		else if (lado1 != base && lado1 != lado2 && lado2 != base) {
			return "Triangulo Escaleno de vertices " + this.esq.imprimirPonto() + this.cima.imprimirPonto() + this.dir.imprimirPonto() + ", de lados " + this.lado1 + " e " + this.lado2 + ", de base  " + this.base + " e de altura " + this.altura;
		}
		
		else {
			return "";
		}
	}

	public boolean equals(Triangulo obj){

		//if(obj instanceof Triangulo){
			Triangulo aux = (Triangulo)obj;
			if (this.cima.equals(obj.getCima()) && this.esq.equals(obj.getEsq()) && this.dir.equals(obj.getDir())){
			
				return true;
			
			} else { return false; }

		//} else { return false; }
	
	}

}