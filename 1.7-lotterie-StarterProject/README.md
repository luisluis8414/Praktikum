# 1.7 Lotterie

Gegeben ist eine Anwendung welche eine Lottoziehung simulieren soll. Objekte der Klasse LotteryTicket, entsprechen hierbei einem realen Lotterielos. LotteryTickets, besitzen in diesem Fall einen playerName und die Menge der Zahlen welche der Spieler für die Ziehung ausgewählt hat (selectedNumbers). 
Mithilfe der Klasse Lottery, kann anschließend eine Ziehung definiert werden. Hierfür besitzt die Klasse Lottery eine Menge von angemeldeten LotteryTickets (tickets), sowie die Menge der tatsächlich gezogenen Zahlen (drawedNumbers) und gewisse Metadaten welche für die Ziehung benötigt werden, wie beispielsweise die Anzahl der zu ziehenden Zahlen, die Range der Zahlen und einen Jackpot.
Vervollständigen Sie die Anwendung, so dass die App Klasse erfolgreich ausgeführt werden kann.

- a)	Für die Simulation der Ziehung, wird die Implementierung der Methode public void checkTicket(LotteryTicket ticket) in der Klasse Lottery benötigt. Die Methode soll lediglich überprüfen ob die Zahlen des übergebenen Tickets, mit den Zahlen der Lottoziehung (drawedNumbers) übereinstimmen und somit der Jackpot geknackt wurde.
Ist dies der Fall, so soll der Name des Besitzers des Gewinnertickets ausgegeben werden und der Counter numberofWinners um eins erhöht werden.


Um nun die vollständige Auswertung des Tickets korrekt auf der Konsole ausgeben zu können, müssen die folgenden Methoden in der Klasse LotteryTicket korrekt implementiert werden:

- b)	Die Methode getWrongNumbers(Set<Integer> drawedNumbers) soll die Menge der Zahlen zurück geben welche falsch getippt wurden. (Hinweis: Die Differenz)

- c)	Die Methode getCorrectNumbers(Set<Integer> drawedNumbers) soll die Menge der Zahlen zurück geben welche Korrekt getippt wurden. (Hinweis: Die Schnittmenge)

- d)	Die Methode getMissingNumbers(Set<Integer> drawedNumbers) soll die Menge der Zahlen zurück geben welche gefehlt haben um den Jackpot zu gewinnen. (Hinweis: Die Differenz)
