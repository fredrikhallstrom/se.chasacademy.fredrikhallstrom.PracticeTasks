1. Ge ett exempel på polymorfism i din lösning.
    sendAlert() är ett exempel på polymorfism, den metoden gör olika saker beroende på vilken klass den tillhör

2. Vilken SOLID-princip gör det enkelt att lägga till exempelvis AppAlertSender? 
    OCP, Open-Closed Principle
3. Vilken SOLID-princip följs genom att arbeta mot interfacet WeatherAlertSender istället för de konkreta klasserna?
   Dependency Inversion Principle, man skall arbeta mot att skapa beroende mot abstraktion istället för implementationer.

4. Varför deklareras variabeln som List<WeatherAlertSender> istället för en konkret implementation som ArrayList<WeatherAlertSender>?
    För att man enkelt ska kunna ändra modell av lista senare utan att behöva ändra överallt i hel koden. (dock tappar man
     just i ArrayList 3 metoder, men det är oftast försumbart)

5. Hur skulle lösningen påverkas om alla typer av varningar hanterades i en enda klass?
    Varningarna måste anropas var för sig