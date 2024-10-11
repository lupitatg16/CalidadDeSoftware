# Proyecto de Análisis de Código con SonarQube

Este repositorio contiene ejemplos de código Java para ser analizados con SonarQube. El objetivo es que los estudiantes puedan ver cómo SonarQube detecta problemas de código como complejidad ciclomatica, código duplicado, posibles problemas de seguridad, y más.

## Estructura del Proyecto

- **src/**: Contiene los archivos de código fuente Java:
  - `Class-EvaluacionDePrestamo.java`: Evaluación de préstamos.
  - `JuegoPiedraPapelTijera.java`: Un juego simple de piedra, papel o tijera.
  - `SistemaGestionInventario.java`: Sistema básico de gestión de inventarios.
  - `SonarQubeDemo.java`: Ejemplo que muestra diversos problemas que SonarQube puede detectar.

- **sonar-project.properties**: Archivo de configuración para SonarQube.

## Instrucciones para Ejecutar el Análisis con SonarQube

1. Instala [SonarQube](https://www.sonarqube.org/) en tu máquina local.
2. Abre un terminal en la carpeta raíz del proyecto.
3. Ejecuta el siguiente comando para analizar el proyecto con SonarQube:

   ```bash
   sonar-scanner


Uso de SonarQube.
SonarQube es una herramienta de análisis estático de código, que nos ayuda a tener un
código más limpio.
En esta práctica usarás sonarQube para analizar un proyecto en el que hayas trabajado en
el pasado o ejemplos de la profesora
Usaremos esta version gratuita:
https://www.sonarsource.com/open-source-editions/sonarqube-community-edition/
Sigue las instrucciones en:
https://docs.sonarsource.com/sonarqube/9.9/try-out-sonarqube/
Al arrancar el servidor, puedes apuntar tu browser a este sitio:
http://localhost:9000/
Y probablemente encuentres la pantalla de iniciando....

Después de unos minutos (dependiendo de tu máquina), aparecerá la pantalla de LOGIN, firmate usando el user/password admin/admin  
y actualiza tu password

SonarQube es una herramienta diseñada para correr en ambientes de desarrollo, dentro de un 'pipeline', no tiene mucho sentido correrla de manera local. Solo para fines de la práctica crearemos un proyecto local:
  Create project
  Local project


En el ejemplo usaré el código de Java que se encuentra en mi github

Para tu práctica toma algún proyecto tuyo o que te de la profesora.
Tiene que ser un proyecto con git, y la rama principal debe tener el nombre de la rama mayor en git: master o main.
Para este ejemplo de práctica usaremos todos los settings por defecto

IMPORTANTE
A fin de analizar el proyecto de manera local, creamos un token de seguridad, que nos permitirá subir el código al servidor
  Provide a token - generate a token (30 days)
  Run analysis of your project

Y obtenemos las instrucciones para analizar el proyecto de manera local:
  Analyze your project  (el token de arriba)

El token que creaste en el paso anterior aparece en la linea de comandos.
Si tu proyecto no es ni Java o .NET, necesitas descargar la herramienta SonarScanner:
https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner/

Añade el sonarscanner a el path de tu sistema, y ejecuta el comando que aparece en "other"
Al ejecutar esto el comando, la página de web se actualiza, mostrando el mensaje: "New analysis in progress"

Al final aparecerá el reporte.

Explora un rato en los issues de tu código, y ve la razón por la que se consideran problemas.
Sube a canvas una imagen de esto, y añade una reflexión de el uso que le das a esta herramienta.