# apache-storm

## Prerequisities
- OpenJDK or JDK (8 or up)
- Apache Zookeeper, installed and working
- Python 2.7
- Apache Storm, installed and working

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

## Zookeeper Installation
Click the link for download page https://zookeeper.apache.org/releases.html
Download latest version (Apache ZooKeeper3.6.0)
To extract tar file, navigate to downloads folder and Open PowerShell as Administrator and run
```PowerShell
tar -zxf .\apache-zookeeper-3.6.0-bin.tar.gz
Move-Item -Path .\apache-zookeeper-3.6.0-bin\ -Destination C:\
```
For configuration, Open PowerShell as Administrator (from anywhere) and run
```PowerShell
 cd \apache-zookeeper-3.6.0-bin
 copy conf\zoo_sample.cfg conf\zoo.cfg
```
## Storm Installation
Click the link for download page https://storm.apache.org/downloads.html
Download latest version (apache-storm-2.1.0.tar.gz)
To extract tar file, navigate to downloads folder and Open PowerShell as Administrator and run
```PowerShell
tar -zxf .\apache-storm-2.1.0.tar.gz
Move-Item -Path .\apache-storm-2.1.0\ -Destination C:\
 ```
 For configuration, Open PowerShell as Administrator (from anywhere) and run
```PowerShell
cd C:\apache-storm-2.1.0\
copy conf\zoo_sample.cfg conf\zoo.cfg
```
## Set/Verify Environment Variables
Verify other system environment variables.

Important! Verify each path exists using the Windows File Explorer.

Your paths may be different - these are the ones on my machine:
```
 JAVA_HOME       C:\Program Files\OpenJDK\jdk-14 
 ZOOKEEPER_HOME  C:\apache-zookeeper-3.6.0-bin   
 STORM_HOME      C:\apache-storm-2.1.0           
```
## Set/Verify Path
System Path should include the following (using the variable or the full path works - you don't need both)

Using variables:
```
%JAVA_HOME%\bin
%ZOOKEEPER_HOME%\bin
%STORM_HOME%\bin
```
## Start Zookeeper Service
Start Zookeeper service. Open PowerShell As Administrator (from anywhere) and run the following.

Note the port and keep the window open. Zookeeper will run on default port 2181, you can change the default port in the zoo.cfg file.
```PowerShell
zkServer
```
## Start Storm Service
For each deamon, open a separate command prompt.

### Nimbus

### Supervisor
### Storm UI




