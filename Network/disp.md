# Network  

Layers  

 * Application  
 HTTP, DNS(UDP), FTP, POP, Telnet...   
 * Transport   
TCP  (Transmission Control Protocol)  
UDP (User Diagram Protocol)  
Sender bidder af pakker videre?
 * Internet  
Adresse
 * Network  
MAC adresser  



### Wireshark (startes med sudo)  
Eksamen  
Gem små samples af billeder fra wireshark  
Vælg netwærk -> Host ip der skal monitoreres  


### Ping:  
**$ ping dr.dk**  
PING dr.dk (159.20.6.38) 56(84) bytes of data.
64 bytes from 159.20.6.38 (159.20.6.38): icmp_seq=1 ttl=249 time=5.33 ms
64 bytes from 159.20.6.38 (159.20.6.38): icmp_seq=2 ttl=249 time=4.76 ms
64 bytes from 159.20.6.38 (159.20.6.38): icmp_seq=3 ttl=249 time=5.94 ms
^C
--- dr.dk ping statistics ---
3 packets transmitted, 3 received, 0% packet loss, time 2003ms
rtt min/avg/max/mdev = 4.768/5.350/5.948/0.489 ms
(base) martin@HP-ProBook-650-G1 ~/NetBeansProjects/4.sem/  
 
**ping 165.22.217.196**   Bangalore, Indien
PING 165.22.217.196 (165.22.217.196) 56(84) bytes of data.
64 bytes from 165.22.217.196: icmp_seq=1 ttl=46 time=255 ms
64 bytes from 165.22.217.196: icmp_seq=2 ttl=46 time=276 ms
64 bytes from 165.22.217.196: icmp_seq=3 ttl=46 time=196 ms  

### Traceroute  
(sudo)traceroute -I IP   (Bangalore)
traceroute to 165.22.217.196 (165.22.217.196), 30 hops max, 60 byte packets
 1  _gateway (10.50.128.1)  3.972 ms  3.995 ms  4.512 ms  
 2  * * *  (ikke reagertbart svar)
 3  * * *  
 4  5.179.80.193 (5.179.80.193)  3.564 ms  5.180 ms  5.183 ms  
 5  93.176.95.62 (93.176.95.62)  69.269 ms  69.323 ms  70.074 ms  
 6  212.73.252.53 (212.73.252.53)  6.327 ms  5.669 ms  3.588 ms  
 7  * * *  
 8  ix-ae-18-0.tcore1.fr0-frankfurt.as6453.net   (195.219.50.49)  15.720 ms  15.762 ms  17.221 ms  
 9  if-ae-45-2.tcore2.fr0-frankfurt.as6453.net   (195.219.50.21)  29.447 ms  28.919 ms  28.919 ms  
10  if-ae-9-2.tcore1.fnm-frankfurt.as6453.net (5.23.30.16)    29.146 ms  30.857 ms  29.785 ms  
11  if-ae-6-2.tcore1.av2-amsterdam.as6453.net   (195.219.194.149)  27.451 ms  27.463 ms  27.736 ms  

Time-to-live: Pakker har en begrænset levetid (så man ikke kan lægge internettet ned)
en pakker dør når Time-to-live er på nul  


** dns i wireshark **  
cat /etc/resolv.conf  
Viser nameserver

255.255.255.255 Multicast adresse. Rammer alt på netværket  


