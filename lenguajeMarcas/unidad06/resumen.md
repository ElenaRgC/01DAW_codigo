# XML

## Estructura

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE nombre_del_documento [<!ENTITY nombre_entidad "valor_entidad">]>
<nombre_del_documento atributo="valor">
  <elemento1>Contenido del elemento 1</elemento1>
  <elemento2 atributo="valor">Contenido del elemento 2</elemento2>
  <!-- Comentario -->
</nombre_del_documento>
```

Explicación de los componentes:

- Declaración XML: La primera línea del documento XML es la declaración XML que indica la versión y la codificación utilizada.

- DTD (opcional): Después de la declaración XML, puedes incluir una declaración de tipo de documento (DTD) si lo deseas. Define la estructura y las reglas del documento XML, incluyendo la definición de entidades.

- Elemento raíz: A continuación, se define un elemento raíz que engloba todos los demás elementos en el documento. En el ejemplo, se muestra como <nombre_del_documento>. Puedes darle el nombre que desees.

- Elementos: Dentro del elemento raíz, puedes tener otros elementos que representan la estructura jerárquica del documento XML. Pueden tener contenido de texto y/o atributos.

- Atributos: Los elementos pueden tener atributos que proporcionan información adicional sobre el elemento. Los atributos se definen como pares "nombre=valor", como se muestra en el ejemplo.

- Comentarios: Puedes incluir comentarios en el documento XML utilizando `<!-- comentario -->`.

## Declaración de elementos

| Tipo de declaración              | Descripción                                                                |
| -------------------------------- | -------------------------------------------------------------------------- |
| EMPTY                            | Elemento sin contenido (sin hijos ni contenido de texto)                   |
| ANY                              | Elemento con cualquier contenido válido                                    |
| (#PCDATA)                        | Contenido de texto                                                         |
| (#PCDATA \|\| child)             | Contenido de texto o un único hijo con cualquier nombre                    |
| (child\|child\|...)              | Lista de hijos permitidos con nombres específicos                          |
| (#PCDATA \|\| child\|child\|...) | Contenido de texto o una lista de hijos permitidos con nombres específicos |

### Símbolos

| Símbolo | Descripción                                             | Ejemplo                                       |
| ------- | ------------------------------------------------------- | --------------------------------------------- |
| \*      | Cero o más repeticiones del elemento                    | `<elemento>*`                                 |
| +       | Una o más repeticiones del elemento                     | `<elemento>+`                                 |
| ?       | Opcional, cero o una repetición del elemento            | `<elemento>?`                                 |
| \|      | Alternativa, permite uno de los elementos especificados | `<elemento1> \| <elemento2>`                  |
| ,       | Secuencia, los elementos deben aparecer en orden        | `<elemento1>, <elemento2>`                    |
| ()      | Agrupación, establece el alcance de los operadores      | `( <elemento1> \| <elemento2> ) <elemento3>*` |

## Atributos

| Tipo de atributo | Descripción                                                |
| ---------------- | ---------------------------------------------------------- |
| CDATA            | Datos de caracteres sin restricciones                      |
| ENUM             | Valor debe ser uno de los valores enumerados               |
| ID               | Valor debe ser único en el documento                       |
| IDREF            | Valor debe ser una referencia a un ID existente            |
| IDREFS           | Valor debe ser una lista de IDREF separados por espacios   |
| NMTOKEN          | Valor debe ser un nombre válido de token XML               |
| NMTOKENS         | Valor debe ser una lista de NMTOKEN separados por espacios |
| ENTITY           | Valor debe ser una referencia a una entidad definida       |
| ENTITIES         | Valor debe ser una lista de ENTITY separados por espacios  |
| NOTATION         | Valor debe ser una notación definida en el DTD             |

### Restricciones

| Restricción | Descripción                                               | Ejemplo DTD                                    | Ejemplo XML                                 |
| ----------- | --------------------------------------------------------- | ---------------------------------------------- | ------------------------------------------- |
| #REQUIRED   | El atributo debe estar presente y tener un valor definido | `<!ATTLIST elemento color #REQUIRED>`          | `<elemento color="#FF0000">`                |
| #IMPLIED    | El atributo es opcional, puede estar presente o no        | `<!ATTLIST elemento color #IMPLIED>`           | `<elemento>` o `<elemento color="#FF0000">` |
| #FIXED      | El atributo debe estar presente con un valor fijo         | `<!ATTLIST elemento color #FIXED "#FF0000">`   | `<elemento color="#FF0000">`                |
| #DEFAULT    | El atributo es opcional y tiene un valor predeterminado   | `<!ATTLIST elemento color #DEFAULT "#000000">` | `<elemento>` o `<elemento color="#000000">` |

## XPath

| Expresión XPath                          | Descripción                                                                                                       |
| ---------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| /                                        | Selecciona el nodo raíz                                                                                           |
| //nodo                                   | Selecciona todos los nodos con el nombre "nodo"                                                                   |
| /ruta/nodo                               | Selecciona el nodo "nodo" que es hijo directo de "ruta"                                                           |
| /ruta/nodo1/nodo2                        | Selecciona el nodo "nodo2" que es hijo de "nodo1"                                                                 |
| //nodo[@atributo='valor']                | Selecciona los nodos con el nombre "nodo" y atributo igual a "valor"                                              |
| /ruta[nodo='valor']                      | Selecciona el nodo "ruta" cuyo hijo "nodo" tiene el valor "valor"                                                 |
| /ruta[nodo1='valor1' and nodo2='valor2'] | Selecciona el nodo "ruta" que tiene el hijo "nodo1" con el valor "valor1" y el hijo "nodo2" con el valor "valor2" |
| //nodo/text()                            | Selecciona el contenido de texto de los nodos "nodo"                                                              |

## Posibles exámenes

https://www.mclibre.org/consultar/xml/examenes/13-14/examen-140610.html DTD Hecho

https://www.mclibre.org/consultar/xml/examenes/12-13/examen-130527.html DTD Hecho

https://www.mclibre.org/consultar/xml/examenes/12-13/examen-130610.html DTD Hecho

https://www.mclibre.org/consultar/xml/examenes/11-12/examen-120313.html DTD

https://www.mclibre.org/consultar/xml/examenes/11-12/examen-120601-1.html DTD

https://www.mclibre.org/consultar/xml/examenes/11-12/examen-120601-2.html DTD

https://www.mclibre.org/consultar/xml/examenes/11-12/examen-120614.html DTD

https://www.mclibre.org/consultar/xml/examenes/10-11/examen-110901.html DTD
