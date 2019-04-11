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
public class DoceLeiteProtatype extends DocesProtatype{

     protected DoceLeiteProtatype (DoceLeiteProtatype doceLeiteProtatype){
        this.valoCompra = doceLeiteProtatype.getValorCompra();
    }
    
    public DoceLeiteProtatype(){
        valoCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Doce de Leite" + "Valor: R$"
                + getValorCompra();
    }
    
     @Override
    public DocesProtatype clonar() {
        return new DoceLeiteProtatype(this);
    }
    
}
