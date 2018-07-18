# cucumber-T1

Busco un sistema de test bdd:
* Basado en java
* Con lenguaje Gherkin (cucumber)
* maven
* docker
* Test sobre web en general (selenium)
* Test sobre RESTful con [REST Assured](http://rest-assured.io)
* Test sobre PL/SQL en BD
* Test sobre PrimeFaces

### Cucumber-jvm

Proyecto de prueba con cucumber-jvm en directorio cucumber-jvm-maven

ejecución con docker:
```
docker run -it --rm -v "$PWD":/usr/src/mymaven -v "$HOME/.m2":/root/.m2 -v "$PWD/target:/usr/src/mymaven/target" -w /usr/src/mymaven maven mvn test
```

### Cucumber + serenity + selenium

serenity no aporta nada en mi objetivo... dejo de lado. Es posible que lo retome más adelante.

### Cucumber + selenium

OK

### Cucumber + REST Assured
