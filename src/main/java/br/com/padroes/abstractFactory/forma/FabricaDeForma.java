package br.com.padroes.abstractFactory.forma;

import br.com.padroes.abstractFactory.FabricaAbstrata;
import br.com.padroes.abstractFactory.cor.Cor;
import br.com.padroes.abstractFactory.cor.CorEnum;

public class FabricaDeForma extends FabricaAbstrata{

    @Override
    public Cor getCor(CorEnum corEnum) {
        return null;
    }

    @Override
    public Forma getForma(FormaEnum formaEnum) {
        if (FormaEnum.RETANGULO.equals(formaEnum))
            return new Retangulo();
        else if (FormaEnum.QUADRADO.equals(formaEnum))
            return new Quadrado();
        else if (FormaEnum.CIRCULO.equals(formaEnum))
            return new Circulo();
        return null;
    }
}
