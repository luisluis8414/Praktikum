package io.fp.caesarcipherfx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarCipherTest {

    CaesarCipher caesarCipher;

    @BeforeEach
    void setUp() {
        caesarCipher = new CaesarCipher();

    }

    @Test
    void testChipher() throws CipherException {

        assertEquals(caesarCipher.cipher("test", 1), "uftu");

    }

    @Test
    void testDechipher() throws CipherException {

        assertEquals(caesarCipher.decipher("uftu", 1), "test");
    }

    @Test
    void testChipherWithEmptyString() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.cipher("", 2);
        });
    }

    @Test
    void testChipherWithLargeKey() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.cipher("test", 27);
        });
    }

    @Test
    void testChipherWithZeroKey() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.cipher("test", 0);
        });
    }

    @Test
    void testChipherWithCapitalLetter() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.cipher("Test", 2);
        });
    }

    @Test
    void testDechipherWithEmptyString() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.decipher("", 2);
        });
    }

    @Test
    void testDechipherWithLargeKey() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.decipher("test", 27);
        });
    }

    @Test
    void testDechipherWithZeroKey() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.decipher("test", 0);
        });
    }

    @Test
    void testDechipherWithCapitalLetter() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.decipher("Test", 2);
        });
    }

    @Test
    void testCheckChipherPropsZeroKey() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.checkCipherProps("test", 0);
        });
    }

    @Test
    void testCheckChipherPropsLargeKey() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.checkCipherProps("test", 27);
        });
    }

    @Test
    void testCheckChipherPropsEmptyString() {
        assertThrows(CipherException.class, () -> {
            caesarCipher.checkCipherProps("", 1);
        });
    }

}
