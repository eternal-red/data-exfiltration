# data-exfiltration
Windows javascript file and folder exfiltration

# process
upon execution JS file opens Powershell <br />
turns text stored at link into string <br />
interprets string as powershell commands and executes them <br />
powershell commands sends specified files as attachments in an email <br />
attacker can sign into email and view the files <br />

#alternate method
run script in powershell through commandline <br />
powershell stored at C:\Windows\System32\WindowsPowerShell\v1. 0\ <br />
# To-do
figure out how to run the js file by itself without permission error <br />
figure out how to run the powershell.txt script without error<br />

# windows script host error
![image_thumb-26](https://user-images.githubusercontent.com/80001670/151039538-19fc2552-4af4-4aad-8577-13a04e136a46.png)
