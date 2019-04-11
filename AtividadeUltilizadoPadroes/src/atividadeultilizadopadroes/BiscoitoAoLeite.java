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
public class BiscoitoAoLeite extends FabricaBiscoito{
    public BiscoitoAoLeite(String qualidade){
        this.qualidade = qualidade;
        System.out.println("A qualidade do biscoito ao leite e boa pq o leite so se em contra no Amisterdan:" + this.qualidade);
        
    }
    
}
