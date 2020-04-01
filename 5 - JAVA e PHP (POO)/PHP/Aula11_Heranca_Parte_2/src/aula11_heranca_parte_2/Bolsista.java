/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_heranca_parte_2;

/**
 *
 * @author ronan
 */
public class Bolsista extends Aluno{
    //Atributos
    private int bolsa; //Porcentagem da Bolsa
    private float mensalidadeParcial;
    private boolean pago;
    
    //Getters and Setters

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
        this.setMensalidadeParcial();
    }
    
    public float getMensalidadeParcial(){
        return mensalidadeParcial;
    }
    
    public void setMensalidadeParcial(){
        float mensalidadeIntegral = 600;
        
        if(this.getBolsa() == 25){
            this.mensalidadeParcial = mensalidadeIntegral - (0.25f * mensalidadeIntegral);
        }else if(this.getBolsa() == 50){
            this.mensalidadeParcial = mensalidadeIntegral -(0.5f * mensalidadeIntegral);
        }else if(this.getBolsa() == 70){
            this.mensalidadeParcial = mensalidadeIntegral - (0.7f * mensalidadeIntegral);
        }else{
            this.mensalidadeParcial = 0;
        }
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    
    
    //Métodos Específicos
    
    public void apresentarBolsista(){
        System.out.println("=========== Bolsista =============");
        this.apresentar();
        System.out.println("Bolsa: "+this.getBolsa()+" %");
        System.out.println("Valor Parcial: "+this.getMensalidadeParcial());
    }
    
    public void renovarBolsa(){
        if(this.isPago()){
            System.out.println("Bolsa renovada com sucesso !");
        }else{
            System.out.println("Não foi possível renovar bolsa.");
        }
        System.out.println(" ");
    }
    
    @Override //sobrescrever (Introdução ao polimorfismo)
    public void pagarMensalidade(float valor){
        System.out.println(" ");
        System.out.println("--------------------------------");
        
        if(valor == this.getMensalidadeParcial() && this.getMensalidadeParcial() != 0){
            System.out.println("Mensalidade paga com sucesso !");
            System.out.println("Troco: R$ 0,00");
            this.setPago(true);
        }else if(valor > this.getMensalidadeParcial() && this.getMensalidadeParcial() != 0){
            System.out.println("Mensalidade paga com sucesso !");
            System.out.println("Troco: "+(valor - this.getMensalidadeParcial()));
            this.setPago(true);
        }else if(this.getMensalidadeParcial() == 0){
            System.out.println("Porcentagem da bolsa não Permitida.");
        }else{
            System.out.println("A mensalidade não foi paga.Dinheiro insuficiente . :/");
        }
    }
            
            
}
