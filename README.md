<img align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img align="right" width="250" style="float: right;" src="logos/LogoMoodleOscuro.png">

<br/><br/>

# Práctica 2 - Arrays y Excepciones

## Contenido

- [Práctica 2 - Arrays y Excepciones](#práctica-2---arrays-y-excepciones)
  - [Contenido](#contenido)
  - [Introducción](#introducción)
  - [Objetivos](#objetivos)
  - [Requisitos Previos](#requisitos-previos)
  - [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
  - [Actividades de la práctica](#actividades-de-la-práctica)
    - [Creación del proyecto](#creación-del-proyecto)
    - [Creación de la clase Inventario.java](#creación-de-la-clase-inventariojava)
    - [Extensión de la clase PruebaInventario.java](#extensión-de-la-clase-pruebainventariojava)
  - [Entrega de la práctica](#entrega-de-la-práctica)
  - [Evaluación](#evaluación)

## Introducción

Durante este curso, se realizarán prácticas orientadas a modelar el inventario de dispositivos médicos en un hospital. En sistemas de gestión hospitalarios reales existen modelos similares, aunque para simplificar la práctica y ajustarla al temario, se han tomado ciertas simplificaciones en el diseño que en un sistema profesional del campo de la ingeniería no serían tolerables. Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

En esta práctica, desarrollaremos una clase `Inventario` para gestionar dispositivos médicos en distintas ubicaciones de un hospital. Dicha clase incluirá métodos para manejar dispositivos en sus correspondientes almacenes, obtener información y gestionar el inventario.

Se recomienda leer el enunciado completo antes de comenzar la práctica.

## Objetivos

- Manejo de arrays de varias dimensiones
- Creación y gestión de excepciones
- Reutilización de métodos

## Requisitos Previos

Disponer de un entorno de desarrollo como Eclipse que permita desarrollar programas en el lenguaje de programación Java.

## Temas relacionados con la práctica

Temas 2, 3, 4 y 5 del temario del curso.

## Actividades de la práctica

### Creación del proyecto

Se pueden utilizar distintos entornos de desarrollo (IDEs) para desarrollar código Java, pero para esta práctica se darán indicaciones para **Eclipse**.

En Eclipse debe seguir los siguientes pasos:

- Descargue de Github el fichero ZIP correspondiente a _Práctica 2 - Main_, pulsando el botón _Code -> Download ZIP_.
- Importe el proyecto con _Import -> Existing Projects into Workspace_ e indique la localización del fichero ZIP descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg24.p2**, siguiendo el convenio de nomenclatura de paquetes: Práctica 2 (**p2**) de la asignatura FPRG Curso 2023-2024 (**fprg24**) de la Universidad Politécnica de Madrid (**upm**), Departamento de Ingeniería de Sistemas Telemáticos (**dit**), en España (**es**).
- También encontrará las clases ``PruebaInventario.java``, ``Tipo.java`` y ``DispositivoMedico.java``.

### Creación de la clase Inventario.java

En esta tarea, se debe crear la clase `Inventario` en el paquete correspondiente. Esta clase representa el inventario de dispositivos en un hospital, distribuidos en múltiples plantas, almacenes y armarios. La clase debe incluir los siguientes atributos:

- `hospital`, tipo `String`: nombre del hospital asociado.
- `dispositivos`, tipo `DispositivoMedico[][][]`: array tridimensional que representa la estructura de almacenamiento de dispositivos. Las dimensiones representan, respectivamente, [planta][almacén][armario].

Además, deben implementarse todos los métodos indicados en el documento **Especificación de la clase Inventario.pdf**, disponible en este repositorio. 

> [!TIP]
> Recomendamos que no leáis el PDF directamente desde Github, sino que os lo descarguéis y lo abráis desde vuestro ordenador.

No se requiere seguir un orden estricto al desarrollar los métodos, aunque se recomienda seguir el orden por el que aparecen en la sección `Method details` de la especificación. Esto se debe a que algunos de los métodos anteriores podrían ser útiles para probar o desarrollar el resto de métodos requeridos.

**IMPORTANTE**: La clase `DispositivoMedico` (ya creada en el proyecto) ha sido modificada para la presente práctica. Revise las modificaciones y téngalas en cuenta cuando desarrolle la clase `Inventario` pedida. Las
modificaciones han sido las siguientes:

- El atributo tipo ha pasado a ser del tipo enum Tipo (en la práctica 1 era de tipo String).
- El método `enGarantia` ahora recibe un parámetro de tipo `int` correspondiente al año actual.

### Extensión de la clase PruebaInventario.java

La clase `PruebaInventario` incluye la creación de algunos dispositivos de ejemplo en su método `main` que servirán para verificar el funcionamiento de los métodos de `Inventario`. Esta clase se encuentra en el proyecto descargado de Github y pertenece al paquete **es.upm.dit.fprg24.p2**.

La tarea consiste en extender esta clase, añadiendo pruebas que cubran todas las funcionalidades de `Inventario`. Una vez que considere que su versión de `Inventario` cumple todos los requisitos, podrá proceder a su entrega a través de Moodle, como se expone en el último apartado.

## Entrega de la práctica

La práctica debe entregarse mediante el enlace habilitado en Moodle antes de las 23:55 del **XXX de Noviembre de 2024**.

Para realizar la entrega, se debe generar un fichero .zip con el proyecto exportado, que debe contener todas las carpetas y ficheros asociados. Para exportar el proyecto en Eclipse, siga estos pasos:

- Asegúrese de que el proyecto está seleccionado en el explorador de paquetes de Eclipse.
- Haga clic derecho sobre el proyecto y seleccione «Export».
- Seleccione «Archive File» (en la pestaña «General») y pulse «Next».
- Asegúrese de que el proyecto está seleccionado y todos los archivos están incluidos.
- Pulse «Browse» para seleccionar el directorio y nombre del archivo ZIP que se generará.
- Suba el archivo ZIP a Moodle.

## Evaluación

La evaluación consistirá en una prueba escrita en la que se resolverán ejercicios relacionados con los temas de la práctica. Estos ejercicios deberán ser resueltos de forma individual.