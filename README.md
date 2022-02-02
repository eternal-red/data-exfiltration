# data-exfiltration
Windows javascript file and folder exfiltration

# exploit for outdated vulnerabilities
The javascript vulnerability uses the ActiveXObject vulnerability to get RCE. 
ActiveXObject was a vulnerability patched in 2021. (CVE-2021-40444)

The java vulnerability uses signed java applet's ability to gain privledge on the user device after the user accepts the applet. 
Applets could be included in html files and most browsers supported them until 2016. (CVE-2013-0431)

For the powershell script, you can only send files as attachments, not folders, however you can specify multiple files to send in one email.
Privledged files like passwd, shadow, and root directory files cannot be accesed automatically.

# powershell abilities
powershell.txt can execute multiple powershell commands <br />
powershell.txt can store the output of previous commands into a variable and use it for future commands <br />
powershell.txt can send multiple attachments in one email <br />

# process
the html page automatically executes the js and executes the java on user interaction<br />
the code opens Powershell and executes the oneliner in powershell<br />
the oneliner turns text stored at link into string <br />
interprets string as powershell commands and executes them <br />
powershell commands sends specified files as attachments in an email <br />
attacker can sign into email and view the files <br /><br />
a shell could be created in the powershell commands <br />
the output of commands that give information about the device could be sent to a file and that file sent as an attachment.

# manual explotation
open powershell via terminal <br />
run oneliner<br />

