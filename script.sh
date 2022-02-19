#!/bin/bash
mvn clean compile
mvn -B package
java -jar target/javabank-1.0-SNAPSHOT.jar

# shebang:
# chmod +x script.sh #give permission
# ./script.sh # run script