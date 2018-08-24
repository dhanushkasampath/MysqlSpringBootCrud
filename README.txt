you need to download the jdbc from below link

https://dev.mysql.com/downloads/connector/j/5.1.html

put it into the /usr/share/java/ folder (admin rights needed)

open /etc/environment.txt file and add the below line to it

export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java-5.1.47.jar
