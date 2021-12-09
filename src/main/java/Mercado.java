public class Mercado {
    private Nota nota;
    private Extrato extrato;

    public Mercado (FabricaAbstrata fabrica) {
        this.nota = fabrica.createNota();
        this.extrato = fabrica.createExtrato();
    }

    public String emitirNota() {
        return this.nota.emitir();
    }

    public String emitirExtrato() {
        return this.extrato.emitir();
    }
}
