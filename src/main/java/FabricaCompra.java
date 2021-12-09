public class FabricaCompra implements FabricaAbstrata {

    @Override
    public Nota createNota() {
        return new NotaCompra();
    }

    @Override
    public Extrato createExtrato() {
        return new ExtratoCompra();
    }
}
