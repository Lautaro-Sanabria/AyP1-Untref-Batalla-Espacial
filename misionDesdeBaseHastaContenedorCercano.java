
class MisionDesdeBaseHastaContenedorCercano {
	/*
	 * Ejecuta la misi�n, llevando una Nave desde la Base en la
	 * en la que se encuentra hasta el Contenedor m�s cercano
	 */
	void ejecutar() {
		Nave navecita = new Nave();
		navecita.despegar();
		navecita.avanzarAlSur();
		navecita.avanzarAlSur();
		navecita.avanzarAlOeste();
	}
}
