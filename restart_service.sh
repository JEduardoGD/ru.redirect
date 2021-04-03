#!/bin/bash

IMAGE_NAME="jeduardogd/ru.redirect:latest"

docker rm $(docker stop $(docker ps -a -q --filter ancestor=${IMAGE_NAME} --format="{{.ID}}"))
docker pull ${IMAGE_NAME}
docker run -d -e TZ=America/Mexico_City --restart unless-stopped --env-file ./vars.env ${IMAGE_NAME}