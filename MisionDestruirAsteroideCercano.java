
class MisionDestruirAsteroideCercano {
	/*
	 * Lleva una nave hasta el Asteroide
	 * mas cercano, lo destruye y regresa a la Base
	 */

	void iniciar(){
		Nave destructor = new Nave();
		Radar radar = destructor.obtenerRadar();

		destructor.despegar();
		destructor.avanzarAlNorte();
		destructor.avanzarAlOeste();
		destructor.avanzarAlOeste();
		
		if (radar.escanearOeste() == Espectro.ASTEROIDE){
			while(radar.escanearOeste() == Espectro.ASTEROIDE){destructor.atacarAlOeste();}
			
		destructor.avanzarAlEste();
		destructor.avanzarAlEste();
		
		}
	}
}
