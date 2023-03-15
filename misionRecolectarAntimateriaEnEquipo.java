
class MisionRecolectarAntimateriaEnEquipo {
 /*CASA
  * Utiliza 3 Naves para recolectar 30 DE ANTIMATERIA y
  * llevarla hasta la base (10 por nave)
  */
	Nave recolectorUno = new Nave();
	Nave recolectorDos = new Nave();
	Nave recolectorTres = new Nave();

	/**/
	void iniciar(){
		recolectoresInicien();
		recolectoresDespeguen();
		recolectoresRecolecten();
		recolectoresRegresen();
		recolectoresVacien();
	}
	void recolectoresInicien(){
		recolectorUno.despegar();
		recolectorUno.avanzarAlSur();
		recolectorDos.despegar();
		recolectorDos.avanzarAlNorte();
		recolectorTres.despegar();
	}
	void recolectoresDespeguen(){
		recolectorUno.avanzarAlSur();
		recolectorDos.avanzarAlNorte();
		recolectorDos.avanzarAlNorte();
		recolectorDos.avanzarAlNorte();
		recolectorUno.avanzarAlOeste();
		recolectorDos.avanzarAlEste();
		recolectorTres.avanzarAlOeste();
		recolectorTres.avanzarAlOeste();
		recolectorTres.avanzarAlSur();
	}	
	void recolectoresRecolecten(){
		recolectorUno.cargarDesdeOeste(Sustancia.ANTIMATERIA, 10);
		recolectorDos.cargarDesdeEste(Sustancia.ANTIMATERIA, 10);
		recolectorTres.cargarDesdeSur(Sustancia.ANTIMATERIA, 10);
	}
	void recolectoresRegresen(){
		recolectorUno.avanzarAlEste();
		recolectorDos.avanzarAlSur();
		recolectorDos.avanzarAlSur();
		recolectorDos.avanzarAlSur();
		recolectorDos.avanzarAlSur();
		recolectorUno.avanzarAlNorte();
		recolectorTres.avanzarAlNorte();
		recolectorTres.avanzarAlEste();
	}
	void recolectoresVacien(){
		recolectorUno.descargarEnNorte(Sustancia.ANTIMATERIA, 10);
		recolectorDos.descargarEnOeste(Sustancia.ANTIMATERIA, 10);
		recolectorTres.descargarEnEste(Sustancia.ANTIMATERIA, 10);
	}
}
