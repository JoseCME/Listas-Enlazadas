# Implementación de Listas Enlazadas (Singly Linked List)



## Retos implementados

### Reto 1: `countOccurrences(T value)`

Cuenta cuántas veces aparece un valor dentro de la lista.

* Se recorre la lista nodo por nodo
* Se compara cada valor
* Complejidad: O(n)

---

### Reto 2: `clean()`

Elimina todos los nodos de la lista y retorna cuántos fueron eliminados.

* Se utiliza `removeFirst()` para eliminar nodos

* No se usan estructuras auxiliares

* Al finalizar:

  * `head = null`
  * `tail = null`
  * `size = 0`

* Complejidad: O(n)

---

### Reto 3: `reverseInPlace()`

Invierte la lista en el mismo objeto (in-place), sin crear una nueva.

#### Lógica:

Se utilizan tres referencias:

* `previous`
* `current`
* `next`

#### Proceso:

1. Guardar el siguiente nodo
2. Invertir el enlace (`current → previous`)
3. Avanzar las referencias

#### Resultado:

Antes:  A → B → C
Después: C → B → A

* No utiliza memoria adicional
* Complejidad: O(n)

---

### Reto 4: `removeDuplicates()`

Elimina nodos duplicados conservando la primera aparición.

#### Lógica:

* Se utiliza un doble recorrido:

  * `current` como nodo base
  * `runner` para recorrer los nodos siguientes

* Si se encuentra un duplicado:

  * Se elimina ajustando enlaces (`setNext`)

#### Ejemplo:

Antes:  A → B → A → C → B → D
Después: A → B → C → D

* No se utilizan estructuras auxiliares
* Complejidad: O(n²)

---

## Aprendizajes clave

Durante la implementación se comprendieron los siguientes conceptos:

* Funcionamiento de referencias en listas enlazadas
* Diferencia entre modificar un nodo y modificar un enlace
* Importancia de no perder referencias durante el recorrido
* Manejo correcto de `head` y `tail`
* Recorridos simples y dobles en estructuras dinámicas

---

## Errores  enfrentados

* Confusión entre nodos y valores
* Mal uso de `setNext()`
* Pérdida de referencias por no guardar el siguiente nodo
* Uso innecesario de variables auxiliares
* No actualizar correctamente `tail`

#Lo importante de todo es que logre darme cuenta de  mis errores y el repositorio final es el correcto y sin ningun error 
---


