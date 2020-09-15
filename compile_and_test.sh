#!/bin/bash
# Usage: Hello World Bash Shell Script Using Variables
# Author: Vivek Gite
# -
JAVA_HOME="/home/geduardo/sft/java/jdk1.8.0_221"
MAVEN_HOME="/home/geduardo/sft/maven/apache-maven-3.6.1"

PATH="$PATH:$JAVA_HOME/bin:$MAVEN_HOME/bin"

VERSION=`date +"%Y%m%d_%H%M"`

mvn -v

mvn clean package -Dmaven.test.skip=true

if [[ "$(docker images -q jeduardogd/ru.redirect 2> /dev/null)" == "" ]]; then
	docker images -a | grep "jeduardogd/ru.redirect" | awk '{print $3}' | xargs docker rmi
fi

docker build -t jeduardogd/ru.redirect:latest .

docker tag jeduardogd/ru.redirect:latest jeduardogd/ru.redirect:$VERSION

docker push jeduardogd/ru.redirect:latest
docker push jeduardogd/ru.redirect:$VERSION