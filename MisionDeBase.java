class MisionDeBase {
	
	void iniciar() {
		
		Nave vigia = new Nave();
		Nave madre = new Nave();
		Nave padre = new Nave();
		
		// Modificaciones Nave vigia
		pilotear(vigia);
		vigia.avanzarAlOeste();
		vigia.avanzarAlNorte();
		vigia.atacarAlEste();
		vigia.avanzarAlNorte();
		
		// Modificaciones Nave madre
		pilotear(madre);
		madre.avanzarAlOeste();
		madre.avanzarAlNorte();
		
		// Modificaciones Nave padre
		pilotear(padre);
		
		// Comiezo Atacar
		madre.atacarAlEste();
		madre.atacarAlEste();
		madre.atacarAlEste();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		madre.atacarAlEste();
		madre.atacarAlEste();
		madre.atacarAlEste();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		madre.atacarAlEste();
		madre.atacarAlEste();
		madre.atacarAlEste();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		madre.atacarAlEste();
		madre.atacarAlEste();
		madre.atacarAlEste();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		madre.atacarAlEste();
		madre.atacarAlEste();
		madre.atacarAlEste();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		madre.atacarAlEste();
		madre.atacarAlEste();
		madre.atacarAlEste();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		padre.atacarAlNorte();
		
		// Regreso Base
		regresar(padre);
		padre.avanzarAlNorte();
		padre.avanzarAlNorte();
		padre.avanzarAlEste();
		madre.avanzarAlSur();
		madre.avanzarAlEste();
		regresar(madre);
		madre.avanzarAlNorte();
		vigia.avanzarAlSur();
		vigia.avanzarAlSur();
		vigia.avanzarAlEste();
		regresar(vigia);
		vigia.avanzarAlEste();
		
	}
	
	private void pilotear(Nave papa) {
		papa.despegar();
		papa.avanzarAlOeste();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlSur();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();
		papa.avanzarAlSur();
		papa.avanzarAlOeste();
		papa.avanzarAlOeste();

	}

	private void regresar(Nave nave) {
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlNorte();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();

	}
}