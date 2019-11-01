# SOLID by example
Using SOLID principles in a little example.

## Taller Nro. 1

- Agregar un nuevo algoritmo JaroWinkelDistance
- Pruebas unitarias para los tres algoritmos.

### Solución Propuesta

- La implementación del algoritmo JaroWinkel Distance se encuentra implementada en la clase llamada JaroWinkelDistance
- Se ha creado una clase llamada AlgorithmManager implementa un método llamado
   defineAlgo que busca instanciar un objeto del tipo TweetSimilarity con la clase que implementa
   el algoritmo que se encuentra asociado al nombre ingresado como parametro al metodo.
- Existen dos posibilidades para realizar las pruebas unitarias:
   * **Opción 1:** se encuentra en la clase de prueba AlgorithmsUnit Test. En esta se emplea el método creado en la 
   clase AlgorithmManager y usa el metodo defineAlgo.
   
   * **Opción 2:** Realizar pruebas parametrizadas : Esta implementación se encuentra en la clase TweetSimilarityTest.
   
        Como parametros (Parameters) se crea una lista con las instancias de las implementaciones de los algoritmos.