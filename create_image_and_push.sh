#!/bin/bash

##the image name will be username/module:version
IMAGE_NAME="jeduardogd/ru.redirect:latest"

#check if the image exists and store result in RES var
RES=`docker images -q "$IMAGE_NAME" 2> /dev/null`

#if docker image exists delte them
if [[ $RES != "" ]]; then
	echo "delete ${RES}"
	docker rmi -f ${RES}
fi

#create docker image
docker build -t ${IMAGE_NAME} .

#push docker image
docker push ${IMAGE_NAME}
