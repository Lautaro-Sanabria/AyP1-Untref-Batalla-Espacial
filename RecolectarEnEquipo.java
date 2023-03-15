
class RecolectarEnEquipo {
	/*Clase
	  * Utiliza 3 Naves para recolectar 30 DE ANTIMATERIA y
	  * llevarla hasta la base (10 por nave)
	  */
	
		void iniciar() {
			Nave nave1 = new Nave();
			Nave nave2 = new Nave();
			Nave nave3 = new Nave();
			
			// Modificaciones nave1
			pilotear(nave1);
			nave1.avanzarAlOeste();
			
			// Modificaciones nave2
			pilotear(nave2);
			nave2.avanzarAlEste();
			
			// Modificaciones nave3
			pilotear(nave3);
			
		}
		void pilotear(Nave nave) {
			nave.despegar();
			nave.avanzarAlNorte();
			nave.avanzarAlNorte();
			nave.avanzarAlNorte();
			nave.avanzarAlNorte();
			nave.avanzarAlEste();
			nave.cargarDesdeEste(Sustancia.ANTIMATERIA, 10);
			nave.avanzarAlOeste();
			nave.avanzarAlSur();
			nave.avanzarAlSur();
			nave.avanzarAlSur();
			nave.descargarEnSur(Sustancia.ANTIMATERIA,  10);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  /*Nave recolectorUno = new Nave();
		Nave recolectorDos = new Nave();
		Nave recolectorTres = new Nave();
		Radar radarR1 = recolectorUno.obtenerRadar();
		int pasosR1 = 0;
		
		void iniciar(){
			recolectorUno.despegar();
			for(int irAlNorte=0;irAlNorte<5;irAlNorte++){recolectorUno.avanzarAlNorte(); pasosR1++;}
			recolectorUno.avanzarAlEste();
			recolectorUno.cargarDesdeEste(Sustancia.ANTIMATERIA, 10);
			for(int regresar=pasosR1;regresar>5;regresar--){recolectorUno.avanzarAlOeste();}
			recolectorUno.descargarEnOeste(Sustancia.ANTIMATERIA, 10);
			recolectorUno.avanzarAlSur();
			recolectorUno.avanzarAlOeste();
		
			recolectorDos.despegar();
			for(int irAlNorte=0;irAlNorte<5;irAlNorte++){recolectorDos.avanzarAlNorte(); pasosR1++;}
			recolectorDos.avanzarAlEste();
			recolectorDos.cargarDesdeEste(Sustancia.ANTIMATERIA, 10);
			for(int regresar=pasosR1;regresar>5;regresar--){recolectorDos.avanzarAlOeste();}
			recolectorDos.descargarEnOeste(Sustancia.ANTIMATERIA, 10);
			
			recolectorTres.despegar();
			for(int irAlNorte=0;irAlNorte<5;irAlNorte++){recolectorTres.avanzarAlNorte(); pasosR1++;}
			recolectorTres.avanzarAlEste();
			recolectorTres.cargarDesdeEste(Sustancia.ANTIMATERIA, 10);
			for(int regresar=pasosR1;regresar>4;regresar--){recolectorTres.avanzarAlOeste();}
			recolectorTres.avanzarAlOeste();
			recolectorTres.descargarEnSur(Sustancia.ANTIMATERIA, 10);

		}
			*/


