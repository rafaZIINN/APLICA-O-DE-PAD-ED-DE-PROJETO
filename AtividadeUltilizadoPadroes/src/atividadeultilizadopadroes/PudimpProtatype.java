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
public class PudimpProtatype extends DocesProtatype{
     protected PudimpProtatype (PudimpProtatype pudimpProtatype){
        this.valoCompra = pudimpProtatype.getValorCompra();
    }
    
    public PudimpProtatype(){
        valoCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Pudim" + "Valor: R$"
                + getValorCompra();
    }
    
     @Override
    public DocesProtatype clonar() {
        return new PudimpProtatype(this);
    }
    
}
