package br.com.padroes.abstractFactory;

import br.com.padroes.abstractFactory.cor.FabricaDeCor;
import br.com.padroes.abstractFactory.forma.FabricaDeForma;

public class ProdutorDeFabrica {

    public static FabricaAbstrata getFabricaAbstrata(ProdutorDeFabricaEnum produtorDeFabricaEnum) {

        if (ProdutorDeFabricaEnum.COR.equals(produtorDeFabricaEnum))
            return new FabricaDeCor();
        else if (ProdutorDeFabricaEnum.FORMA.equals(produtorDeFabricaEnum))
            return new FabricaDeForma();
        return null;
    }
}
