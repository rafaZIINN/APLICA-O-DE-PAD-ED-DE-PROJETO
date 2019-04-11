/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeultilizadopadroes;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class AtividadeUltilizadoPadroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int operacao;
        int operacao1;

        System.out.println("Digite o número que deseija:\n 1 Bolo:\n 2 Doce:\n 3 Biscoito:");
        operacao = teclado.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Digite:\n 1 Bolo Cenoura \n 2 Bolo Chocolate \n 3 Bolo Laranja \n 4 Bolo Prestigio");
                operacao1 = teclado.nextInt();
                switch (operacao1) {
                    case 1:
                        FabricaBolo bolo = new Boloss();
                        BoloCenoura bolocenoura = bolo.criarBoloCenoura();
                        bolocenoura.exibirInfoBoloCenoura();

                        break;
                    case 2:
                        FabricaBolo bolo1 = new Boloss();
                        BoloChocolate bolochocolate = bolo1.criarBoloChocolate();
                        bolochocolate.exibirInfoBoloChocolate();

                        break;

                    case 3:
                        FabricaBolo bolo2 = new Boloss();
                        BoloLaranja boloLaranja = bolo2.criarBoloLaranja();
                        boloLaranja.exibirInfoBoloLaranja();

                        break;

                    case 4:
                        FabricaBolo bolo3 = new Boloss();
                        BoloPrestigio boloprestigio = bolo3.criarBoloPrestigio();
                        boloprestigio.exibirInfoBoloPrestigio();

                        break;
                }
        }
        switch (operacao) {
            case 2:
                System.out.println("Digite:\n 1 Doce de leite \n 2 Casadim \n 3 Maria Mole \n 4 Pudim");
                operacao1 = teclado.nextInt();
                switch (operacao1) {
                    case 1:
                        DoceLeiteProtatype doceLeiteprotatype = new DoceLeiteProtatype();
                        DocesProtatype doceLeite = doceLeiteprotatype.clonar();
                        doceLeite.setValorCompra(20.00);

                        System.out.println(doceLeite.exibirInfo());
                        break;
                    case 2:
                        CadasadimProtatype cassadim1 = new CadasadimProtatype();
                        DocesProtatype docecassadim = cassadim1.clonar();
                        docecassadim.setValorCompra(30.00);

                        System.out.println(docecassadim.exibirInfo());
                        break;
                    case 3:
                        MariaMoleProtatype mariamole = new MariaMoleProtatype();
                        DocesProtatype mariamole1 = mariamole.clonar();
                        mariamole1.setValorCompra(10.00);

                        System.out.println(mariamole1.exibirInfo());
                        break;
                    case 4:
                        PudimpProtatype pudim1 = new PudimpProtatype();
                        DocesProtatype pudim2 = pudim1.clonar();
                        pudim2.setValorCompra(10.00);

                        System.out.println(pudim2.exibirInfo());
                        break;
                        
                    
                }
                
                }
        
        switch (operacao) {
            case 3:
                System.out.println("Digite:\n 1 Biscoito ao leite \n 2 Biscoito de Chocolate \n 3 Biscoitos Cookes \n 4 Biscoito Polvilhos");
                operacao1 = teclado.nextInt();
                switch (operacao1) {
                    case 1:
                        BiscoitoFactory fabicra1 = new BiscoitoFactory();
                        String sabor1 = "Polvilho com Limão";
                        String qualidade1 = "Boa";
                        fabicra1.getFabricaBiscoito(sabor1, qualidade1);
                        
                        break;
                    case 2:
                        BiscoitoFactory fabicra2 = new BiscoitoFactory();
                        String sabor2 = "Cookes com Gosta de Chocolate";
                        String qualidade2 = "Boa";
                        fabicra2.getFabricaBiscoito(sabor2, qualidade2);
                        
                        break;
                    case 3:
                        BiscoitoFactory fabicra3 = new BiscoitoFactory();
                        String sabor3 = "Ao Leite";
                        String qualidade3 = "Boa";
                        fabicra3.getFabricaBiscoito(sabor3, qualidade3);
                        
                        break;
                    case 4:
                        BiscoitoFactory fabicra4 = new BiscoitoFactory();
                        String sabor4 = "Sabor Chocolate";
                        String qualidade4 = "Boa";
                        fabicra4.getFabricaBiscoito(sabor4, qualidade4);
                         
                        break;
                    
                }

             
        }
            switch (operacao) {
                     default:
                        System.out.println("Operação inválida, tente Novamente com seguites numeros: 1, 2 , 3 ou 4 !");
                    break;
                }    

}
    
}