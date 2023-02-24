# 1.9 Buchausleihe


Die Bibliothek der Hochschule Reutlingen benötigt eine neue Anwendung um die Ausleihe der Bücher zu überwachen. Konkret besitzt die Bibliothek der Hochschule diverse Exemplare verschiedener Bücher, welche von den Studenten der Hochschule ausgeliehen werden können. 
Es existieren bereits einige Klassen der Anwendung. Ein Student hat beispielsweise einen Namen, ein Studienfach und eine Matrikelnummer. Die Klasse Buch hingegen repräsentiert ein reales Buch welches von einem Studenten ausgeliehen werden kann. Hierfür hat die Klasse Buch die Attribute: Name, Autor, ISBN, ExemplarID, currentBorrower, sowie eine Liste welche zeigt wer dieses Buch bereits ausgeliehen hat (previousBorrower) und ein Boolean Wert welcher repräsentiert ob es momentan ausgeliehen ist (isBorrowed).
Ergänzen Sie nun die Anwendung in der Klasse Library. Die Bibliothek besitzt eine Map (libraryCatalogue), welche sämtliche Bücher der Bibliothek beinhaltet. Der Schlüssel der Map ist die ISBN eines Buches (Integer). Der Value besteht aus einer Liste von Büchern mit dieser ISBN (List<Book>) (Bekannterweise hat die Bibliothek mehrere Exemplare eines Buches).

- a)	Implementieren Sie die Methode public Book getAvailableBook(int isbn). Die Methode soll überprüfen ob mindestens eine Ausgabe des Buches mit der übergebenen ISBN momentan nicht ausgeliehen ist. Ist ein Buch nicht ausgeliehen, so soll dieses Buch zurückgegeben werden. Wenn jedoch sämtliche Exemplare des Buches ausgeliehen sind, so kann null zurückgegeben werden.

- b)	Implementieren Sie die Methode public void borrowBook(int isbn, Student student). Diese Methode soll für den über die Parameter übergebenen Studenten, ein Exemplar eines Buches mit dieser ISBN ausleihen. Hierfür soll zunächst geprüft werden ob ein Exemplar dieses Buches verfügbar ist (Hinweis: die Methode getAvailableBook(int isbn) wurde bereits implementiert).Wenn ein Exemplar des Buches verfügbar ist, so soll die Variable isBorrowed des Buches auf True gesetzt werden und der Student als currentBorrower gesetzt werden.

- c)	Implementieren Sie die Methode public void returnBook(int isbn, int exemplarID). Die Methode das Buch anhand der über die Parameter übergebenen Werten im libraryCatalogue finden und die Eigenschaften so ändern, dass der currentBorrower null und isBorrowed false ist.

- d)	Implementieren Sie die Methode public List<Book> getBooksOfStudent(Student student). Die Methode soll eine Liste sämtlicher Bücher zurückgeben, welche der über die Parameter übergebene Student momentan ausgeliehen hat. (Hinweis: Bilden Sie eine äußere Schleife über die Map, so dass in einer inneren Schleife über die Listen (Values) iteriert werden kann und jedes Buch einzeln überprüft werden kann).
