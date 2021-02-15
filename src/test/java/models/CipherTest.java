package models;

import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(true, testCipher instanceof Cipher);
    }
    @Test
    public void newCipher_readsAString_a() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("a", testCipher.getStatement());
    }
    @Test
    public void newCipher_readsKey_2() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(2, testCipher.getKey());
    }
    @Test
    public void newCipher_substituteLetter_b() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("b", testCipher.toEncrypt());
    }
    @Test
    public void newCipher_substituteLetterByKey_c(){
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("c",testCipher.isEncrypted("a", 2));
    }
}