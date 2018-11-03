package br.com.padroes.abstractFactory;

import br.com.padroes.abstractFactory.cor.Cor;
import br.com.padroes.abstractFactory.cor.CorEnum;
import br.com.padroes.abstractFactory.forma.Forma;
import br.com.padroes.abstractFactory.forma.FormaEnum;

public abstract class FabricaAbstrata {

    public abstract Cor getCor(CorEnum corEnum);
    public abstract Forma getForma(FormaEnum formaEnum);
}
