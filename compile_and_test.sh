#!/bin/bash
# Usage: Hello World Bash Shell Script Using Variables
# Author: Vivek Gite
# -
JAVA_HOME="/home/geduardo/sft/java/jdk1.8.0_221"
MAVEN_HOME="/home/geduardo/sft/maven/apache-maven-3.6.1"

PATH="$PATH:$JAVA_HOME/bin:$MAVEN_HOME/bin"

VERSION=`date +"%Y%m%d_%H%M"`

mvn -v

mvn clean package

mvn sonar:sonar