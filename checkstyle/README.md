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
- Guarda el archivo `checkstyle-X.X-all.jar` en una carpeta de tu elección, por ejemplo, `C:\Checkstyle\` (en Windows) o `/usr/local/checkstyle/` (en Linux/Mac).

### 2. Configurar el Archivo de Reglas
Este proyecto incluye un archivo de configuración para Checkstyle llamado `checkstyle.xml`. Puedes usar este archivo para ejecutar el análisis siguiendo las reglas de estilo predefinidas.

### 3. Ejecutar el Análisis con Checkstyle
Sigue estos pasos para ejecutar Checkstyle en el código fuente del proyecto:

1. Abre una terminal en la carpeta raíz del proyecto.
2. Ejecuta el siguiente comando para analizar los archivos Java en la carpeta `src`:
   ```bash
   java -jar C:/Checkstyle/checkstyle-X.X-all.jar -c checkstyle.xml src



### Resumen de las instrucciones añadidas:
1. Instalación y descarga de Checkstyle.
2. Configuración del archivo de reglas (`checkstyle.xml`).
3. Instrucciones para ejecutar el análisis sobre los archivos Java.
4. Opciones adicionales para personalización.

Espero que te sea útil para tu proyecto. ¡Éxito!
