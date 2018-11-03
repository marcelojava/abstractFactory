package br.com.padroes.abstractFactory.cor;

import br.com.padroes.abstractFactory.FabricaAbstrata;
import br.com.padroes.abstractFactory.forma.Forma;
import br.com.padroes.abstractFactory.forma.FormaEnum;

public class FabricaDeCor extends FabricaAbstrata{

    @Override
    public Cor getCor(CorEnum corEnum) {
        if (CorEnum.VERMELHO.equals(corEnum))
            return new Vermelho();
        else if (CorEnum.AMARELO.equals(corEnum))
            return new Amarelo();
        else if (CorEnum.VERDE.equals(corEnum))
            return new Verde();
        return null;
    }

    @Override
    public Forma getForma(FormaEnum formaEnum) {
        return null;
    }
}
