# data-exfiltration
Windows javascript file and folder exfiltration

# requirements
requires node-js on the target for the js to run
you can only send files as attachments, not folders, however you can specify multiple files to send in one email.

# abilities
powershell.txt can execute multiple powershell commands <br />
powershell.txt can store the output of previous commands into a variable and use it for future commands <br />
powershell.txt can send multiple attachments in one email <br />

# process
upon execution JS file opens Powershell <br />
turns text stored at link into string <br />
interprets string as powershell commands and executes them <br />
powershell commands sends specified files as attachments in an email <br />
attacker can sign into email and view the files <br />

# alternate method
open powershell via terminal <br />
run oneliner<br />

# To-do
figure out how to get js to run on devices without node-js<br />
 
