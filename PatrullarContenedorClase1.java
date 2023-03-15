
class PatrullarContenedorClase1 {

	void iniciar() {
		Nave nave1 = new Nave();
		
		// Modificaciones nave1
		pilotear(nave1);
		nave1.avanzarAlNorte();
		
	}
	private void pilotear(Nave nave) {
		nave.despegar();
		nave.avanzarAlSur();
		nave.avanzarAlOeste();
		nave.avanzarAlOeste();
		nave.avanzarAlOeste();
		nave.avanzarAlSur();
		nave.avanzarAlSur();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
	}
}
