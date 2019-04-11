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
public class BiscoitoChocolate extends FabricaBiscoito{
    public BiscoitoChocolate(String qualidade){
        this.qualidade = qualidade;
        System.out.println("A qualidade do Biscoito de Chocolate e muito boa Melhor chocolate da Baiha:" + this.qualidade);
        
    }
    
}
