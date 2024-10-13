# Proyecto de Análisis de Código con Checkstyle

Este repositorio contiene ejemplos de código Java para ser analizados con Checkstyle. El objetivo es que los estudiantes puedan ver cómo Checkstyle detecta problemas de código como complejidad ciclomatica, código duplicado, posibles problemas de seguridad, y más.

## Estructura del Proyecto

- **src/**: Contiene los archivos de código fuente Java:
  - `Class-EvaluacionDePrestamo.java`: Evaluación de préstamos.
  - `JuegoPiedraPapelTijera.java`: Un juego simple de piedra, papel o tijera.
  - `SistemaGestionInventario.java`: Sistema básico de gestión de inventarios.
  - `DemoCheckstyle.java`: Ejemplo que contiene diversos problemas de estilo y organización para ser detectados por Checkstyle.

## Instrucciones para Ejecutar el Análisis con Checkstyle

### 1. Instalar Checkstyle
Sigue estos pasos para instalar Checkstyle en tu máquina local:

- Descarga la última versión de Checkstyle desde el siguiente enlace: [Checkstyle Releases](https://github.com/checkstyle/checkstyle/releases).
- Guarda el archivo `checkstyle-X.X-all.jar` en una carpeta de tu elección, por ejemplo, `C:\Checkstyle\` (en Windows) o `/usr/local/checkstyle/` (en Linux/Mac), deberás tener el path exacto para ejecutarlo

### 2. Configurar el Archivo de Reglas
Este proyecto incluye un archivo de configuración para Checkstyle llamado `checkstyle.xml`. 
En este archivo estan las **reglas** que se usarán para que la herramienta cheque tu código
Puedes usar este archivo para ejecutar el análisis siguiendo las reglas de estilo predefinidas.
Aqui algunos ejemplos: 
   https://gerrit.googlesource.com/buck.git/+/6fa03adcec293dffe5ec79e6a3a80d7560183ada/checkstyle.xml 
   https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml


### 3. Ejecutar el Análisis con Checkstyle
Sigue estos pasos para ejecutar Checkstyle en el código fuente del proyecto:

1. Abre una terminal en la carpeta raíz del proyecto.
2. Ejecuta el siguiente comando para analizar los archivos Java en la carpeta `src`:
   ```bash
   java -jar C:/Checkstyle/checkstyle-X.X-all.jar -c checkstyle.xml src

  ejemplo:
  El archivo checkstyle.jar es un ejecutable de java **(tendrás que tener instalada la maquina virtual de java JVM)** - usa el comando:  java -version

Suponiendo que tienes el checkstyle.jar en un directorio ./tools y tambien el XML explicado en el punto #2 de este read.md esta en el mismo directorio y que el fuente .java esta en ./src ejecutarias el siguiente comando:
  java -jar ./tools/checkstyle-10.18.2-all.jar -c ./tools/cc_checks.xml ./src/EvaluacionDePrestamo.java

Si quieres ver el reporte en un file asi: 
  java -jar ./tools/checkstyle-10.18.2-all.jar -c ./tools/cc_checks.xml ./src/EvaluacionDePrestamo.java -o Reporte102024

**NOTA IMPORTANTE**
A diferencia de SonarQube, Checkstyle no requiere que el código Java esté compilado para realizar el análisis. Checkstyle trabaja directamente sobre los archivos fuente (`.java`), evaluando el cumplimiento de las reglas de estilo y las mejores prácticas de codificación. Esto lo hace ideal para integrar en el flujo de trabajo de desarrollo desde las primeras etapas, sin la necesidad de generar los archivos `.class` como lo haría una herramienta como SonarQube.



### Resumen de las instrucciones añadidas:
1. Instalación y descarga de Checkstyle.
2. Configuración del archivo de reglas (`checkstyle.xml`).
3. Instrucciones para ejecutar el análisis sobre los archivos Java.
4. Opciones adicionales para personalización.

Espero que te sea útil para tu proyecto. ¡Éxito!
