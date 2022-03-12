# **PRÁCTICA 4 - ENTORNOS DE DESARROLLO**

<p style="font-size:14pt;font-weight:lighter">La Práctica 4 consiste en añadir la Práctica 3 a un nuevo repositorio en GitHub y aplicarle una serie de refactorizaciones, de forma que aprendamos a usar los diferentes comandos de Git para manejar un control de versiones.</p>

## Inicializar repositorio y subir los archivos

- Para empezar debemos inicializar un nuevo repositorio en nuestra carpeta local dónde se encuentra la Práctica 3.
  Para ello nos situamos en el directorio mencionado y usamos el comando:

```
git init
```

- A continuación podemos añadir los archivos **README.md** y **.gitignore**.
  Creamos los archivos dentro del directorio usando, por ejemplo:

```
touch README.md
touch .gitignore
```

<p style="background-color:beige;padding:1em;border-radius:10px;font-size:10pt;">El archivo <b>README.md</b> nos servirá para editar el presente texto en formato Markdown; donde iremos comentando el proceso que hemos seguido.<br />
El archivo <b>.gitignore</b> es un archivo en el que añadiremos los archivos que no queremos que sean rastreados por Git. En nuestro caso, hemos añadido el archivo en formato PDF de la Práctica 3, ya que no tiene relevancia en el código.</p>

- El siguiente paso es iniciar el repositorio remoto. Para llevar a cabo este paso nos dirigimos a la página web de [GitHub](https://github.com) y creamos un nuevo repositorio, el cual hemos llamado 'ed_practica3' ya que contendrá el código de la Práctica 3.

- Una vez hemos creado el nuevo repositorio debemos añadirlo como origen remoto a nuestro repositorio local. Esto lo conseguimos con el comando:

```
git remote add origin https://github.com/josep-castell-colom/ed_practica3.git
```

Ahora que tenemos vinculado nuestro repositorio local con el repositorio remoto ya estamos listos para subir los archivos.

En este punto es interesante conocer los tres estadios por los que pasarán nuestros archivos antes de ser subidos al repositorio remoto. Podemos ir comprobando el estado de los archivos con el comando:

```
git status
```

Usando este comando podemos ver en que estado se encuentran nuestros archivos:

1. En primer lugar, los archivos que hayan sido modificados se mostraran de color rojo en el apartado de archivos sin seguimiento(_untracked_).

2. El segundo estado es la fase _stage_. En este punto los archivos se muestran de color verde y están preparados para el commit.

3. La tercera fase es la fase de _commit_. Después de hacer _commit_, el comando _git status_ no mostrará los archivos, sinó que nos informará de que nuestro árbol de trabajo está actualizado.

- Para subir nuestros archivos, primeramente debemos añadirlos al índice, es decir, incluirlos en el área de _stage_. Esto lo logramos con el comando:

```
git add .
```

Aquí el punto (.) simboliza todos los archivos del directorio (sin incluir los que hemos añadido a _.gitignore_). También podríamos añadir archivos en concreto cambiando el punto por el nombre del archivo; en ese caso el comando sería, por ejemplo:

```
git add Persona.java
```

Ahora que tenemos los archivos en _stage_ podemos hacer el primer **commit**.

Cada _commit_ que hacemos es un punto concreto de nuestro proyecto en el que se guarda una especie de instantánea a la que podemos regresar en un futuro, ver los cambios que se llevaron a cabo e incluso saber quién los hizo y por qué.

Para facilitar ésta información es recomendable incluir un pequeño mensaje en cada _commit_ explicando breve y concisamente los cambios que hemos hecho y por qué.

- Para hacer un commit se puede usar el siguiente comando:

```
git commit
```

El cual nos abrirá un editor de texto donde aparecen los archivos que se han modificado y donde debemos incluir el mensaje explicativo, guardar el archivo y salir.

También podemos hacer uso de la opción -m para atajar el paso del editor. De modo que el comando quedaría así:

```
git commit -m '<mensaje explicativo>'
```

Dónde \<mensaje explicativo\> sería la descripción, sin incluir los símbolos mayor que (>) ni menor que (<).