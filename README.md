#How to use this application 
Integrating both the application and the docker hub mysql,
I have add all the file to docker hub.
To access and run the application use Docker-compose.yml  file which is integrated with the root path of this application 
Using  terminal from directory where Docker-compose.yml, write the following command 
docker-compose up -d 


http://localhost:8080/login

user: ADMIN
password:1234

then hit : http://localhost:8080/load

Upon successful completion of data transfer from 
CSV to DB, after job message " COMPLETED" will be displayed 


