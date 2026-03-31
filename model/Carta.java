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
        String linha = "═".repeat(50);

        String emoji = switch (tipo) {
            case "Amor" -> "❤️";
            case "Amizade" -> "🤝";
            case "Desculpas" -> "🙏";
            case "Formal" -> "📄";
            case "Motivacional" -> "🔥";
            default -> "✉️";
        };

        return "\n" + linha +
                "\n" + emoji + " CARTA #" + id + " " + emoji +
                "\n" + linha +
                "\nTipo: " + tipo +
                "\n\nDe: " + remetente +
                "\nPara: " + destinatario +
                "\n" + linha +
                "\n\n" + conteudo +
                "\n" + linha +
                "\n\nCom carinho, \n" + remetente +
                "\n" + linha + "\n\n";
    }

    public String getRemetente() { return remetente; }
    public String getTipo() { return tipo; }
}
