# A6 - A9
###Security headers  
**HSTS HTTP strict Transport Security**  
google arbejder på at hvis man først har været på en https server så kan man ikke komme tilbage til http  



**HPKP**  
for komplext. Er ved at blive faset ud  

**X-Frame-Options**  
<iframe> viser en anden side i et vindue
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
MIME type gætteri (browseren gætter også hvilken type det er)  
Kan sætte header til **`nosniff`** for at browseren ikke skal gætte.  

minimums krav til deployet server
helmet med alle indstillingher sat til. Og så kræves der måske lidt finetuning  

**Content-Security-Policy (CSP)**  
Finetuning af sikkerhed  
`Content-Security-Policy: default-src 'self'; style-src 'self' maxcdn.bootstrapcdn.com; font-src 'self'  https: data:`  
