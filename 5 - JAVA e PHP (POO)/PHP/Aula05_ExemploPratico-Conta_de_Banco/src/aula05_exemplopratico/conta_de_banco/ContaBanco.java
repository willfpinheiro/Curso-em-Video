/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_exemplopratico.conta_de_banco;

/**
 *
 * @author ronan
 */
public class ContaBanco {
    //Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Construtor
    public void ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    //Getters and Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    //Métodos Específicos
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("            Conta             ");
        System.out.println("Nome: "+this.getDono());
        System.out.println("Número da Conta: "+this.getNumConta()); 
        System.out.println("Tipo da Conta: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("----------------------------------");
    }
    
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        if(this.getTipo() == "CC"){
            System.out.println("Conta Corrente aberta.");
            this.setStatus(true);
            this.setSaldo(50);
        }else if(this.getTipo() == "CP"){
            System.out.println("Conta Poupança aberta.");
            this.setStatus(true);
            this.setSaldo(150);
        }else{
            System.out.println("Não foi possível abrir conta.Tipo de conta Inválido !");
        }
    }
    
    void fecharConta(){
        if(this.getStatus() && (this.getSaldo() == 0) ){
            System.out.println("------------------------------------------------------");
            System.out.println("| A conta foi  fechada com sucesso !                 |");
            this.setStatus(false);
        }else if(this.getSaldo() < 0){
            System.out.println("--------------------------------------------------------------");
            System.out.println("| A conta não pode ser fechada.Você está no debito !         |");
            System.out.println("--------------------------------------------------------------");
        }else{
            System.out.println("A conta não pode ser fechada.");
        }
    }
    
    void depositar(float valor){
        if(this.getStatus()){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("| Deposito com valor de R$ "+valor+" realizado com sucesso         |");
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("Não foi possível depositar.A conta está fechada !");
        }
    }

    void sacar(float valor){
        if(this.getStatus() && (valor <= this.getSaldo())){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("| Valor de R$ "+valor+" sacado com sucesso!                        |");
            this.setSaldo(this.getSaldo() - valor);
        }else if(valor > this.getSaldo()){
            System.out.println("Saldo insuficiente.");
        }else{
            System.out.println("Não foi possível sacar o dinheiro.A conta está fechada!");
        }
    }
    
    void pagarMensalidade(){
        //Verificação do Status da Conta
        if(this.getStatus()){
            //Verificação do Tipo de Conta
            if(this.getTipo() == "CC"){
                System.out.println("---------------------------------------------------------------");
                System.out.println("| Mensalidade da Conta Corrente(R$ 12,00) paga  com sucesso !  |");
                this.setSaldo(this.getSaldo() - 12);
             }else{
                System.out.println("----------------------------------------------------------------");
                System.out.println("| Mensalidade da Conta Poupança(R$ 20,00) paga com sucesso !   |");
                this.setSaldo(this.getSaldo() - 20);
             }    
        }else{
            System.out.println("Não foi possível pagar mensalidade.A conta está fechada !");
        }
        
    }
    
    
}
