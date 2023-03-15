
class RecolectarAntimateria {

	void iniciar(){
		 Nave carguera = new Nave();
		 Radar radar = carguera.obtenerRadar();
		 int cantidadDeAntimateria;
		 
//Despega y avanza hacia el contenedor mas cercano.
		 carguera.despegar();
		 carguera.avanzarAlSur();
		 carguera.avanzarAlSur();  
		 carguera.avanzarAlOeste();
		 
//Busca y carga la cantidad maxima de ANTIMATERIA encontrada en un contenedor e imprime la cantidad maxima obtenida.		 
		 cantidadDeAntimateria = radar.buscarAlOeste(Sustancia.ANTIMATERIA);
		 System.out.println(cantidadDeAntimateria);
		 carguera.cargarDesdeOeste(Sustancia.ANTIMATERIA, cantidadDeAntimateria);
		 
// Vuelve a la Base y descarga la cantidad maxima almacenada en la nave.  		 
		 carguera.avanzarAlEste();
		 carguera.avanzarAlNorte();  
		 carguera.descargarEnNorte(Sustancia.ANTIMATERIA, cantidadDeAntimateria);
	}
}