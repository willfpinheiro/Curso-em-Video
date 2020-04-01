
package aula04_acessores_modificadores_construtores;

public class Caneta {
    //Atributos
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //Construtor
    public Caneta(String m,float p,String c){
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }
    
    //Getters and Setters
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    //Métodos Específicos
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo -> "+this.getModelo());
        System.out.println("Ponta  -> "+this.getPonta());
        System.out.println("Cor    -> "+this.getCor());
        System.out.println("Está tampada? "+this.getTampada());
    }
    
    public void tampar(){
        this.tampada = true;
    }    
    
    public void destampar(){
        this.tampada = false;
    }
    
    
}
