## Recuperacion
David Basantes

## Parte teorica
- Abstraccion : Para una clase abstracta se ocupa la palabra reservada abstract, lo cual nos permite tener metodos abstractos, pudiendo ocupar en otras clases realizando un Overrite el cual permite sobre escribir este metodo abstracto, cabe recordar que la abstraccion que es un proceso para poder ocultar detalles que el usuario no necesite.

Se lo puede ver en database en Agenda_mysql en el cual se encuentran todas las operaciones que se realizan en la base de datos esto no lo ve el usuario.

Otro ejemplo es en el App que para leer Fmlx lo hago sin ocupar codigo directamente 

- Encapsulamiento : No es mas que simplemente poner nuestros atributos o metodos con capsulas para que una persona o pueda verlas, accederlas  o simplemente no pueda ocupar, para esto existen tres palabras reservadas protec, public y private, esto se pone al inicio de nuestros atributos o metodos.

Public: como su nombre lo indica esto puede ser accedido por todos y todas las clases para ser ocupada

Private: Como su nombre lo indica solo se ocupa para la clase en la cual se definio

Protec: Esto sera accedido solo por aquellas clases en las cuales se define el paquete donde se encuentra lo que se desea ocupar con protec

En el caso de mi codigo ocupe todo publico esto lo encuentra en el controller en la database y en app no es recomendado pero por el tiempo si 

- Herencia : Como su nombre lo indica no es mas que simplemente heredar en este caso atributos o metodos que tengamos pre establecidos en una clase principa, a otra clase para que este puede ocuparlas y modificarlas, en el caso de ocupar herencia se pone en la clase que vaya a recibir la herencia la palabra reservada extends[Nombre de la clase que va a heredar]

En el caso de mi codigo lo realize en app para poder correr el programa realize un extends aplication

- Polimorfismo : El polimorfismo como su nombre lo indica no es mas en la cual una objeto puede adquirir varias formas, esto va muy de la mano con herencia, el polimorfismo permite crear o ejecutar dos o mas metodos con el mismo nombre esto es comun cuando se ocupa un constructor vacio y otro con parametros.

En el caso de mi codigo se ocupa polimorfismo en la sobre escritura dentro de App que permite leer el archibo fmlx de la aplicacion
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

