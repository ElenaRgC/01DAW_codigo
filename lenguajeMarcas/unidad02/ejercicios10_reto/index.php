<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejercicio 1</title>
</head>

<body>

    <?php

    $nombre= ($_POST["nombre"]);

    /* $mysqli = new mysqli("localhost","myelenarcae","6HwtR9IF","nombres");
    $conexion=mysqli_connect("localhost","myelenarcae","6HwtR9IF");

    if (!$conexion){
	echo "ERROR: Imposible establecer conexión con la base de datos para ese usuario y esa clave.<br>\n";
    }else{
	echo "Conexion con la base de datos establecida correctamente...<br><br>\n";
    }

    $db = mysqli_select_db($conexion,"nombres");

    if (!$db){
		echo "ERROR: Imposible seleccionar la base de datos.<br>\n";
	}
	else{
		echo "Base de datos seleccionada satisfactoriamente...<br><br>\n";
     }
    
    $subida=mysqli_query($conexion,"INSERT into nombres values ('$nombre');");

    if(!$subida){
	    echo "ERROR.<br>\n";
    }else{
        echo "Nombre almacenado correctamente.<br>\n";
    } */

    $archivo = fopen("nombres.txt", "a");
    fwrite($archivo, $nombre);
    fwrite($archivo, "\n");
    fclose($archivo);

    echo "Nombre almacenado correctamente.<br>\n";

    /* mysqli_close($conexion); */
    ?>

</body>

</html>