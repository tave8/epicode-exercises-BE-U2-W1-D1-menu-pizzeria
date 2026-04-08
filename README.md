# Entities

```
Menu 
    nome
    elementiMenu: lista elemento menu


ElementoMenu (astratta)
    nome
    calorie


Ingrediente (concreto) estende ElementoMenu
    


Topping (concreta) estende Ingrediente
    prezzo


Pizza (concreta) estende ElementoMenu
    basePizza: lista di ingrediente       
    toppings: lista di topping
    combinazioneTopping: la combinazione di topping   
   
   
Bevanda (concreta) estende ElementoMenu
    quantita: quantita in millilitri
    percentualeAlcool: opzionale


CombinazioneTopping 
    nome: nome del topping
    listaTopping: lista di topping


Ordine (concreta)
    tavolo
    elementiMenu
    numeroOrdine
    statoOrdine: in corso, pronto, servito
    numeroCoperti
    dataEOraAggiunto
    calcolaImportoTotale()
   
Tavolo (concreta)
    numeroTavolo
    numeroCopertiMassimo
    statoTavolo: occupato, libero
    

```
