# cucumber-T1
Proyecto de prueba con cucumber-jvm


ejecución con docker:
```
docker run -it --rm -v "$PWD":/usr/src/mymaven -v "$HOME/.m2":/root/.m2 -v "$PWD/target:/usr/src/mymaven/target" -w /usr/src/mymaven maven mvn test
```
