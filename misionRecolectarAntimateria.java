
class misionRecolectarAntimateria {
	/*
	 * Utiliza una Nave para recolectar 101 de ANTIMATERIA y
	 * llevarla hasta la Base
	 */ 
	Nave navecita = new Nave();
	 void ejecutar() {	
		 navecita.despegar();
		 irHaciaContenedor();
		 cargarNaveDeAntimateria();
		 volverBase();
		 descargarAntimateria();
	 }
	 
	 private void cargarNaveDeAntimateria(){
		 navecita.cargarDesdeOeste(Sustancia.ANTIMATERIA, 50);
	 }
	 private void irHaciaContenedor(){
		 navecita.avanzarAlSur();
		 navecita.avanzarAlSur();
		 navecita.avanzarAlOeste();}
	 private void volverBase(){
		 navecita.avanzarAlEste();
		 navecita.avanzarAlNorte();
		 navecita.avanzarAlNorte();}
	 private void descargarAntimateria(){
		 navecita.descargarEnNorte(Sustancia.ANTIMATERIA, 50);
	 }
}
