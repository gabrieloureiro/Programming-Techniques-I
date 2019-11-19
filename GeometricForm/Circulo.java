/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE CIRCULO */
public class Circulo extends Ponto implements Figura {

	private Ponto centro;
	private float raio;

	public String Desenhar() {
		
		return (this.toString());  	

	}
/* POLIMORFISMO DE SOBRECARGA -> CONSTRUTORES */
	Circulo(){
        this.raio = 0;
        Ponto c = new Ponto(0,0);
        this.centro = c;
    }
	
	Circulo(float raio, float x, float y) {
        
        this.centro = new Ponto(x,y);
        this.raio = raio;
    	
    }
    //Getters
    public Ponto getCentro(){

        return this.centro;
    }

    public float getRaio(){

        return this.raio;
    }
    //
	public double CalcularArea() {

		return (Math.PI * this.raio * this.raio);
	}

	public void Mover(float dx, float dy) {
        
        this.centro.moverPonto(dx, dy);
    
    }

    public void Redimensionar(float x){
    	
    	this.raio=raio+x;
    }

    public void Apagar(){
    	this.raio=0;
    	this.centro.apagarPonto();
    }

    public double CalcularPerimetro(){
    	
    	return (2*Math.PI*this.raio);
    
    }

    public String toString(){

        return "Circulo " + "de centro " + this.centro.imprimirPonto() + " e raio " + this.raio;   

    }

    public boolean equals(Circulo obj){

        Circulo aux = (Circulo)obj;
        if ((this.centro.equals(obj.getCentro())) && (this.raio == obj.raio)){
            return true;
        } else { return false; }
    }

}