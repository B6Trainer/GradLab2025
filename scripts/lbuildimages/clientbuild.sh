#!/bin/bash
source ./constants.sh

if [ -z "$1" ]; then
    echo "Usage: clientbuild.sh <VERSION_TAG>"
    exit 1
fi

VERSION_TAG=$1
IMAGE_TAG="tc-client-$VERSION_TAG"


echo "Image name : $IMAGE_NAME"

cd $CLIENT_HOME || { echo "Failed to change directory"; exit 1; }

echo "########################   Starting to Build Client Image ###################################"
echo "Current Building Directory: $(pwd)"

build_docker_image() {
    echo "########################   STEP 1: Building the Docker Image  ###################################"
    
    echo "Building Docker image from Docker file $DOCKERFILE_PATH"
    echo "Building Image name : $IMAGE_NAME:$IMAGE_TAG"
    docker build -f "$DOCKERFILE_PATH" -t "$IMAGE_NAME:$IMAGE_TAG" .
    if [ $? -ne 0 ]; then
        echo "Failed to build Docker image."
        exit 1
    fi
}

build_docker_image

docker images

echo "########################   End of the Build  ###################################"
cd $SCRIPTS_HOME/lbuildimages || { echo "Failed to change directory"; exit 1; }
