# jib-sample-app
jib-sample-app

~~~bash
./mvnw compile jib:dockerBuild
~~~

~~~bash
docker images
~~~

~~~bash
docker run -p 8080:8080 -it jibsampleimage:1.0.0
~~~

http://localhost:8080/

