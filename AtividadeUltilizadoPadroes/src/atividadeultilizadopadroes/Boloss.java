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
public class Boloss implements FabricaBolo{

    @Override
    public BoloLaranja criarBoloLaranja() {
         return new BoloLaranja1();
    }

    @Override
    public BoloCenoura criarBoloCenoura() {
        return new BoloCenoura1();
    }

    @Override
    public BoloChocolate criarBoloChocolate() {
         return new BoloChocolate1();
    }

    @Override
    public BoloPrestigio criarBoloPrestigio() {
         return new BoloPrestigio1();
    }
    
}
