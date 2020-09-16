#!/bin/bash
docker-compose -f DockercomposeDb.yml up
#docker volume rm $(docker volume ls -qf dangling=true)
