public class FabricaVenda implements FabricaAbstrata {

    @Override
    public Nota createNota() {
        return new NotaVenda();
    }

    @Override
    public Extrato createExtrato() {
        return new ExtratoVenda();
    }
}
