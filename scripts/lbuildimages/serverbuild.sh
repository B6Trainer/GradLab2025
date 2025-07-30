#!/bin/bash
source ./constants.sh

if [ -z "$1" ]; then
    echo "Usage: serverbuild.sh <VERSION_TAG>"
    exit 1
fi

VERSION_TAG=$1
IMAGE_TAG="core-server-$VERSION_TAG"


echo "Image name : $IMAGE_NAME"

cd $SERVER_HOME || { echo "Failed to change directory"; exit 1; }

echo "########################   Starting to Build Server Image ###################################"
echo "Current Building Directory: $(pwd)"

build_server_jar() {
    echo "########################   STEP 1: Building the Server Jar  ###################################"
        
    # Run the Maven build command
    ./mvnw clean install -DskipTests
    if [ $? -ne 0 ]; then
        echo "Failed to build server jar."
        exit 1
    fi
}

build_docker_image() {
    echo "########################   STEP 2: Building the Docker Image  ###################################"
    
    echo "Building Docker image from Docker file $DOCKERFILE_PATH"
    echo "Building Image name : $IMAGE_NAME:$IMAGE_TAG"
    docker build -f "$DOCKERFILE_PATH" -t "$IMAGE_NAME:$IMAGE_TAG" .
    if [ $? -ne 0 ]; then
        echo "Failed to build Docker image."
        exit 1
    fi
}

build_server_jar

# Check if the build_server_jar function succeeded before proceeding
if [ $? -eq 0 ]; then
    build_docker_image
else
    echo "Server jar build failed, skipping Docker image build."
    exit 1
fi

docker images

echo "########################   End of the Build  ###################################"
cd $SCRIPTS_HOME/lbuildimages || { echo "Failed to change directory"; exit 1; }
