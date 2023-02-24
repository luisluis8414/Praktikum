# 1.6 Container

Gegeben ist ein Hamburger Logistik-Unternehmen. Das Unternehmen liefert verschiedenste Fracht innerhalb von Containern über die ganze Welt. Um die Organisation dieser Container besser kontrollieren zu können, benötigen sie nun ein Programm, welches das Gewicht der Fracht kontrolliert, so dass ein Container nicht mehr überbucht werden kann. Ein Container kann bekanntermaßen verschiedenste Dinge transportieren, jedoch teilt sämtliche Fracht gewisse Attribute.
- (a)	Schreiben Sie zunächst die abstrakte Klasse Cargo (Fracht). Die Fracht besitzt ein Namen und ein Gewicht, sowie die dazugehörigen Getter- & Setter-Methoden und die toString()-Methode.
- (b)	Konkret werden hauptsächlich Klamotten (Clothes) und Elektrogeräte (ElectricalDevices) verfrachtet. Die beiden Klassen erben somit von der Klasse Cargo und implementieren den super Konstruktor. 
- (c)	Schreiben Sie nun die Klasse Container. Ein Container verfügt neben einem Eigengewicht und einem Maximalgewicht, über eine Liste von Frachtgütern, welche dieser geladen hat. Gehen Sie hierbei sicher, dass Verschiedenste Frachtgüter in die Liste ausgenommen werden können. 
- (d)	Des Weiteren besitzt die Klasse Container, die Methode loadContainer(), welche, nachdem überprüft wurde ob das Maximalgewicht überschritten wurde, ein Frachtgut der Liste hinzufügt. 
- (e)	Zudem sollten die Methoden unloadContainer() und unloadCargo() einersteis den gesamten Container Leeren und zurückgeben und andererseits ein gefordertes Objekt aus dem Container entfernen und zurückgeben. 
