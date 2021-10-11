# jib-sample-app
jib-sample-app

~~~bash
./mvnw compile jib:dockerBuild
~~~

~~~bash
docker images
~~~

~~~bash
docker run -p 8080:8080 -it jibsampleimage
~~~

http://localhost:8080/

