1. Vilken typ har variabeln notifier
   Den är av typen Notifier men det som lagrats där är en EmailNotifier,
   man kan helt enkelt bara kalla på metoder som finns i Notifier

2. Vilken typ har objektet som skapas?
    Denna vart egentligen besvarad redan i ovan men den är av typen EmailNotifier
    
3. Varför fungerar detta?
    Detta fungerar pga arv mellan basklass och subklass men man tappar som sagt funktionalitet
    om man tillkallar Notifier.metodiEmailNotifier ((Detta kommer ej fungera))