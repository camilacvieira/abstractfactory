import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MercadoTest {
    @Test
    void deveEmitirExtratoCompra() {
        FabricaAbstrata fabrica = new FabricaCompra();
        Mercado mercado = new Mercado(fabrica);
        assertEquals("Extrato de compra de produtos", mercado.emitirExtrato());
    }

    @Test
    void deveEmitirExtratoVenda() {
        FabricaAbstrata fabrica = new FabricaVenda();
        Mercado mercado = new Mercado(fabrica);
        assertEquals("Extrato de venda de produtos", mercado.emitirExtrato());
    }

    @Test
    void deveEmitirNotaCompra() {
        FabricaAbstrata fabrica = new FabricaCompra();
        Mercado mercado = new Mercado(fabrica);
        assertEquals("Nota fiscal de compra de produtos", mercado.emitirNota());
    }

    @Test
    void deveEmitirNotaVenda() {
        FabricaAbstrata fabrica = new FabricaVenda();
        Mercado mercado = new Mercado(fabrica);
        assertEquals("Nota fiscal de venda de produtos", mercado.emitirNota());
    }
}
