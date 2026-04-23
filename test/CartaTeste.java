package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Carta;


public class CartaTeste {

    @Test
    void deveCriarCartaComRemetenteCorreto() {
        Carta carta = new Carta("Sophia", "João", "Amor", "Oi");
        assertEquals("Sophia", carta.getRemetente());
    }

    @Test
    void deveCriarCartaComTipoCorreto() {
        Carta carta = new Carta("Ana", "Maria", "Amizade", "Oi");
        assertEquals("Amizade", carta.getTipo());
    }

    @Test
    void deveFormatarCartaComConteudo() {
        Carta carta = new Carta("A", "B", "Formal", "Conteúdo teste");
        String resultado = carta.formatarCarta();

        assertTrue(resultado.contains("Conteúdo teste"));
    }

    @Test
    void deveFormatarCartaComRemetente() {
        Carta carta = new Carta("Carlos", "Lucas", "Motivacional", "Força!");
        String resultado = carta.formatarCarta();

        assertTrue(resultado.contains("Carlos"));
    }

    @Test
    void deveFormatarCartaComDestinatario() {
        Carta carta = new Carta("Carlos", "Lucas", "Motivacional", "Força!");
        String resultado = carta.formatarCarta();

        assertTrue(resultado.contains("Lucas"));
    }

    @Test
    void deveUsarEmojiAmor() {
        Carta carta = new Carta("A", "B", "Amor", "x");
        String resultado = carta.formatarCarta();

        assertTrue(resultado.contains("❤️"));
    }

    @Test
    void deveUsarEmojiDesculpas() {
        Carta carta = new Carta("A", "B", "Desculpas", "x");
        String resultado = carta.formatarCarta();

        assertTrue(resultado.contains("🙏"));
    }

    @Test
    void deveUsarEmojiPadraoQuandoTipoDesconhecido() {
        Carta carta = new Carta("A", "B", "Outro", "x");
        String resultado = carta.formatarCarta();

        assertTrue(resultado.contains("✉️"));
    }

    @Test
    void deveIncrementarIdDasCartas() {
        Carta c1 = new Carta("A", "B", "Amor", "x");
        Carta c2 = new Carta("A", "B", "Amor", "x");

        String carta1 = c1.formatarCarta();
        String carta2 = c2.formatarCarta();

        assertNotEquals(carta1, carta2); // IDs diferentes refletem no texto
    }
}
