# 1.3 BMI-Rechner

Für den Gesundheitscheck einer Krankenkasse soll eine Anwendung programmiert werden die mithilfe eines BMI-Rechners, die Klassifizierungen des Körpers eines Anwenders berechnet und speichert. Einem Anwender wird demnach die Möglichkeit geboten, durch das eingeben seiner Größe und seines Gewichts, einen BMI-Wert berechnet zu bekommen und eine BMI-Kategorie zu sehen. Des Weiteren kann ein Anwender eine Historie und Statistiken seiner letzten Berechnungen einsehen.  


- (a)	Schreiben Sie zunächst eine Klasse BMICalculator, welche die statische Methode double computeBMI(double weight, double height) throws BMICalculatorException beinhaltet. Die Methode soll für die übergebene Körpergröße und das Gewicht, den BMI berechnen und zurückgeben. Tritt jedoch der Fall aus, dass die übergebenen Werte außerhalb der üblichen Werte für einen Erwachsenen Menschen liegen, soll eine BMICalculatorException (erweitert java.lang.Exception) geworfen werden.

- (b)	Vervollständigen Sie nun die Methode public static Category getCategory(double bmi) welche sich im Aufzählungstyp Category befindet. Bisher wird für einen übergebenen BMI lediglich überprüft in welcher Kategorie sich dieser befindet. Nun soll jedoch zusätzlich überprüft werden, ob der Übergebene BMI überhaupt eine Kategorie zuzuordnen ist. Lässt sich der Wert, keiner Kategorie zuordnen, so soll eine CategoryException (erweitert java.lang.RumtimeException) geworfen werden.

- (c)	Vervollständigen Sie nun die Mehtode public void executeHealthCheck(double weight, double height) der Klasse HelathCheck. Diese Methode soll zunächst mithilfe des BMICalculator, einen BMI für die übergebenen Werte berechnen. Anschließend soll ein Calculation Objekt mit diesem BMI und der dazugehörigen Kategorie erstellt werden und der Liste history hinzugefügt werden. Abschließend kann nun das Calculation Objekt zurückgegeben werden.

- (d)	Vervollständigen Sie nun die Methode double printAverageBMI() der Klasse HealthCheck. Diese Methode soll den durchschnittlichen BMI, der Calculation Objekte der Liste history zurückgeben.
