# LSP
# Liskov Substitution Principle (LSP) – Java Examples 🚗🚆

Este repositorio contiene una implementación clara y educativa del **Principio de Sustitución de Liskov (Liskov Substitution Principle - LSP)**, uno de los principios fundamentales de SOLID en la programación orientada a objetos.

## 🧠 ¿Qué es el Principio de Sustitución de Liskov?

El Principio de Sustitución de Liskov establece que:

> "Las clases derivadas deben ser sustituibles por sus clases base sin alterar el comportamiento del programa."

En otras palabras, si una clase `Car` hereda de `Vehicle`, entonces deberíamos poder usar un `Car` donde sea que esperemos un `Vehicle`, sin errores ni comportamientos inesperados.

---

## 📦 Estructura del Proyecto

LSP/
├── interfaces/
│   ├── IMovable.java
│   └── ITurnable.java
├── vehicles/
│   ├── RoadVehicle.java
│   ├── RailVehicle.java
│   ├── Car.java
│   └── Train.java
└── Main.java

---

## 🛠️ Tecnologías

- Lenguaje: **Java 17+**
- Estilo de código: **CamelCase**, interfaces con prefijo `I` (opcional en Java)

---


