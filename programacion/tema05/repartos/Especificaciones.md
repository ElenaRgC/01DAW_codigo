# Especificaciones

## Ciudad
- Cuadrícula 3x3

## Sector
- ArrayList paquetes
- Fila
- Columna
- Genera paquetes con datos aleatorios
  - 50% normales
  - 25% urgentes
  - 25% certificados

## Paquetes
- Destinatario
- Peso
- esFragil
- Se colocan en sectores de la cuadrícula

### Paquete urgente:
- Días de retraso
- 
### Paquete certificado:
- Fecha de entrega
- Quien firma la entrega (destinatario? destinatario es persona? string?)

## Destinatario
- Nombre
- Dirección
- Teléfono

## Repartidores
- ID
- Nombre
- Fila asignada
- Contador amonestaciones
- Furgoneta 

## Furgoneta
- Matrícula
- Marca
- Modelo
- Array paquetes (max 4)

## Sede
- Genera informes
- Comprobar total paquetes en fila
- Amonestar repartidor si hay +20 paquetes sin repartir asignados a un repartidor en una fila

## Informes
- Pueden ser:
  - Sector
  - Fila
  - Columna
  - Ciudad
- Total de cada tipo de paquete
- Resumen (imprimir los paquetes)

## Función principal

### Inicialización
- Se genera una ciudad vacía
- Se genera un repartidor por fila y se le asigna una furgoneta vacía
- Todos los valores de tipo String pueden generarse aleatoriamente de una lista de nombres

### Ejecución
- Cada 2 segundos se generan en todos los sectores entre 0 y 2 paquetes
- Cada 6 segundos cada repartidor elige el sector de su fila con más paquetes y llena la furgoneta
  - Primero los urgentes
  - Luego los certificados
  - El resto
  - Salen del sector y pasan a la furgoneta
  - Se mostrará un mensaje de qué paquetes están siendo repartidos
  - Se vaciará la furgoneta pasados 6 segundos
- Cada 10 segundos se genera un informe
  - Aleatoriamente entre sector, fila columna o ciudad
- Cada 20 segundos se recorrerá la ciudad y se darán amonestaciones
- A los 2 minutos acaba la simulación y se imprime:
  - Cuántos paquetes hay de cada tipo por sector
  - Información de los repartidores
  - Contenido de las furgonetas