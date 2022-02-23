#!/bin/bash
mvn clean compile
mvn -B package
java -jar target/app-1.jar

# shebang:
# chmod +x script.sh #give permission
# ./script.sh # run script