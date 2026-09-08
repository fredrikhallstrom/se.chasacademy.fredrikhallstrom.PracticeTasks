PaymentMethod payment = new SwishPayment("0701234567");

1. Vilken typ har variabeln payment?
    PaymentMethod

2. Vilken typ har objektet som skapas?
    SwishPayment

3. Vilken metod kommer att anropas när pay(100) körs?
    Eftersom PaymentMethod är ett interface som SwishPayment följer och metoden definieras i SwishPayment
    kommer pay(100) köras från SwishPayment.

4. Varför kan en SwishPayment lagras i en variabel av typen PaymentMethod?
    För att den bestämmer vad som ska finnas i SwishPayment genom att SwishPayment implementerar interfacet.

5. Varför kan ett CardPayment-, SwishPayment- och InvoicePayment-objekt lagras i samma array?
    Samma som ovan, alla dessa implementerar PaymentMethod.

6. Vilket är det huvudsakliga syftet med basklassen Payment i koden?
    A) Att göra det möjligt att lagra alla betalningar i samma array.
        
    * B) Att samla det gemensamma fältet för namnet och dess konstruktor på ett ställe.

    C) Att definiera metoden pay(double amount).