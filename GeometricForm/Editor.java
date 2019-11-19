public class Editor extends Ponto {

		//Pontos
		Ponto p1 = new Ponto(2,6);
		Ponto p2 = new Ponto(3,4);
		Ponto p3 = new Ponto (1,1);
		Ponto p4 = new Ponto (6,6);

		//Figuras
		Figura quadrado = new Quadrado(3,p2,"Verde");
		Figura elipse = new Elipse(3,5,p1);
		Figura retangulo = new Retangulo(4,5,p3);
		Figura triangulo = new Triangulo(3,4,5,p4);
		Figura circulo = new Circulo(3,2,5);
		
		//Vetor
		Figura vetfig[]={quadrado,elipse,retangulo,triangulo,circulo};
	
	public static void main(String args[]){

		//Instancia de editor
		Editor e = new Editor();


		for (int i=0;i<5;i++) {
			
			//Desenhar
			System.out.println("A figura é um " + e.vetfig[i].Desenhar());

			//Calcular area
 			System.out.println("de área: " + e.vetfig[i].CalcularArea());

 			//Calcular perimetro
 			System.out.println("e perímetro: " + e.vetfig[i].CalcularPerimetro() + "." + "\n__________________________________________________________\n");

 			//Mover
 			e.vetfig[i].Mover(2,3);
			System.out.println("Após mover (utilizando dx=2 e dy=3): " + e.vetfig[i].Desenhar() + "." + "\n__________________________________________________________\n");

			//Redimensionar
			e.vetfig[i].Redimensionar(2);
			System.out.println("Após redimensionar (utilizando x=2): " + e.vetfig[i].Desenhar() + "." + "\n__________________________________________________________\n");

 			//Apagar
 			e.vetfig[i].Apagar();
			System.out.println("Ao apagar todos os elementos da figura, temos: " + e.vetfig[i].Desenhar() + "." + "\n________________________E__N__D______________________________\n");

		}

		//QUESTÃO 5
		System.out.println("QUESTÃO 5:\n__________________________________________________________\n" + "POLIMORFISMOS UTILIZADOS:\n\n" 
			+ "Inclusão:\n/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE RETANGULO */\n/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE CIRCULO */\n/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE ELIPSE */\n/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE QUADRADO */\n/* POLIMORFISMO DE INCLUSÃO CLASSE PONTO -> CLASSE TRIANGULO */\n" 
			+ "Coerção:\n/* POLIMORFISMO DE COERÇÃO CONSTRUTOR DAS FIGURAS -> MAIN */, ISTO É, O JAVA FAZ A COERÇÃO AUTOMÁTICA. EMBORA OS PARAMETROS SEJAM, EVENTUALMENTE, DECLARADOS EM FLOAT,  OS VALORES INSERIDOS NA INSTANCIA DA MAIN SÃO INTEIROS.\n"
			+ "Sobrecarga:\n/* POLIMORFISMO DE SOBRECARGA -> CONSTRUTORES */");
	}
}