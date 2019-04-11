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
public class CadasadimProtatype extends DocesProtatype{
     protected CadasadimProtatype (CadasadimProtatype cadasadimProtatype){
        this.valoCompra = cadasadimProtatype.getValorCompra();
    }
    
    public CadasadimProtatype(){
        valoCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Cassadim" + "Valor: R$"
                + getValorCompra();
    }
    
     @Override
    public DocesProtatype clonar() {
        return new CadasadimProtatype(this);
    }
    
}
