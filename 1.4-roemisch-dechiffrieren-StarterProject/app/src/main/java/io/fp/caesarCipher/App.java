/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.caesarCipher;

public class App {

    public static void main(String[] args) {

        try {
            System.out.println(CaesarCipher.cipher("caesar", 3));
            System.out.println(CaesarCipher.decipher("fdhvdu", 3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
