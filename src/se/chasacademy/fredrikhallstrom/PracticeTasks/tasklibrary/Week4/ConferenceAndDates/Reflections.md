1. Varför används LocalDate istället för String?
    För att variabeln skall sparas i rätt format(Klassen LocalDate bestämmer formatet)

2. Vad är fördelen med ISO-format?
    Att det följer en standard som används överallt och förenklar därmed användandet mellan olika 
    länder med olika "tidsformat", sidenote, Unix time finns också och räknar dagar från 1970-01-01 00:00

3. När skulle LocalDateTime vara mer lämpligt?
    När ett klockslag även behövs användas i bokningen, tex. hyra av släpvagn i 4 timmar eller 36 timmar.