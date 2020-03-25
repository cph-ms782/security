# Week-09 SSH + Crypto - 1

## Læringsmål

Explain conceptually all the following terms, and how/why they are needed for SSH and TLS/SSL 

- **Symmetric Encryption**  
    Symmetrisk kryptering er en type kryptering, hvor en nøgle kan bruges til at kryptere meddelelser til den modsatte part, og også til at dekryptere de meddelelser, der er modtaget fra den anden deltager. Dette betyder, at enhver, der har nøglen, kan kryptere og dekryptere meddelelser til enhver anden, der har nøglen.  

    Symmetriske nøgler bruges af SSH til at kryptere hele forbindelsen.  

    Offentlige / private asymmetriske nøglepar, der kan oprettes, bruges kun til godkendelse, ikke til kryptering af forbindelsen  

    Der er forskellige symmetriske chiffersystemer, herunder AES, Blowfish, 3DES, CAST128 og Arcfour

- **Asymmetric Encryption**  
    Offentlige / private asymmetriske nøglepar, bruges kun til godkendelse af en SSH klient

    Asymmetrisk kryptering adskiller sig fra symmetrisk kryptering, idet der kræves to tilknyttede nøgler for at sende data i en enkelt retning. En af disse nøgler kaldes den private nøgle, mens den anden kaldes den offentlige nøgle.

    Den offentlige nøgle kan deles frit med enhver part. Den er knyttet til dens parrede nøgle, men den private nøgle kan ikke udledes fra den offentlige nøgle. Det matematiske forhold mellem den offentlige nøgle og den private nøgle tillader den offentlige nøgle at kryptere meddelelser, der kun kan dekrypteres af den private nøgle. Dette er en envejsevne, hvilket betyder, at den offentlige nøgle ikke har nogen evne til at dekryptere de meddelelser, den skriver, og heller ikke kan den dekryptere noget, den private nøgle måtte sende den.

    Den private nøgle skal holdes helt hemmelig og bør aldrig deles med en anden part. Dette er et nøglekrav for, at det offentlige nøgelparadigme kan fungere.  
    Gemmes i `~/.ssh/authorized_keys` filen i brugerens hjemmefolder på serveren. Serveren kan bruge den offentlige nøgle i denne fil til at kryptere en udfordringsmeddelelse til klienten. Hvis klienten kan bevise, at den var i stand til at dekryptere denne meddelelse, har den vist, at den ejer den tilknyttede private nøgle. Serveren kan derefter indstille miljøet til klienten.  

- **Hashing**  
    Kryptografiske hashfunktioner er metoder til at skabe en kortfattet "signatur" eller resume af et sæt information. Deres vigtigste kendetegn er, at de aldrig er beregnet til at blive vendt, de er næsten umulige at påvirke forudsigeligt, og de er praktisk talt unikke. 

    Hashes bruges hovedsageligt til dataintegritetsformål og til at verificere ægtheden af kommunikation.

    **HMAC**, eller **h**ash-based **m**essage **a**uthentication **c**odes

    Det anbefales generelt at kryptere data først og derefter beregne MAC. 
    
Explain what it takes to safely log in to an SSH server, without having to provide a password  
**En SSH-session er etableret i to separate trin.

- Den første er at blive enige om og etablere kryptering for at beskytte fremtidig kommunikation.
- Den anden fase er at autentificere brugeren og opdage, om der skal gives adgang til serveren.**    

Explain the term SSH-tunnel, and provide a practical example for its use

Explain conceptually the purpose of Symmetrical Encryption, Asymmetrical Encryption and hashing for an SSH-connection

Explain the steps you have to go through to set up a server with MySQL,  as secure as possible → 

- How can we limit the client IP's that can connect
- If set up to allow only localhost and a firewall that deny 3306, can we still connect “safely” from a remote server 
- how to set up an SSL connection that  anyone can use, 
- Demonstrate a client application (Java or whatever you prefer) running on a separate server that access the Database using SSL
- how to set up an SSL connection that requires clients to identify themselves with a certificate.

You decide the order in which you want to present these topics since you probably won’t have time to cover all the individual “pins”

# Week-13 Crypto - 2

Explain conceptually all the following terms, and how/why they are needed for SSH and TLS/SSL 

- Symmetric Encryption
- Asymmetric Encryption
- Hashing and MAC (Message Authentication Code)
- Cipher Suites
- Diffie–Hellman key exchange
- Digital Signatures
- Certificates
- Certificate Authorities and Certificate Trust Hierarchies

Feel free to introduce many of the terms using a saved Wireshark capture of a TLS-handshake

You decide the order in which you want to present these two topics since you probably won’t have time to cover all the individual “pins”

