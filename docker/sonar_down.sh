#!/bin/bash
docker rm $(docker ps -a -q --filter="name=sonarqube_lts")
docker rmi sonarqube:lts
docker volume rm $(docker volume ls -qf dangling=true)
