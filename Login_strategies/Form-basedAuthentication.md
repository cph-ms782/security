# Form-based authentication

Hoved funktionen ved FBA er dens evne til at autentificere sig imod forskellige brugere og roller.

Tillader udvikleren at kontrollere udseendet og følelsen af login-godkendelsesskærmbillederne ved at tilpasse login-skærmen og fejlsiderne, som en HTTP-browser præsenterer for slutbrugeren.

Når form-baseret godkendelse er erklæret, forekommer følgende handlinger.

**Usecase**

**Fordele**  

 * Du har fuld kontrol over authentication koden, så du er ikke afhængig af eksterne systemer.  
 * Du har fuld kontrol over udseendet på login formen, denne form for fleksibilitet er ikke tilgængelig i de andre authentication metoder.  
 * Det virker i enhver browser, fordi det bruger standard HTML som bruger interface.  

**Ulemper**  

 * Du skal lave din egen login interface, du skal lave din egen login side helt fra bunden.  
 * Du skal opretholde et katalog med alle user credentials, fordi du er ansvarlig for at vedligeholde alle detaljer omkring brugere med adgang til dit system. – Dette er som regel ikke tilfældet i andre former for authentication.  
 * Du bliver nødt til at tage yderligere hensyn at alle user credentials bliver sent i ren tekst fra browser til server, dette gør at alle der kan lytte til forbindelsen vil have direkte adgang til dine brugeres oplysninger.  

![Formbased auth](FormBaseAuth.png)l
