# ⚽ Proyecto Java – Simulación de competición de fútbol

## 📌 Descripción

Este proyecto es una aplicación desarrollada en **Java** cuyo objetivo es simular una competición de fútbol gestionando equipos, jugadores, entrenadores y partidos.

El programa permite crear equipos con sus plantillas, simular partidos entre ellos y gestionar temporadas completas. Además, incluye pruebas unitarias, manejo de excepciones personalizadas, estructuras de datos avanzadas y una interfaz gráfica sencilla para interactuar con el sistema.

El proyecto ha sido desarrollado como práctica para aplicar conceptos de **Programación Orientada a Objetos (POO)** en Java.

---

# 🧱 Estructura del proyecto

El proyecto está organizado en diferentes **paquetes** que separan la lógica del programa:

```
proyectoFeCiega
│
├── equipo
│   └── clases relacionadas con los equipos
│
├── jugador
│   └── clases relacionadas con jugadores y entrenadores
│
├── tests
│   └── pruebas unitarias del proyecto
│
└── Main
    └── punto de entrada de la aplicación
```

Esta organización permite mantener el código estructurado y fácil de mantener.

---

# 🧩 Clases principales

## 🏟 Equipo

Representa un equipo de fútbol.

Incluye información como:

* Nombre del equipo
* Número de títulos
* Presupuesto
* Clasificación
* Lista de jugadores
* Cuerpo técnico
* Patrocinadores

También permite:

* Añadir jugadores
* Eliminar jugadores
* Buscar jugadores por dorsal
* Mostrar la plantilla

---

## 🧍 Deportista

Clase que representa a un deportista perteneciente a un equipo.

Contiene atributos como:

* Nombre
* Dorsal
* Posición
* Otros datos deportivos

Esta clase puede servir como **base para otros tipos de deportistas**.

---

## 👔 Entrenador

Representa a un entrenador dentro del cuerpo técnico de un equipo.

Incluye información relacionada con su rol dentro del club.

---

## ⚽ Partido

Representa un partido entre dos equipos.

Permite gestionar:

* Equipo local
* Equipo visitante
* Goles de cada equipo
* Resultado final

Además, incluye validaciones para evitar:

* Equipos nulos
* Equipos iguales
* Goles negativos

---

## 🏆 Temporada

Representa una temporada completa de competición.

Permite almacenar información como:

* Año de la temporada
* Número total de partidos
* Premios o recompensas

---

# 🗂 Uso de colecciones

El proyecto utiliza varias estructuras de datos para gestionar la información.

### Listas (ArrayList)

Se utilizan para almacenar:

* Jugadores de un equipo
* Cuerpo técnico
* Patrocinadores

Estas listas permiten añadir, eliminar y recorrer elementos.

---

### HashMap

También se utilizan mapas para búsquedas rápidas, por ejemplo:

* Jugadores por dorsal
* Registros o estadísticas del equipo

Esto permite acceder a información de forma eficiente.

---

# ⚙️ Funcionalidades principales

El sistema permite:

✔ Crear equipos
✔ Gestionar plantillas
✔ Añadir o eliminar jugadores
✔ Simular partidos entre equipos
✔ Gestionar temporadas
✔ Mostrar información de equipos y jugadores
✔ Exportar datos a formato **JSON**

---

# 🧪 Pruebas unitarias

El proyecto incluye **tests unitarios con JUnit** para comprobar el correcto funcionamiento de varias clases.

Se han creado pruebas para clases como:

* `Equipo`
* `Partido`
* `Temporada`
* `Deportista`

Cada clase incluye varios tests que verifican:

* Creación correcta de objetos
* Validación de datos
* Comportamiento ante errores

También se incluyen **tests negativos**, que comprueban que el programa lanza excepciones cuando los datos no son válidos.

---

# ⚠️ Manejo de excepciones

El proyecto implementa **excepciones personalizadas** para controlar errores comunes, como por ejemplo:

* Datos inválidos
* Equipos incorrectos
* Valores negativos

Estas excepciones permiten detectar errores de forma controlada y mejorar la robustez del programa.

---

# 🖥 Interfaz gráfica

El proyecto incluye una **interfaz gráfica sencilla** que permite interactuar con el programa.

La interfaz permite:

* Introducir datos mediante un formulario
* Simular partidos entre equipos
* Mostrar resultados en pantalla

Esto facilita el uso del programa sin necesidad de trabajar directamente con el código.

---

# 📄 Gestión de archivos JSON

El proyecto permite trabajar con archivos **JSON** para almacenar información.

Se han implementado funciones para:

* **Escribir datos en JSON**
* **Leer datos desde JSON**

Esto permite guardar información de equipos o temporadas de forma estructurada.

---

# 🛠 Tecnologías utilizadas

* **Java**
* **Programación Orientada a Objetos (POO)**
* **JUnit** para pruebas unitarias
* **Colecciones de Java (ArrayList, HashMap)**
* **Interfaces gráficas en Java**
* **Formato JSON**

---

# 🎯 Objetivos del proyecto

Este proyecto tiene como objetivo aplicar conceptos fundamentales de programación como:

* Programación Orientada a Objetos
* Herencia
* Encapsulación
* Colecciones de datos
* Manejo de excepciones
* Pruebas unitarias
* Interfaz gráfica
* Lectura y escritura de archivos

---

# 👥 Autoría

Proyecto desarrollado por el grupo **Fe Ciega** para la asignatura de **Programación**.

Integrantes del grupo:

* Dani C.
* Carlos
* Nacho

---

# 🚀 Posibles mejoras futuras

Algunas mejoras que podrían añadirse en el futuro:

* Simulación completa de ligas
* Sistema de estadísticas de jugadores
* Mejora de la interfaz gráfica
* Persistencia avanzada de datos
* Sistema de clasificación automática de equipos

---
