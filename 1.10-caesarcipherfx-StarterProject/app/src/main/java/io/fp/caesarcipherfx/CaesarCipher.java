package io.fp.caesarcipherfx;

public class CaesarCipher {

    public String cipher(String inputString, int key) throws CipherException {
        checkCipherProps(inputString, key);
        StringBuilder encrypthedString = new StringBuilder();
    
        for (int i = 0; i < inputString.length(); i++) {
            Character c = inputString.charAt(i);
            if (c > 123 || c < 97) {
                throw new CipherException("The string contains capital characters");
            } else if ((char) (c + key) > 123) {
                encrypthedString.append((char) (97 + ((c + key) - 123)));
            } else {
                encrypthedString.append((char) (c + key));
            }
        }
        return encrypthedString.toString();
    }

    public String decipher(String inputString, int key) throws CipherException {
        checkCipherProps(inputString, key);
        StringBuilder decrypthedString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c > 123 || c < 97) {
                throw new CipherException("The string contains capital characters");
            } else if ((char) (c - key) < 97) {
                decrypthedString.append((char) (123 - ((c + key) - 97)));
            } else {
                decrypthedString.append((char) (c - key));
            }
        }

        return decrypthedString.toString();
    }

    public void checkCipherProps(String inputString, int key) throws CipherException {
        if (inputString.isEmpty()) {
            throw new CipherException("Your string is empty.");
        } else if (key > 26 || key < 1) {
            throw new CipherException("The string can not be encrypthed with the selected key");
        }
    }

}