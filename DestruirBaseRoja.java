
class DestruirBaseRoja {
	Nave destroy = new Nave();
	Nave destroy2 = new Nave();
	Nave destroy3 = new Nave();
	
	Radar radarD1 = destroy.obtenerRadar();
	Radar radarD2 = destroy2.obtenerRadar();
	Radar radarD3 = destroy3.obtenerRadar();
	
	int pasosDestroy  = 0;
	int pasosDestroy2 = 0;
	int pasosDestroy3 = 0;
	
	void iniciar(){
		navesDespeguen();
		navesAtaquen();
		naveDestroy2Volviendo();
		naveDestroyVolviendo();
		naveDestroy3Volviendo();
	}
	
	private void navesDespeguen() {
		//Despega la nave PRIMERA para abrir camino a las otras naves, destruyendo asteroides.
		destroy.despegar();
		for(int pasosOeste=0;pasosOeste<21;pasosOeste++){destroy.avanzarAlOeste(); pasosDestroy++;}
		for(int pasosNorte=0;pasosNorte<7;pasosNorte++){
			   if (radarD1.escanearNorte() == Espectro.ASTEROIDE){
				   while(radarD1.escanearNorte() == Espectro.ASTEROIDE){destroy.atacarAlNorte();}}
				         else{destroy.avanzarAlNorte(); pasosDestroy++;} }
		                              destroy.avanzarAlOeste();
		                              System.out.println("Cantidad de pasos Nave 1: "+ pasosDestroy);
		//Avanzan a la base enemiga.
		destroy2.despegar();
		for(int pasosOeste=0;pasosOeste<21;pasosOeste++){destroy2.avanzarAlOeste(); pasosDestroy2++;}
		for(int pasosNorte=0;pasosNorte<5;pasosNorte++){destroy2.avanzarAlNorte(); pasosDestroy2++;}
		System.out.println("Cantidad de pasos Nave 2: "+ pasosDestroy2);
		
		destroy3.despegar();
		for(int pasosOeste=0;pasosOeste<21;pasosOeste++){destroy3.avanzarAlOeste(); pasosDestroy3++;}
		for(int pasosNorte=0;pasosNorte<4;pasosNorte++){destroy3.avanzarAlNorte(); pasosDestroy3++;}
		System.out.println("Cantidad de pasos Nave 3: "+ pasosDestroy3);
		destroy3.avanzarAlOeste();
		
		}
	private void navesAtaquen() {
		
		System.out.println("Coordinando ataque a Base roja enemiga...");
		   if(radarD1.escanearSur() == Espectro.BASE && radarD2.escanearOeste()==Espectro.BASE && radarD3.escanearNorte()==Espectro.BASE){ 
			   for(int disparos=0; disparos<40;disparos++){destroy.atacarAlSur(); destroy2.atacarAlOeste(); destroy3.atacarAlNorte();}}
	}	
	private void naveDestroyVolviendo() {
		destroy.avanzarAlEste();
		 for( int regresar=pasosDestroy;regresar>21;regresar--){destroy.avanzarAlSur();} 
		 for( int regresar=pasosDestroy;regresar>7;regresar--){destroy.avanzarAlEste();}
		 destroy.avanzarAlSur();
		 destroy.avanzarAlEste();
	}
	private void naveDestroy2Volviendo() {
		System.out.println("Base enemiga destruida, grupo halcon retirandose...");
		 for( int regresar=pasosDestroy2;regresar>21;regresar--){destroy2.avanzarAlSur();} 
		 for( int regresar=pasosDestroy2;regresar>6;regresar--){destroy2.avanzarAlEste();}
		 destroy2.avanzarAlNorte();
		 destroy2.avanzarAlEste();
	}
	private void naveDestroy3Volviendo() {
		 destroy3.avanzarAlEste();
		 for( int regresar=pasosDestroy3;regresar>21;regresar--){destroy3.avanzarAlSur();} 
		 for( int regresar=pasosDestroy3;regresar>5;regresar--){destroy3.avanzarAlEste();}
		 
			System.out.println("Mision exitosa, buen trabajo TEAM!!");
	}
}