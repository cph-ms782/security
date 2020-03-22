# H1 Java’s declarative authentication and authorization features


Javas declarative authentication sikkerheds protocol hvilket håndtere brugers adgang til en bestemt applikation, hvor sikkerheden er igennem role based sikkerhed. Java 2 Enterprise Edition (J2EE) release 1.4 and above indeholder denne feature.

Javas declarative authentication/features gemmer brugerens informationer som enden en XML/LDAP. Fungere som en container af user som man specifi 



Eksempel på hvordan man kan give tilladelse til en gruppe af medlemmer til en applikation. 

XML format: 
web.xml:
<security-constraint>
    <web-resource-collection>
        <web-resource-name>AllPublic</web-resource-name>
        <url-pattern>/</url-pattern>
    </web-resource-collection>
    <auth-constraint>
        <role-name>USERS</role-name>
    </auth-constraint>
</security-constraint>
orion-web.xml
<security-role-mapping impliesAll="false" name="USERS">
   <group name="APP_USERS"/>
</security-role-mapping>

Fordelen ved at benytte denne form for sikkerhed er at det kræver næsten ingen programmerings erfaring, hvilket betyder at næsten en hver kan sætte det op uden at det skal koste virksomheden/brugeren noget

![Java auth](javaAuth.png)l
