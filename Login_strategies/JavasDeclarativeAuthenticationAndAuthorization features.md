# Java's declarative authentication and authorization features

**Container-managed security** (J2EE declarative security), og Java Authentication and Authorization Services (JAAS) er sikkerhedsteknologierne til godkendelse og godkendelse i Java 2 Enterprise Edition (J2EE) version 1.4 og nyere.  

Som standard tillader Oracle JAAS-sikkerhedsudbyderen, at brugerkontooplysninger og sikkerhedsroller kan gemmes på en af to placeringer: et filbaseret XML-format eller i et LDAP-bibliotek, der udnytter Oracle Internet Directory (OID).  

Man definere roller og brugere igennem web.xml filen
F.eks. giver man brugere der er medlemmer af USERS rollen afgang på følgende måde:
>     <security-constraint>
    <web-resource-collection>
        <web-resource-name>AllPublic</web-resource-name>
        <url-pattern>/</url-pattern>
    </web-resource-collection>
    <auth-constraint>
        <role-name>USERS</role-name>
    </auth-constraint>
</security-constraint>

Dette beskytter en webapplikation, der starter fra dens J2EE-rodkatalog som angivet gennem "/" mønsteret. For kun at anvende beskyttelse på undermapper, skulle mønsteret ændres til "/ undermappe-navn". Rollenavnet USERS er et logisk navn, der skal kortlægges til en eksisterende rolle.    


**Usecase**  

 * Når man alligevel bruger java  


**Fordele**  

* Du kan nemt ændre den måde, brugeren autentificerer udelukkende ved at konfigurere din server - uden at skulle ændre noget i din kode.
* Fordelen ved J2EE-erklæringssikkerheden er, at den kræver ringe eller ingen programmering af applikationsudvikleren, fordi de fleste af sikkerhedsbeslutningerne træffes under installationen. Denne model gør det også muligt at anvende ændringer til sikkerhedsdefinitionen uden at kræve genkodning i applikationen.
 *  Sikkerhed er unikt tilpasset applikationens behov.
 *  Sikkerhed er finkornet med applikationsspecifikke indstillinger.


**Ulemper**  

 * Kan være kompliceret at sætte sig ind i  
 * Applikationen er afhængig af sikkerhedsattributter, der ikke kan overføres mellem applikationstyper.
 * Support til flere protokoller gør denne type sikkerhed sårbar.
 * Data er tæt på eller indeholdt i sårbarhedspunktet.
