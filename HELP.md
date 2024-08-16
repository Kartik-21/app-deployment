# Getting Started

docker pull tomcat:9.0.93-jre17

docker run -d -p 8080:8080 --name my-container tomcat:9.0.93-jre17

docker ps
docker images

docker stop container_id
docker rm container_id
docker rmi image_id

docker build -t xyz:1.0.0 .

for running tomcat
1. set the CATALINA_HOME
2. set user_role

for deploying war
1. for new version of spring boot (jakarta api) use tomcat >=10.0
2. create war file with extend SpringBootServletInitializer class
3. deployed in server

for static site
1. add file in to webapps folder
