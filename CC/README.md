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

1. Descarga e instala SonarScanner desde el siguiente enlace: [SonarScanner](https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner/).
2. Añade **SonarScanner** al `PATH` de tu sistema para que puedas ejecutar el comando desde cualquier directorio. Sigue las instrucciones proporcionadas en la página de instalación para asegurarte de que esté configurado correctamente.

### 3. Crear un Proyecto en SonarQube

SonarQube es una herramienta diseñada para integrarse en entornos de desarrollo y pipelines, pero para esta práctica la ejecutaremos de manera local.

1. Crea un proyecto local en SonarQube:
 - En la página de SonarQube, selecciona **Create Project** y elige la opción **Local project**.
 - Se generará un **token de seguridad** que necesitarás para ejecutar el análisis del proyecto localmente. Guarda este token para usarlo en el siguiente paso.

### 4. Compilación del Proyecto

Para que SonarQube pueda realizar un análisis completo, es **necesario compilar el proyecto** antes de ejecutar el escaneo. SonarQube utiliza el bytecode generado por la compilación para calcular métricas avanzadas, como la **complejidad ciclomatica**, y para realizar un análisis exhaustivo del flujo de control del código.

Si tu proyecto **NO** está en Maven:
- Asegúrate de haber instalado SonarScanner (como se indicó en el paso 2).
- Compila tu proyecto manualmente si es necesario, usando tu propio método de compilación.

### 5. Ejecutar el Análisis del Proyecto

1. Abre un terminal en el **directorio raíz** de tu proyecto.
2. Ejecuta el siguiente comando para ejecutar el análisis con SonarScanner usando el token generado en el paso 3 (puedes copiarlo directamente de SonarQube):
   ```bash
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