<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoMoodleOscuro.png">

<br/><br/>



# Práctica 2 - Arrays y excepciones

## Contenido

-   [Introducción](#introducción)
-   [Objetivos](#objetivos)
-   [Requisitos Previos](#requisitos-previos)
-   [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
-   [Actividades de la práctica](#actividades-de-la-práctica)
    -   [Creación del proyecto](#creación-del-proyecto)
    -   [Creación de la clase UnidadHospitalizacion.java](#creación-de-la-clase-unidad-hospitalizacion.java)
    -   [Extensión de la clase PruebaUnidadHospitalizacion.java](#extensión-de-la-clase-prueba-unidad-hospitalizacion.java)
-   [Evaluación](#evaluación)
-   [Entrega de la práctica](#entrega-de-la-práctica)



## Introducción

Durante este curso, se van a realizar una serie de prácticas para modelar el registro de pacientes en un hospital. Dentro de los sistemas de gestión de hospitales, encontraremos modelos similares al que se va a desarrollar en estas prácticas.

No obstante, para ser coherentes con el temario desarrollado en las clases teóricas, se asumirán ciertas simplificaciones que en un sistema profesional del campo de la ingeniería no serían tolerables. Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

En esta segunda práctica, vamos a desarrollar una clase para gestionar la hospitalización de pacientes en el hospital. Dicha clase contendrá una serie de métodos para gestionar los pacientes en las habitaciones disponibles, y obtener distinta información sobre ellos.

A partir de este punto, se enuncian las diferentes actividades a desarrollar en esta práctica. Se recomienda leer y comprender el enunciado entero antes de comenzar a trabajar.


## Objetivos

- Manejo de arrays de varias dimensiones
- Creación y manejo de excepciones
- Reutilización de métodos

## Requisitos Previos

Disponer de un entorno de desarrollo como Eclipse que permita desarrollar programas en el lenguaje de programación Java.


## Temas relacionados con la práctica

Temas 2, 3, 4 y 5 del temario del curso.


## Actividades de la práctica

### Creación del proyecto

Existen diferentes entornos de desarrollo (IDEs) para desarrollar código Java, pero tanto en esta práctica como en las siguientes, se darán indicaciones para [**Eclipse**](http://www.eclipse.org).

En Eclipse debe seguir los siguientes pasos:

- Descargue de Github pulsando sobre el botón _Code->Download ZIP_ el fichero zip que encontrará en la entrada _Práctica 2 - Main_.
- Importe el proyecto con _Import->Existing Projects into Workspace_ e indique la localización del fichero zip descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg23.p2**, siguiendo el convenio más extendido de nomenclatura de paquetes: Práctica 2 (**p2**) de la asignatura FPRG Curso 2023-2024 (**fprg23**) del Departamento de Ingeniería de Sistemas Telemáticos (**dit**) de la Universidad Politécnica de Madrid (**upm**) de España (**es**).
- También encontrará las clases ``PruebaUnidadHospitalizacion.java``, ``Paciente.java`` y ``GrupoSanguineo.java``.
- Todas las clases que desarrolle deben de estar en el paquete _es.upm.dit.fprg23.p2_.

En este punto, ya deberíamos poder ver las tres clases mencionadas en nuestro espacio de trabajo y, si las abrimos, podremos ver su código, que se utilizará en la siguiente tarea.


### Creación de la clase UnidadHospitalizacion.java

En esta tarea, se debe crear una clase en el paquete de la práctica. Dicha clase será un modelo del área de hospitalización con diferentes plantas, pasillos y habitaciones. Para ello, la clase deberá tener los siguientes atributos:

- nombre, tipo String.
- pacientes, tipo Paciente[][][], es decir, un array de tres dimensiones, las cuales representarán, respectivamente, [planta][pasillo][habitación].

Además, deben implementarse todos los métodos que se exponen en el documento **Especificación de UnidadHospitalizacion.pdf**, disponible en este repositorio. El orden en el que se desarrollan los métodos no es relevante. Sin embargo, se recomienda comenzar por los siguientes métodos:

- Constructor
- Getters y setters
- existeHabitacion
- habitacionOcupada
- ingresaPaciente
- getPaciente
- altaPaciente

Esto se debe a que algunos de los métodos anteriores podrían ser útiles para probar o desarrollar el resto de métodos requeridos.

**IMPORTANTE**: La clase Paciente (realizada en la práctica 1) ha sido modificada para la presente práctica. Revise las modificaciones y téngalas en cuenta cuando desarrolle la clase UnidadHospitalizacion pedida. Las
modificaciones han sido las siguientes:

- El atributo grupoSanguineo ha pasado a ser del tipo enum GrupoSanguineo (en la práctica 1 era de tipo String).

- Se han introducido tres nuevos atributos: historicoPresionDiastolica, historicoPresionSistolica e historicoTemperatura. Los dos primeros son un array de tipo int, que representa las últimas 5 mediciones de presión diastólica y sistólica (respectivamente) de un paciente, en mmHg. El tercero es un array tipo double, que representa las últimas 5 mediciones de temperatura corporal de un paciente, en ºC. En los tres casos se puede suponer que se realiza solo una medición por día, y que medición alojada en la última posición de cada array corresponderá a la medición realizada en el día actual.

### Extensión de la clase PruebaUnidadHospitalizacion.java

Para poder probar que la clase ``UnidadHospitalizacion.java`` funciona como se especifica en este enunciado, se proporciona una clase ``PruebaUnidadHospitalizacion``. Dicha clase está disponible en el proyecto descargado de Github, y contiene unas pruebas muy básicas en su método main que imprimen por pantalla algunos datos. La clase también se encuentra disponible directamente en el paquete _es.upm.dit.fprg21.p2_.

Esta tarea consiste en extender dicha clase para que las pruebas que se incluyen en el método main permitan comprobar todas las funcionalidades de la clase  ``UnidadHospitalizacion.java``. Una vez que considere que su versión de ``UnidadHospitalizacion.java`` cumple todos los requisitos de esta práctica, podrá proceder a su entrega a través de Moodle como se expone en el último apartado.

## Entrega de la práctica

La práctica debe entregarse mediante el enlace habilitado en Moodle antes de las 23:55 del **miércoles 22 de Noviembre de 2023**.

Se debe entregar el fichero .zip generado como resultado de exportar el proyecto. Dicho fichero debe contener todas las carpetas y ficheros asociados al proyecto. Para realizar la exportación, siga los siguientes pasos:

- Asegúrese de que tiene seleccionado el proyecto de la práctica en el explorador de paquetes de Eclipse.
- Pulse sobre el botón derecho del ratón (o «File» dentro de la barra de menú superior), y a continuación sobre «Export».
- Seleccione «Archive File» (dentro de la pestaña «General») en el menú que aparece, y pulse sobre el botón «Next».
- En la siguiente ventana, asegúrese de que el proyecto correspondiente a la práctica está seleccionado, junto con los ficheros alojados en su interior.
- Pulse el botón «Browse» para seleccionar el directorio donde quiere exportar el proyecto, y el nombre que le quiere dar.
- Suba a Moodle el fichero .zip que se ha generado como resultado de realizar los pasos anteriores, que se encontrará en la carpeta que haya seleccionado en el paso anterior.

## Evaluación

La evaluación consistirá en una prueba escrita en la que se deberá resolver de forma individual una serie de ejercicios relacionados con lo desarrollado en esta práctica.