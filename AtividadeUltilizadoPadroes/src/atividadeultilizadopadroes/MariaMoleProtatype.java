/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeultilizadopadroes;

/**
 *
 * @author Rafael
 */
public class MariaMoleProtatype extends DocesProtatype{
    protected MariaMoleProtatype (MariaMoleProtatype mariaMoleProtatype){
        this.valoCompra = mariaMoleProtatype.getValorCompra();
    }
    
    public MariaMoleProtatype(){
        valoCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Maria Mole" + "Valor: R$"
                + getValorCompra();
    }
    
     @Override
    public DocesProtatype clonar() {
        return new MariaMoleProtatype(this);
    }
}
