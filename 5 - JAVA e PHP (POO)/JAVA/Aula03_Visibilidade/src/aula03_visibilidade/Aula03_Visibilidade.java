
package aula03_visibilidade;

public class Aula03_Visibilidade {
    
    public static void main(String[] args) {
        //Instancia
        Caneta c1 = new Caneta();
        
        c1.modelo = "Bic Cristal";
        c1.cor = "Vermelho";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        
        c1.status();
        c1.escrever();
        c1.rabiscar();
    }
    
}
