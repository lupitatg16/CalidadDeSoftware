# Proyecto de Análisis de Código con SonarQube

Este repositorio contiene ejemplos de código Java para ser analizados con SonarQube. El objetivo es que los estudiantes puedan ver cómo SonarQube detecta problemas de código como la **complejidad ciclomatica**, **código duplicado**, **posibles problemas de seguridad**, y más.

## Estructura del Proyecto

- **src/**: Contiene los archivos de código fuente Java:
  - `SistemaGestionInventario.java`: Sistema básico de gestión de inventarios.
  - `SonarQubeDemo.java`: Ejemplo que muestra diversos problemas que SonarQube puede detectar.

- **sonar-project.properties**: Archivo de configuración para SonarQube.

## Instrucciones para Ejecutar el Análisis con SonarQube

### 1. Instalación de SonarQube

- Para esta práctica, usaremos la versión gratuita de SonarQube: [SonarQube Community Edition](https://www.sonarsource.com/open-source-editions/sonarqube-community-edition/).
- Sigue las instrucciones de instalación en el siguiente enlace: [Instrucciones de instalación](https://docs.sonarsource.com/sonarqube/9.9/try-out-sonarqube/).
- Añade **SonarQube** al `PATH` de tu sistema para poder arrancar el servidor de SonarQube desde cualquier directorio.
- Una vez instalado y arrancado el servidor de SonarQube, abre un navegador web y ve a la siguiente dirección:
    http://localhost:9000/
Aquí deberías ver la pantalla de inicio de sesión de SonarQube.

Después de unos minutos (dependiendo de tu máquina), aparecerá la pantalla de LOGIN, firmate usando el user/password admin/admin  
y actualiza tu password

### 2. Instalación de SonarScanner

Para ejecutar el análisis del proyecto (si no está configurado con Maven), necesitas instalar **SonarScanner**, la herramienta que se encarga de enviar el código a SonarQube para su análisis.

2.1 Descarga e instala SonarScanner desde el siguiente enlace: [SonarScanner](https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner/).

2.2  Si esta bien instalado deberas ver varios directorios entre ellos uno conf
  ├── bin/                # Ejecutables de SonarScanner
  ├── conf/               # Archivo de configuración de SonarScanner (modificar según sea necesario)
  ├── jre/                # Máquina virtual Java integrada
  └── lib/                # Librerías necesarias para ejecutar el escáner
En ./conf asegurate de cambiar en el sonnar-scanner (archivo de propiedades) el URL del server de la siguiente forma:
    #----- SonarQube server URL (default to SonarCloud)
    sonar.host.url=http://localhost:9000

2.3  Añade **SonarScanner** al `PATH` de tu sistema para que puedas ejecutar el comando desde cualquier directorio. Sigue las instrucciones proporcionadas en la página de instalación para asegurarte de que esté configurado correctamente.

### 3. Crear un Proyecto en SonarQube

SonarQube es una herramienta diseñada para integrarse en entornos de desarrollo y pipelines, pero para esta práctica la ejecutaremos de manera local.

- Crea un proyecto local en SonarQube:
 - En la página de SonarQube, selecciona **Create Project** y elige la opción **Local project**.
 - Usa los ***Global Settings** por default, presiona **Create the project**
 - En **How do you want to analyze your repository?** selecciona nuevamente **Locally**
 - Deja por defult la llave y da click en **Generate**
  - Se generará un **token de seguridad** que necesitarás para ejecutar el análisis del proyecto localmente. Guarda este token para usarlo en el siguiente paso.
 - Deja lo que viene por default en **Provide a token** simplemente da click en **Continuar**
 - Selecciona la opción **Other** **(for JS.TS etc)** y selecciona tu sistema operativo
 - Sonarqube te generara algo como esto:
       "sonar-scanner.bat -D"sonar.projectKey=hola1" -D"sonar.sources=." -D"sonar.host.url=http://localhost:9000" -D"sonar.token=sqp_b425e93cdb5304f6424e5bd9226df4b5b05390f8""
       **COPIA ese comando** es el comando que usaras mas adelante.

### 4. Compilación de las clases de JAVA  archivos .java
Para que SonarQube pueda realizar un análisis completo, es **necesario compilar el proyecto** antes de ejecutar el escaneo. SonarQube utiliza el bytecode generado por la compilación para calcular métricas avanzadas, como la **complejidad ciclomatica**, y para realizar un análisis exhaustivo del flujo de control del código.

Si tu proyecto **NO** está en Maven:
- Asegúrate de haber instalado SonarScanner (como se indicó en el paso 2).
- Compila tu proyecto manualmente si es necesario, usando tu propio método de compilación.

### 5. Ejecutar el Análisis del Proyecto

5.1.  Abre un terminal en el **directorio raíz** de tu proyecto.
  debes tener una estructura mas o menos asi:

    ├── bin/               # Clases compiladas (.class)
    ├── src/               # Archivos fuente de Java (.java)
    ├── sonar-project.properties   # Configuración de SonarQube
    └── README.md          # Este archivo

  Asegúrate de tener el archivo sonar-project.properties configurado de la siguiente manera para que SonarQube pueda identificar correctamente los directorios:
    sonar.projectKey=mi-proyecto-java
    sonar.projectName=Analisis de Codigo Java
    sonar.projectVersion=1.0
    sonar.sources=src
    sonar.java.binaries=bin
    sonar.language=java

5.2. Para analizar el proyecto con SonarQube, debes ejecutar el comando de SonarQube desde el directorio padre que contiene los subdirectorios `src` y `bin`. Es importante estar en la raíz del proyecto para que SonarQube pueda encontrar ambos directorios correctamente.

### Pasos para ejecutar el análisis:

    1. Abre una terminal o línea de comandos.
    2. Navega al directorio padre del proyecto donde se encuentran ./bin y ./src como se explico anteriormente
   desde la linea de comandos ejecuta el comando que genero en el **#Paso #3**
   sonar-scanner -Dsonar.projectKey=<tu_project_key> -Dsonar.sources=. -Dsonar.host.url=http://localhost:9000 -Dsonar.login=<tu_token>

Opcionalmente puedes tu correr el comando con esto:
  Reemplaza <tu_project_key>con el nombre del proyecto que creaste en SonarQube.
  Reemplaza <tu_token>con el token de seguridad que generaste anteriormente.

Este comando enviará el código a SonarQube para que realice el análisis. La página web de SonarQube se actualizará automáticamente y mostrará el mensaje "Nuevo análisis en curso" .


 ### 6. Ver los Resultados del Análisis

Una vez que el análisis haya finalizado, podrás ver un informe detallado de los problemas y mejoras detectadas en tu código. Estos incluyen problemas como **complejidad ciclomatica**, **duplicación de código**, y posibles **vulnerabilidades de seguridad**.

Explora los **issues** detectados en tu código, revisa por qué SonarQube los marca como problemas, y reflexiona sobre las mejoras que puedes implementar.

### Para la entrega:

- Sube una captura de pantalla de los resultados en **Canvas**.
- Incluye una breve reflexión sobre el uso de SonarQube y cómo te ayudó a mejorar la calidad de tu código.