# 1.4 Römisch Dechiffrieren

Zum verschlüsseln von Nachrichten wurde im alten Rom der Verschiebechiffre verwendet. Hierbei wurde jeder Buchstabe eines Wortes, um einen bestimmten Zahlenwert im Alphabet verschoben.
Bei einem Schlüssel von 3 beispielsweise:

```sh
Klar:    a b c d e f g h i j k l m n o p q r s t u v w x y z
Geheim:  d e f g h i j k l m n o p q r s t u v w x y z a b c
```

Schreiben Sie eine Klasse CaesarCipher, welche die statischen Methoden cipher(String inputString, int key), decipher(String inputString, int key) sowie checkCipherProps(String inputString, int key) beinhaltet.

- (a)	a)	Die Methode checkCipherProps(String inputString, int key), soll zunächst prüfen ob der übergebene inputString leer ist. Ist dies der Fall, so soll eine ChiperException (erweitert java.lang.Exception) mit einer geeigneten Message geworfen werden. Des Weiteren soll geprüft werden ob der übergebene Schlüssel kleiner als 1 oder größer als 26 ist. Trifft dies zu, so soll auch in diesem Fall eine ChiperException mit einer geeigneten Message geworfen werden.

- (b)	b)	Die Methoden cipher(String inputString, int key) und decipher(String inputString, int key) hingegen, sollen einen übergebenen String um den übergebenen Schlüssel, im Alphabet verschieben. (Hinweis: Verwenden sie den Datentyp Character, um den Schlüssel auf die einzelnen Buchstaben anzuwenden). Berücksichtigen Sie hierbei, dass ausschließlich Kleinbuchstaben erlaubt sein sollen (Character von 97 bis 123). 

Schreiben Sie anschließend die TestKlasse CaesarCipherTest.java. Die Klasse soll folgende Tests beinhalten:
| Test-Methode | Beschreibeung |
| -------- | -------- |
| testChipher | Überprüft, ob die Methode cipher() einen String korrekt verschlüsselt. |
| testDechipher | Überprüft, ob die Methode decipher() einen String korrekt entschlüsselt. |
| testCheckChipherPropsZeroKey | Überprüft, ob die Methode checkCipherProps(), eine Exception wirft, wenn 0 als Schlüssel übergeben wird. |
| testCheckChipherPropsLargeKey | Überprüft, ob die Methode checkCipherProps(), eine Exception wirft, wenn ein Schlüssel größer 26 übergeben wird. |
| testCheckChipherPropsEmptyString | Überprüft, ob die Methode checkCipherProps(), eine Exception wirft, wenn ein leerer String übergeben wird. |
	
	
	
	
