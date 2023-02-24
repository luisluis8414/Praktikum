# 1.12 Dictionary

Der Hintergrund dieser Aufgabe ist ein englisches Wörterbuch, welches als txt-Datei gespeichert existiert. Beispielhaft, sieht dies wie folgt aus:

Apple : Apfel
Banana : Banane
Cat : Katze
Dog : Hund


Das Wörterbuch und somit die txt-Datei dient der Grundlage einer Anwendung. Genauer ist eine Anwendung gegeben, welche es ermöglicht mit dem Wörterbuch zu interagieren. Das bedeutet, dass Wörter abgefragt, hinzugefügt oder entfernt werden können. Hierfür beinhaltet die Anwendung, die Klasse Dictionary.java, welche eine Map (dictionary) besitzt.
Damit nun jedoch die txt-Datei als Grundlage verwendet werden kann muss die Anwendung dahingegen ergänzt werden, dass die Wörter der txt-Datei über IO-Streams einlesen und verändert werden können.

- a)	Damit die Informationen der txt-Datei als Grundlage verwendet werden können, wird eine Methode benötigt welche die Wörter der Datei ausließt und in der Map dictionary speichert. Implementieren Sie hierfür die Methode public void loadDictionary(String filename) throws IOException. Lesen Sie innerhalb dieser Methode die Informationen der Datei Zeile für Zeile aus und fügen Sie diese der Map hinzu. 

(Hinweis: Da die Wörter durch einen Doppelpunkt getrennt sind und wir das englische Wort als Key und das deutsche als Value verwenden möchten, muss der ausgelesene String einer Zeile gesplittet werden.
Mithilfe des folgenden Methodenaufrufes kann dies erfolgen: String[] wordsArray = line.split(" : ");
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String))

- b)	Um nun das Wörterbuch aktualisieren zu können, wird eine Methode benötigt, welche den Inhalt der Map dictionary in die txt-Datei schreibt. Implementieren Sie hierfür die Methode public void createDictionaryTXT() throws IOException. Überprüfen Sie zunächst ob bereit eine Datei namens dictionary.txt exisiert, ist dies nicht der Fall, so soll diese zunächst erstellt werden. Schreiben Sie Abschließend sämtliche Wörter der Map in die txt-Datei. Achten Sie hierbei darauf, dass das Schema eingehalten wird (“englisches Wort :  deutsches Wort“).
