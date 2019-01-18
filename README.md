# Quote-of-the-Day
Quote of the Day Assignment

Quote of the day
Write a short program that, when started, prints a quote of the day on the screen.

The Quotes

1. "galileo": "eppur si muove"
2. "archimedes": "eureka!"
3. "erasmus": "in regione caecorum rex est luscus"
4. "socrates": "I know nothing except the fact of my ignorance"
5. "rené descartes": "cogito, ergo sum"
6. "sir isaac newton": "if I have seen further it is by standing on the shoulders of giants"

In the repository of your language, you will find a code file with the above quotes in it, assigned to a field or variable. Modify the program such that it outputs the quote of the dat in the following format:

```
C\> java Quote
Quote for Monday the 1th of February:
"Eureka!" -- Archimedes
```

A quote is printed between quotation marks, starts with a capital letter and ends with a full stop. If the quote ends with punctuation, do not add the full stop to the end of the sentence. For example eppur si muove becomes "Eppur si muove.", while eureka! becomes "Eureka!".

Names always start with a capital letter.

Select the quote by taking the day of the year and take the day as the index of the list. January 2nd is the second day of the year, so the quote should be "Eureka!" -- Archimedes, while January 3th gives the quote from Erasmus. If the list runs out of quotes, start again on the first quote. This means that January 1th, January 7th and January 13th all give the Galileo quote.

Learning goals:
- Immutable data
- String manipulation
- Date API
