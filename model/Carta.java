package model;

public class Carta {
    private static int contador = 1;

    private int id;
    private String remetente;
    private String destinatario;
    private String tipo;
    private String conteudo;

    public Carta(String remetente, String destinatario, String tipo, String conteudo) {
        this.id = contador++;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    public String formatarCarta() {
        return "ID: " + id +
                "\nTipo: " + tipo +
                "\nRemetente: " + remetente +
                "\nDestinatário: " + destinatario +
                "\nConteúdo:\n" + conteudo +
                "\n=========================\n";
    }

    public String getRemetente() { return remetente; }
    public String getTipo() { return tipo; }
}
