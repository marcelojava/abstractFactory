import br.com.padroes.abstractFactory.FabricaAbstrata;
import br.com.padroes.abstractFactory.ProdutorDeFabrica;
import br.com.padroes.abstractFactory.ProdutorDeFabricaEnum;
import br.com.padroes.abstractFactory.cor.FabricaDeCor;
import br.com.padroes.abstractFactory.forma.FabricaDeForma;
import org.junit.Assert;
import org.junit.Test;

public class ProdutorDeFabricaTeste {

    @Test
    public void deveFabricarUmaFabricaDeCor() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.COR);

        Assert.assertEquals(fabricaAbstrata.getClass(), FabricaDeCor.class);
    }

    @Test
    public void deveFabricarUmaFabricaDeForma() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.FORMA);

        Assert.assertEquals(fabricaAbstrata.getClass(), FabricaDeForma.class);
    }

    @Test
    public void deveFabricarNenhumaFabrica() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(null);

        Assert.assertEquals(fabricaAbstrata, null);
    }
}
