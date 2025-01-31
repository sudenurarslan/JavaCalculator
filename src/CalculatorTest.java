import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HesapMakinesiTest {

    @Test
    void testToplama() {
        assertEquals(10, HesapMakinesi.hesapla(7, 3, '+'));
    }

    @Test
    void testCikarma() {
        assertEquals(4, HesapMakinesi.hesapla(7, 3, '-'));
    }

    @Test
    void testCarpma() {
        assertEquals(21, HesapMakinesi.hesapla(7, 3, '*'));
    }

    @Test
    void testBolme() {
        assertEquals(2, HesapMakinesi.hesapla(6, 3, '/'));
    }
}
