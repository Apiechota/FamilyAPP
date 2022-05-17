cd Spring-family
docker build --tag java-docker .
docker network create family_net
docker run --name my-h2 --network family_net -d buildo/h2database
docker create --name rodzina --network family_net --publish 8080:8080  java-docker:latest
cd ../Spring-familymember
docker build --tag java-docker2 .
docker create --name czlonkowie --network family_net --publish 8082:8082 java-docker2:latest
