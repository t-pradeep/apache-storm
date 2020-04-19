# apache-storm

## Team Members Slide


## Prerequisities
- OpenJDK or JDK (8 or up)
- Apache Maven

## Install OpenJDK
You may want to install OpenJDK. For example, using Chocolatey:

Open PowerShell as Administrator (anywhere) and run
```PowerShell
Choco Install OpenJDK -y
RefreshEnv
```
Or:
```PowerShell
Choco upgrade all -y
RefreshEnv
```
For setting information use below site:
- https://github.com/denisecase/kafka-api

## Install Maven
Install Maven. Follow the instructions provided or use Chocolatey:

Open PowerShell as Administrator (anywhere) and run:
```powershell
choco install maven -y
refreshenv
```
Verify Installations
Open PowerShell here as Administrator and run:
```powershell
java -version
mvn -v
```

## Set/Verify Environment Variables

Important! Verify each path exists using the Windows File Explorer.

Your paths may be different - these are the ones on my machine:
```
 JAVA_HOME       C:\Program Files\OpenJDK\jdk-14 
 M2_HOME         C:\ProgramData\chocolatey\lib\maven\apache-maven-3.6.3   
```
## Set/Verify Path
System Path should include the following (using the variable or the full path works - you don't need both)

Using variables:
```
%JAVA_HOME%\bin
%M2_HOME%\bin
```
## Verify Installations
Open PowerShell here as Administrator and run:
```powershell
java -version
mvn -v
```






## References
- https://docs.microsoft.com/en-us/azure/hdinsight/storm/apache-storm-develop-java-topology
- https://github.com/denisecase/kafka-api




