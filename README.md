# **PRÁCTICA 4 - ENTORNOS DE DESARROLLO**

La Práctica 4 consiste en añadir la Práctica 3 a un nuevo repositorio en GitHub y aplicarle una serie de refactorizaciones, de forma que aprendamos a usar los diferentes comandos de Git para manejar un control de versiones.

Para empezar debemos inicializar un nuevo repositorio en nuestra carpeta local dónde se encuentra la Práctica 3.
Para ello nos situamos en el directorio mencionado y usamos el comando:
~~~
git init
~~~
A continuación podemos añadir los archivos README.md y .gitignore.
Creaos los archivos dentro del directorio usando, por ejemplo:
~~~
touch README.md
touch .gitignore
~~~
El archivo README.md nos servirá para editar el presente texto en formato Markdown; donde iremos comentando el proceso que hemos seguido.
El archivo .gitignore es un archivo en el que añadiremos los archivos que no queremos que sean rastreados por Git. En nuestro caso, hemos añadido el archivo en formato PDF de la Práctica 3, ya que no tiene relevancia en el código.

El siguiente paso es iniciar el repositorio remoto. Para llevar a cabo este paso nos dirigiremos a la página web de [GitHub](https://github.com) y crearemos un nuevo repositorio, el cual hemos llamado 'ed_practica3' ya que contendrá el código de la Práctica 3.

Una vez hemos creado el nuevo repositorio debemos añadirlo como origen remoto a nuestro repositorio local. Esto lo conseguimos con el comando:
~~~
git remote add origin https://github.com/josep-castell-colom/ed_practica3.git
~~~
