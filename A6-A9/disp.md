# A6 - A9
* A6 - Security Misconfiguration
* A9 - Components with known vulnerabilities

##A6 - Security Misconfiguration
  * Missing appropriate security hardening across any part of the application stack, or improperly configured permissions on cloud services.
  * **Unnecessary features are enabled or installed (e.g. unnecessary ports, services, pages, accounts, or privileges)**
  * **Default accounts and their passwords still enabled and unchanged**
  * **Error handling reveals stack traces or other overly informative error messages to users**
  * For upgraded systems, latest security features are disabled or not configured securely.
  * The security settings in the application servers, application frameworks (e.g. Struts, Spring, ASP.NET), libraries, databases, etc. not set to secure values.
  * **The server does not send security headers or directives or they are not set to secure values.**
  * The software is out of date or vulnerable (see A9:2017-Using Components with Known Vulnerabilities).

###[Security headers](https://owasp.org/www-project-secure-headers/)  
**HSTS HTTP strict Transport Security**  
google arbejder på at hvis man først har været på en https server så kan man ikke komme tilbage til http  


**HPKP Public Key Pinning Extension for HTTP**  
HTTP Public Key Pinning (HPKP) is a security mechanism which allows HTTPS websites to resist impersonation by attackers using mis-issued or otherwise fraudulent certificates. (For example, sometimes attackers can compromise certificate authorities, and then can mis-issue certificates for a web origin.).  

for komplext. Er ved at blive faset ud  

**X-Frame-Options**  
X-Frame-Options response header improve the protection of web applications against Clickjacking. It declares a policy communicated from a host to the client browser on whether the browser must not display the transmitted content in frames of other web pages.  

iframe viser en anden side i et vindue  
Problemet med header hvor man sætter et andet vindue.
Hackere kan overtage dette til at lave en iframe som fylder hele siden.    
Header i response:
`Strict-Transport-Security: max-age=15552000; includeSubDomains`  

Header X-Frame-Options:  
X-Frame-Options: SAMEORIGIN  
man skal være på samme server  
Så man må godt benytte x-fram hvis den stammer fra samme side  

X-DNS-Prefetch-Control:  
X-Download-Options:  

**X-Content-Type-Options**  
Setting this header will prevent the browser from interpreting files as something else than declared by the content type in the HTTP headers.  

MIME type gætteri (browseren gætter også hvilken type det er)  
Kan sætte header til **`nosniff`** for at browseren ikke skal gætte.  

minimums krav til deployet server
helmet med alle indstillingher sat til. Og så kræves der måske lidt finetuning    


**Content-Security-Policy (CSP)**  
Finetuning af sikkerhed  
`Content-Security-Policy: default-src 'self'; style-src 'self' maxcdn.bootstrapcdn.com; font-src 'self'  https: data:`  

**X-XSS-Protection **  
This header enables the Cross-site scripting (XSS) filter in your browser.  

**X-Permitted-Cross-Domain-Policies**  
A cross-domain policy file is an XML document that grants a web client, such as Adobe Flash Player or Adobe Acrobat (though not necessarily limited to these), permission to handle data across domains. When clients request content hosted on a particular source domain and that content make requests directed towards a domain other than its own, the remote domain needs to host a cross-domain policy file that grants access to the source domain, allowing the client to continue the transaction. Normally a meta-policy is declared in the master policy file, but for those who can’t write to the root directory, they can also declare a meta-policy using the X-Permitted-Cross-Domain-Policies HTTP response header.  

**Referrer-Policy**  
The Referrer-Policy HTTP header governs which referrer information, sent in the Referer header, should be included with requests made.  

**Expect-CT**  
The Expect-CT header is used by a server to indicate that browsers should evaluate connections to the host emitting the header for Certificate Transparency compliance.  

**Feature-Policy**  
The Feature-Policy header allows developers to selectively enable and disable use of various browser features and APIs..  


## A9 - Components with known vulnerabilities  
JavaScript giver sikkerhed ved f.eks. `npm install` hvor der kommer info om usikkerheder.  
Github giver også check af usikkerheder og prøver at fixe dem automatisk. De har en feature der hedder dependabot, som automatisk fixer dependency problemer i koden, pånær man har fortalt den at den ikke skal testes.    


