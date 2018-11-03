import br.com.padroes.abstractFactory.FabricaAbstrata;
import br.com.padroes.abstractFactory.ProdutorDeFabrica;
import br.com.padroes.abstractFactory.ProdutorDeFabricaEnum;
import br.com.padroes.abstractFactory.cor.*;
import org.junit.Assert;
import org.junit.Test;

public class FabricaDeCorTeste {

    @Test
    public void deveFabricarACorVermelha() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.COR);

        Cor cor = fabricaAbstrata.getCor(CorEnum.VERMELHO);

        Assert.assertEquals(cor.getClass(), Vermelho.class);
    }

    @Test
    public void deveFabricarACorAmarela() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.COR);

        Cor cor = fabricaAbstrata.getCor(CorEnum.AMARELO);

        Assert.assertEquals(cor.getClass(), Amarelo.class);
    }

    @Test
    public void deveFabricarACorVerde() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.COR);

        Cor cor = fabricaAbstrata.getCor(CorEnum.VERDE);

        Assert.assertEquals(cor.getClass(), Verde.class);
    }

    @Test
    public void deveRetornarNull() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.COR);

        Cor cor = fabricaAbstrata.getCor(null);

        Assert.assertEquals(null, cor);
    }
}
