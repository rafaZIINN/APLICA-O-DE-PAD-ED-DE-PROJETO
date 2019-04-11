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
public class BiscoitoPolvilho extends FabricaBiscoito{
    public BiscoitoPolvilho(String qualidade){
        this.qualidade = qualidade;
        System.out.println("E um qualida do Polvilho bem fresco em contrado somente na Alemanhã:" + this.qualidade);
        
    }
    
}
