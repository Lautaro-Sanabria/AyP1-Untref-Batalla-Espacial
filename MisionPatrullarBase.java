
class MisionPatrullarBase {

		Nave patrullero = new Nave();
		Radar miRadar = patrullero.obtenerRadar();
		
		void ejecutar(){
			//Toma la distancia HORIZONTAL de tres casilleros
			patrullero.despegar(); 
			patrullero.avanzarAlNorte();
			patrullero.avanzarAlNorte();
			patrullero.avanzarAlNorte();
			
			for(int vueltas = 0; vueltas < 3;vueltas++){
				patrullero.avanzarAlEste();
				patrullero.avanzarAlEste();
				patrullero.avanzarAlEste();
				
			//Toma la distancia VERTICAL/HORIZONTAL de 6 casilleros 
				for(int i=0; i<6; i++){patrullero.avanzarAlSur();}
				for(int i=0;i < 6; i++){patrullero.avanzarAlOeste();}
				
				patrullero.avanzarAlNorte();
				patrullero.avanzarAlNorte();
				patrullero.avanzarAlNorte();
				
				while(miRadar.escanearNorte() != Espectro.VACIO){patrullero.atacarAlNorte();}
				
				patrullero.avanzarAlNorte();
				patrullero.avanzarAlNorte();
				patrullero.avanzarAlNorte();
				patrullero.avanzarAlEste();
				patrullero.avanzarAlEste();
				patrullero.avanzarAlEste();
			}
			
		}

	}

