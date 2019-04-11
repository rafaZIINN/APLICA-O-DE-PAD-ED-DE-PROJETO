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
public abstract class DocesProtatype {
    protected double valoCompra;
    public abstract String exibirInfo();
    
    public abstract DocesProtatype clonar();
    
    public double getValorCompra(){
        return valoCompra;
    }
    
    public void setValorCompra(double valorCompra){
        this.valoCompra = valorCompra;
    }
}
