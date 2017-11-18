a)
Studer følgende kodelinjer:

    int first = 8;
    int second = 19;
    first = first + second;
    second = first – second;
    first = first – second;

First blir først deklarert som heltall og initialisert til verdien 8.
Second blir tilsvarende deklarert og initialisert, men til verdien 19.
First blir satt til (First + Second), altså (8+19) = 27.
Second blir satt til verdien (first - second), altså (27-19), altså 8.
First blir så satt til (first - second) igjen, denne gangen (27-8), som er 19.

b)
Vis hva output blir når følgende blir utført:


for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= 6; j++) {
    System.out.printf ("%4d", (i * j));
  }
  System.out.println();
}

output blir alle tall mellom og med 1 til 5, ganget med alle tall mellom og med 1 til 6.

c)
Studer koden i Vedlegg 1 og 2 og svar på følgende spørsmål:
* i hvilke linjer
  * deklareres metodene
    * vedlegg 1:
      * 14 -> setName
      * 18 -> setPricePerUnit;
      * 22 -> getName
      * 26 -> getPricePerUnit
      * 30 -> getData
    * vedlegg 2:
      * ingen metoder.
  * instansieres objekt
    * vedlegg 1
      * ingen objekt instansieres
    * vedlegg 2
      * 52 -> new GroceryItem(args)
  * deklareres referanser
    * vedlegg 1
      * ingen referanser
    * vedlegg 2
      * 51 -> referanse til GroceryItem
      * 53 -> referanse til GroceryItem
      * 57 -> referanse til System.out
  * deklareres konsturektøren
    * vedlegg 1
      * 5
      * 9
    * vedlegg 2
      * ingen eksiplisitt definert konstruktør i vedlegg
  * deklareres metoden som returnerer opplysninger om et objekt
    * vedlegg 1:
      * 22 -> getName
      * 26 -> getPricePerUnit
      * 30 -> getData
    * vedlegg 2:
      * ingen
  * kalles klassens metode(r)
    // tolker som at klassen gjør bruk av sine egne metoder
    * vedlegg 1
      * 10 -> setName
      * 11 -> setPricePerUnit
      * 31 -> getName
      * 32 -> getPricePerUnit
    * vedlegg 2
      * ingen
  * deklareres set-metodene
    * vedlegg 1
      * 14 -> setName
      * 18 -> setPricePerUnit
    * vedlegg 2
      * ingen
  * blir objektet referert til av referanse
    * vedlegg 1
      * ingen
    * vedlegg 2
      * 55 -> item1.getName();
      * 57 -> item1.getPricePerUnit();
  * deklareres fields
    * vedlegg 1
      * 2 -> name
      * 3 -> pricePerUnit
    * vedlegg 2
      * 51 -> item1
      * 53 -> item2
    * kalles konstruktøren
      * vedlegg 1
        * ingen
      * vedlegg 2
        * 52 -> new GroceryItem(args)
    * gis klassen fields verdi
      * vedlegg 1
        * 6 -> name og pricePerUnit
        * 10 -> name, gjennom setName -> 14
        * 11 -> pricePerUnit, gjennom setPricePerUnit -> 18
      * vedlegg 2
        * 52 -> item1
        * 55 -> name
