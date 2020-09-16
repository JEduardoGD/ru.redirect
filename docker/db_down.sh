#!/bin/bash
docker rm $(docker ps -a -q --filter="name=mysql_docker")
docker rm $(docker ps -a -q --filter="name=phpmyadmin-docker")
docker rmi mysql:5.7.28 phpmyadmin/phpmyadmin:edge 
docker volume rm $(docker volume ls -qf dangling=true)
