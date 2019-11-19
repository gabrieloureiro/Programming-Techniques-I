public class Elipse extends Ponto implements Figura {
/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE ELIPSE */
	private Ponto foco1;
	private Ponto foco2;
	private Ponto centro;
	private float distfocal,eixomaior,eixomenor,excentricidade,a,b,c;

	public String Desenhar() {
		
		return this.toString();
	
	}
/* POLIMORFISMO DE SOBRECARGA -> CONSTRUTORES */
	Elipse(){
		this.b=0;
		this.c=0;
		this.a = (b*b)+(c*c);
		Ponto cen = new Ponto(0,0);
		this.centro = cen;
		this.foco1 = cen;
		this.foco2 = cen;
		this.distfocal = 2 * c;
		this.eixomaior = 2 * a;
		this.eixomenor = 2 * b;
		this.excentricidade = c / a;
	}

	Elipse(float b, float c, Ponto x){
		this.b = b;
		this.c = c;
		this.a = (b*b)+(c*c);
		this.centro = x;
		this.foco1 = new Ponto(x.x-c,x.y);
		this.foco2 = new Ponto(x.x+c,x.y);
		this.distfocal = 2 * c;
		this.eixomaior = 2 * a;
		this.eixomenor = 2 * b;
		this.excentricidade = c / a;

	}

	//Getters
	public Ponto getFoco1(){
		return this.foco1;
	}
	public Ponto getFoco2(){
		return this.foco2;
	}
	public Ponto getCentro(){
		return this.centro;
	}
	public float getEixomaior(){

        return this.eixomaior;
    }
    public float getEixomenor(){

        return this.eixomenor;
    }
   //

	public double CalcularArea() {

		return (this.a * this.b * Math.PI);
	}

	public void Mover(float dx, float dy) {
        
        this.centro.moverPonto(dx, dy);
        this.foco1.moverPonto(dx,dy);
        this.foco2.moverPonto(dx,dy);
    
    }

     public void Redimensionar(float x){
    	
    	this.c=c+x;
    	this.b=b+x;
    
    }

    public void Apagar(){

    	this.b = 0;
		this.c = 0;
		this.a = (b*b)+(c*c);
		this.centro.apagarPonto();
		this.foco1.apagarPonto();
		this.foco2.apagarPonto();
		this.distfocal = 2 * c;
		this.eixomaior = 2 * a;
		this.eixomenor = 2 * b;
		this.excentricidade = 0;
    
    }

    public double CalcularPerimetro(){

    	return (2*Math.PI)*(Math.sqrt((this.eixomaior*this.eixomaior)+(this.eixomenor*this.eixomenor)/2));
    
    }

    public String toString(){
    	
    	return "Elipse" + " de centro " + this.centro.imprimirPonto() + ", focos " + this.foco1.imprimirPonto() + this.foco2.imprimirPonto() + ", eixo maior " + this.eixomaior + ", eixo menor " + this.eixomenor + ", com distancia focal de " + this.distfocal + " e excentricidade " + this.excentricidade;
	
	}

	public boolean equals(Elipse obj){

		Elipse aux = (Elipse)obj;
		if (this.foco1.equals(obj.getFoco1()) &&  this.foco2.equals(obj.getFoco2()) && this.centro.equals(obj.getCentro()) && this.eixomaior == obj.eixomaior && this.eixomenor == obj.eixomenor){
				return true;
		} else { return false; }	
	}
}