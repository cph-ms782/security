# Week 11  

##A6: Security Misconfiguration + A9: Components with Known Vulnerabilities  
 

javascript kan f.eks. bruge helmet til at udnytte browser headers  

Exercise 1 A6, Using default settings
:  
Vi kan bruge nmap på server  

Ved login admin/1234:
http://dat-security.dk/secDemoA6/  
Man kan blive ved med at logge ind  
Login password vises i klar tekst  

[namp](a6-a9exercise_dat-security.dk.txt):  
`nmap -v -A -Pn -oN a6-a9exercise_dat-security.dk.txt dat-security.dk`  
Discovered open port 443/tcp on 138.197.235.123 - https  
Discovered open port 80/tcp on 138.197.235.123 - http  
Discovered open port 22/tcp on 138.197.235.123 - ssh  
Discovered open port 3306/tcp on 138.197.235.123 - mysql  

nmap -v -A -Pn -oN a6-a9exercise_dat-security.dk.txt dat-security.dk
der er mysql med  

 * OS
 **Ubuntu linux on tomcat - ses fra response header**  
 * Server Architecture (Come up with a “guess” and provide arguments for your suggestion)  
 **nginx reverse proxy nginx/1.14.0 (Ubuntu)**  
 * Server(s)  
 **linux, Nginx, Tomcat**  
 
 * Programming Language  
 **frontend: react javascript**  
 **backend: Java -> tomcat jax-rs - kan findes ved at lave forkert login samtidig med at man kigge på network tab i developer tools (A6 fejl) giver stacktrace i response**  
 
 * Important packages, classes used by the Programming Language  
 ****  

 * Can you see “what kind of pages” logged-in users will see, without having a way to log in?  
 ****  
 
 * Can you discover the client technologies used  
**React -> node_modules**  

 * Default users and Passwords = the ability to login  
 **admin/user: test**  
 
 * If you can make a successful login, can you: discover the algorithm used to “protect” the token, the lifetime of the token, the role, assigned to you by the system?  
 **json web token. Kan ses i javascript koden og den vil også komme med hvis man logger ind**  

 * How/where is the token stored by the client   
 **local storage**  

 * How long is it valid  
 **Kopier token til jwt.io og læs resultatet. ½ time exp time  
  token er en lavet af an hash algoritme. HS256 er pt ubrydelig**  

 * Can you determine/guess(must be qualified) whether front-end, REST back-end and Database is running on the same or on different servers?  
You are hereby granted permission to scan the server hosting the BACKEND  
 **IP for frontend: 138.197.235.123  
 IP for backend: 46.101.227.238 (kan ses i dev tools ved login f.eks.  headers)**  

 * Can you determine which database is used by the backend?  
 **mysql via nmap**  

 * Have you discovered any unnecessary features which are enabled or installed (e.g. unnecessary ports, services, pages, accounts, or privileges)  
 **port 22, 53, 80, 443, 9001, 9002, 9003**  
**CORS giver rettigheder til at alle hente fra alle andre adresser**  
**3306 var åbenbart også åben**  
 
 * Who owns the domain used for the server?    
 **nslookup eller dkhostmaster**  

## Exercise 2 A6, Security Headers  

 

## Exercise 3 A9, Components with Known Vulnerabilities  
JavaScript giver sikkerhed ved f.eks. `npm install` hvor der kommer info om usikkerheder.  
Github giver også check af usikkerheder og prøver at fixe dem automatisk  








