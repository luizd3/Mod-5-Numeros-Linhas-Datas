public enum Cores {

    // VERMELHO, AZUL, AMARELO, VERDE
    // VERMELHO("Vermelho"), AZUL, AMARELO, VERDE;

    VERMELHO("Vermelho"),
    AZUL("Azul"),
    AMARELO("Amarelo"),
    VERDE("Verde");

    private String texto1;

    Cores(String texto) {
        this.texto1 = texto;
    }

    public String getTexto() {
        return texto1;
    }
}
