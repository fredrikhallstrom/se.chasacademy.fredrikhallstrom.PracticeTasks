1. Varför passar List bättre än en array?
    För att en List har inte en fast storlek utan kan öka och minsk i poster, och ett
    filmregister är av natur nåt som aktivt ökar och minskar i storlek.

2. Vilka metoder använde du från List?
    .add, .get, .remove

3. Varför deklareras variabeln som List<Movie> istället för ArrayList<Movie>?
    För att enkelt kunna ändra mellan list typer utan att behöva skriva om hela koden, det
    man tappar i att inte använda ArrayList är just med ArrayList 3 metoder som i regel aldrig används.
    Alla andra metoder finns också i List. 
   
    Interface   |     Class
    List       ->     Arraylist
               ->     LinkedList
