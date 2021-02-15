package models;

import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(true, testCipher instanceof Cipher);
    }
}