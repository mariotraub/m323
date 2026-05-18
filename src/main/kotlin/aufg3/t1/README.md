# Pure vs Impure
| Aufgabe | Nur ein Rückgabewert | Resultat nur Abhängig von übergebenen Parametern | Verändert keine existierenden Werte | pure oder impure |
|---------|----------------------|--------------------------------------------------|-------------------------------------|------------------|
| 1.1     | [x]                  | [ ]                                              | [ ]                                 | impure           |
| 1.2     | [x]                  | [x]                                              | [x]                                 | pure             |
| 1.3     | [ ] (excpetion)      | [x]                                              | [x]                                 | pure             |
| 1.4     | [x]                  | [ ]                                              | [x]                                 | impure           |
| 1.5     | [ ] (exception)      | [x]                                              | [x]                                 | pure             |
| 1.6     | [x]                  | [x]                                              | [ ]                                 | impure           |

