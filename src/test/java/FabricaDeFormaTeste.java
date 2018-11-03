import br.com.padroes.abstractFactory.FabricaAbstrata;
import br.com.padroes.abstractFactory.ProdutorDeFabrica;
import br.com.padroes.abstractFactory.ProdutorDeFabricaEnum;
import br.com.padroes.abstractFactory.forma.*;
import org.junit.Assert;
import org.junit.Test;

public class FabricaDeFormaTeste {

    @Test
    public void deveFabricarAFormaRetangulo() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.FORMA);
       Forma forma =  fabricaAbstrata.getForma(FormaEnum.RETANGULO);
        Assert.assertEquals(forma.getClass(), Retangulo.class);
    }

    @Test
    public void deveFabricarAFormaQuadrada() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.FORMA);
        Forma forma =  fabricaAbstrata.getForma(FormaEnum.QUADRADO);
        Assert.assertEquals(forma.getClass(), Quadrado.class);
    }

    @Test
    public void deveFabricarAFormaCirculo() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.FORMA);
        Forma forma =  fabricaAbstrata.getForma(FormaEnum.CIRCULO);
        Assert.assertEquals(forma.getClass(), Circulo.class);
    }

    @Test
    public void deveFabricarNenhuma() {
        FabricaAbstrata fabricaAbstrata =
                ProdutorDeFabrica.getFabricaAbstrata(ProdutorDeFabricaEnum.FORMA);
        Forma forma =  fabricaAbstrata.getForma(null);
        Assert.assertEquals(forma, null);
    }
}
