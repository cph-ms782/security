# Basic HTTP-authentication

Specifying HTTP basic authentication requires that the server request a user name and password from the web client and verify that the user name and password are valid by comparing them against a database of authorized users in the specified or default realm.
Basic authentication is the default when you do not specify an authentication mechanism.
When basic authentication is used, the following actions occur.  

 * A client requests access to a protected resource.
 * The web server returns a dialog box that requests the user name and password.  
 * The client submits the user name and password to the server.  
 * The server authenticates the user in the specified realm and, if successful, returns the requested resource.  

![Bascic auth](basicHTTPAuth.png)  

