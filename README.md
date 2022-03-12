# **PRÁCTICA 4 - ENTORNOS DE DESARROLLO**

<p style="font-size:14pt;font-weight:lighter">La Práctica 4 consiste en añadir la Práctica 3 a un nuevo repositorio en GitHub y aplicarle una serie de refactorizaciones, de forma que aprendamos a usar los diferentes comandos de Git para manejar un control de versiones.</p>

#### Inicializar repositorio y subir archivos
- [Inicializar repositorio](#inicializar-repositorio)
- [_Untracked_, _staged_ y _commit_](#untracked-staged-y-commit)
- [Etiquetas (_tag_)](#etiquetas-tag)
- [_Push_](#push)
- [_Pull_](#pull)

#### Nuevas ramas y actualizaciones
- [_Branch_](#branch)
- [_Checkout_](#checkout)

## Inicializar repositorio y subir archivos
### Inicializar repositorio

Para empezar debemos inicializar un nuevo repositorio en nuestra carpeta local dónde se encuentra la Práctica 3.
  Para ello nos situamos en el directorio mencionado y usamos el comando:

```
git init
```

A continuación podemos añadir los archivos **README.md** y **.gitignore**.
  Creamos los archivos dentro del directorio usando, por ejemplo:

```
touch README.md
touch .gitignore
```

> El archivo **README.md** nos servirá para editar el presente texto en formato Markdown; donde iremos comentando el proceso que hemos seguido.
> El archivo **.gitignore** es un archivo en el que añadiremos los archivos que no queremos que sean rastreados por Git. En nuestro caso, hemos añadido el archivo en formato PDF de la Práctica 3, ya que no tiene relevancia en el código.

El siguiente paso es iniciar el repositorio remoto. Para llevar a cabo este paso nos dirigimos a la página web de [GitHub](https://github.com) y creamos un nuevo repositorio, el cual hemos llamado 'ed_practica3' ya que contendrá el código de la Práctica 3.

Una vez hemos creado el nuevo repositorio debemos añadirlo como origen remoto a nuestro repositorio local. Esto lo conseguimos con el comando:

```
git remote add origin https://github.com/josep-castell-colom/ed_practica3.git
```

Ahora que tenemos vinculado nuestro repositorio local con el repositorio remoto ya estamos listos para subir los archivos.

### _Untracked_, _staged_ y _commit_
En este punto es interesante conocer los tres estadios por los que pasarán nuestros archivos antes de ser subidos al repositorio remoto. Podemos ir comprobando el estado de los archivos con el comando:

```
git status
```

Usando este comando podemos ver en que estado se encuentran nuestros archivos:

1. En primer lugar, los archivos que hayan sido modificados se mostraran de color rojo en el apartado de archivos sin seguimiento(_untracked_).

2. El segundo estado es la fase _stage_. En este punto los archivos se muestran de color verde y están preparados para el commit.

3. La tercera fase es la fase de _commit_. Después de hacer _commit_, el comando `git status` no mostrará los archivos, sinó que nos informará de que nuestro árbol de trabajo está actualizado.

Para subir nuestros archivos, primeramente debemos añadirlos al índice, es decir, incluirlos en el área de _stage_. Esto lo logramos con el comando:

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

Para hacer un commit se puede usar el siguiente comando:

```
git commit
```

El cual nos abrirá un editor de texto donde aparecen los archivos que se han modificado y donde debemos incluir el mensaje explicativo, guardar el archivo y salir.

También podemos hacer uso de la opción `-m` para atajar el paso del editor. De modo que el comando quedaría así:

```
git commit -m '<mensaje explicativo>'
```

Donde \<mensaje explicativo\> sería la descripción, sin incluir los símbolos menor que (<) ni mayor que (>).

También es posible realizar los pasos de _stage_ y _commit_ en uno sólo usando la opción `-a` del comando _commit_. De este modo el comando quedaría así:

```
git commit -a -m '<mensaje explicativo>'
```

En este caso sólo se incluirían los archivos modificados o suprimidos, pero no los nuevos, es decir, la opción `-a` añade al _commit_ los archivos que ya estan siendo seguidos por Git, pero no los recién agregados.
Aunque esta opción existe, no es muy recomendable ya que es más fácil añadir cambios no deseados al proyecto.

### Etiquetas (_tag_)

Llegados a éste punto ya podemos subir los archivos al repositorio remoto, sin embargo, vamos a realizar un pequeño paso antes y éste es añadir la etiqueta de versionado (_tag_). 
Es bueno conocer que hay dos tipos de etiquetas: la etiqueta ligera (_lightweight_) y la etiqueta anotada (_annotated_). La primera nos permite crear una etiqueta rápida, simplemente incluyendo su nombre:

```
git tag v1.0
```

La etiqueta anotada es un objeto que contiene, entre otras cosas, su nombre, el nombre del autor, la fecha y la descripción. Es recomendable usar las etiquetas anotadas para un mejor seguimiento del proyecto.
La sintaxis para este tipo de etiquetas es:

```
git tag -a v1.0 -m 'Versión 1.0 del proyecto'
```

### _Push_

Una vez hecho el _commit_ y añadida la etiqueta ya sólo nos falta subir los archivos. Para ello usaremos el comando:

```
git push -u origin main
```

> En este comando, _origin_ se refiere al repositorio remoto y _main_ se refiere a la rama local que queremos subir.
> La opción `-u` nos sirve para añadir el _upstream_ (seguimiento remoto) de cada rama que ha sido subida con éxito. De ésta forma podemos realizar `git push` y `git pull` sin necesidad de añadir cada vez los parámetros de repositorio y rama local.

### Pull

Así como `git push` nos sirve para actualizar el repositorio remoto con el repositorio local, para realizar la acción inversa e incluir en el repositorio local los cambios efectuados en el remoto usaremos el comando:

```
git pull
```

Si hemos usado el comando `git push` con la opción `-u`, el comando anterior será suficiente; si no es así, debemos añadir el repositorio remoto:

```
git pull origin
```

## Nuevas ramas y actualizaciones

### _Branch_

En relación a las ramas (_branch_) hay una serie de comandos que debemos conocer.
En primer lugar:

```
git branch
```

Si ejecutamos este comando nos va a listar las diferentes ramas con las que cuenta nuestro proyecto. En este momento no hemos creado ninguna de modo que sólo aparecería la rama _main_.

Si a este comando le añadimos una cadena de caracteres creará una nueva rama cuyo nombre será la cadena elegida. En nuestro caso crearemos una nueva rama para el desarrollo de la aplicación:

```
git branch dev
```

# _Checkout_

Una vez creada usaremos el siguiente comando para movernos entre las diferentes ramas:

```
git checkout <rama>
```

En este momento los cambios que efectuemos en nuestro código quedaran registrados en la nueva rama, sin modificar la rama principal (_main_).

Si queremos actualizar nuestra rama en el repositorio remoto debemos repetir los pasos [_stage_ y _ commit_](#untracked-staged-y-commit) después de haber realizado los cambios pertinentes.