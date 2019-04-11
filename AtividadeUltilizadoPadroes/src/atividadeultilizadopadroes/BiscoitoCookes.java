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
public class BiscoitoCookes extends FabricaBiscoito{
    public BiscoitoCookes(String qualidade){
        this.qualidade = qualidade;
        System.out.println("O Cookes tem um qualidade de Chocolate que so se em contra Bahia:" + this.qualidade);
        
    }
}
