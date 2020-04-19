# 44517 Big data workshop team 07
# Storm 

## Team Members Slide
![Team Slide](https://github.com/pradeepkumartheegala/apache-storm/blob/master/docs/team-slide.png)

## Prerequisities
- OpenJDK or JDK (8 or up)
- Apache Maven
- Vscode

## Install Vscode
Open PowerShell as Administrator (anywhere) and run
```PowerShell
Choco Install vscode -y
RefreshEnv
```

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

## Install Maven
Install Maven. Follow the instructions provided or use Chocolatey:

Open PowerShell as Administrator (anywhere) and run:
```powershell
choco install maven -y
refreshenv
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
## Create Maven Project
Open command promt and run the below code after changing the ArtifactId (Project name) and GroupId
```cmd
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=storm-project -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

cd storm-project
```
Delete App.java in java folder and AppTest.java in test folder or use commands (check the path) to delete the folder
```powershell
DEL src\main\java\com\mycompany\app\App.java
DEL src\test\java\com\mycompany\app\AppTest.java
```
Create Resources folder inside main
```powershell
mkdir resources
```
To edit the pom.xml move to root directory of the project folder and run the below code in PowerShell
```powershell
code pom.xml
```
Add the dependencies
We need storm dependency we can find the dependencies from link https://mvnrepository.com/
search for storm and use any version

For adding build, repositories, and plugin in the pom.xml follow the https://docs.microsoft.com/en-us/azure/hdinsight/storm/apache-storm-develop-java-topology

Execution of project in cmd
```cmd
mvn compile exec:java -Dstorm.topology=com.mycompany.app.WordCountTopology
```
Output after running the project
![Output](https://github.com/pradeepkumartheegala/apache-storm/blob/master/docs/results.png)

## References
- https://docs.microsoft.com/en-us/azure/hdinsight/storm/apache-storm-develop-java-topology
- http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
- https://github.com/denisecase/kafka-api




