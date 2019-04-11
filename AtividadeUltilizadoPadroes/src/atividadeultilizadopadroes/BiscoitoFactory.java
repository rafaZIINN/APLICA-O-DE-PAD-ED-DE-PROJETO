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
public class BiscoitoFactory {
     public FabricaBiscoito getFabricaBiscoito(String sabor, String qualidade){
        if (sabor.equals("Polvilho com Limão"))
            return new BiscoitoPolvilho(qualidade);
        if (sabor.equals("Cookes com Gosta de Chocolate"))
            return new BiscoitoCookes(qualidade);
        if (sabor.equals("Ao Leite"))
            return new BiscoitoAoLeite(qualidade);
        if (sabor.equals("Sabor Chocolate"))
            return new BiscoitoChocolate(qualidade);
        
         return null;
    }
}
