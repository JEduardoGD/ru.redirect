#!/bin/bash
docker-compose -f DockercomposeDb.yml --env-file /home/ubuntu/vars.env up -d
#docker volume rm $(docker volume ls -qf dangling=true)
