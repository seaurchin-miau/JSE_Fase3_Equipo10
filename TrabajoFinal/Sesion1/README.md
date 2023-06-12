# Postwork #1

En este Postwork se creó el proyecto inicial en la página de Spring Initializr.

### Pasos
<li>
Ingresar a <b> https://start.spring.io/ </b> para crear nuestro proyecto con <b>maven</b>, SpringBoot 3.1.0, 
<b>Java</b> como lenguaje en la versión 17, el empaquetado <b>Jar</b>, y añadiendo la dependencia <b>Spring Web</b>.
</li>
<li>
Una vez descargamos y descomprimimos el proyecto se ejecuta el comando <b>"./mvnw clean package"</b>
</li>
<img src= ./Img/screen1.png>
<li>
Para ejecutar el proyecto utilizaremos el comando <b>"./mvnw spring-boot:run"</b>. Posteriormente, podemos ingresar a 
nuestro puerto 8080 <b>(http://localhost:8080/)</b> y ver la siguiente pantalla
</li>
<img src= ./Img/screen2.png>
<img src= ./Img/screen34.png>
<li>
Puesto que la aplicación está completamente contenida en un archivo jar, también es posible ejecutarla de otra forma.
Abrimos una terminal en el directorio "target", donde se encuentra nuestro archivo jar y ejecutamos el comando: <br>
<b>java -jar Sesion1-0.0.1-SNAPSHOT.jar</b><br>
Con ello se levantará nuevamente nuestra app en el puerto 8080.
</li>
<img src= ./Img/screen4.png>
