
class PatrullarContenedorClase {

	void iniciar(){
	Nave patrulla = new Nave();
	
	patrulla.despegar();
	
	//Una vuelta
	patrulla.avanzarAlSur();
	patrulla.avanzarAlOeste();
	patrulla.avanzarAlOeste();
	patrulla.avanzarAlOeste();
	patrulla.avanzarAlSur();
	patrulla.avanzarAlSur();
	patrulla.avanzarAlEste();
	patrulla.avanzarAlEste();
	patrulla.avanzarAlNorte();
	patrulla.avanzarAlNorte();
	//Dos vueltas
	patrulla.avanzarAlSur();
	patrulla.avanzarAlOeste();
	patrulla.avanzarAlOeste();
	patrulla.avanzarAlOeste();
	patrulla.avanzarAlSur();
	patrulla.avanzarAlSur();
	patrulla.avanzarAlEste();
	patrulla.avanzarAlEste();
	patrulla.avanzarAlNorte();
	patrulla.avanzarAlNorte();
	patrulla.avanzarAlNorte();
	}
}
