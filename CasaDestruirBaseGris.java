
class MisionDestruirBaseGrisCASA {
	 //NO ESTA TERMINADO
	
        Nave destructor1 = new Nave();
		Nave destructor2 = new Nave();
		Nave destructor3 = new Nave();
		Radar radarDestructor1 = destructor1.obtenerRadar();
		Radar radarDestructor2 = destructor2.obtenerRadar();
		Radar radarDestructor3 = destructor3.obtenerRadar();
		int pasosD1 = 0;
		int pasosD2 = 0;
		int pasosD3 = 0;
		
	void iniciar(){
		
		despegarDestructores();
		posicionarDestructores();
		acercarseABaseGris();
		atacarABaseGris();
		
	}
	void despegarDestructores(){
		destructor1.despegar();
		destructor1.avanzarAlSur();
		destructor1.avanzarAlOeste();
		destructor2.despegar();
		destructor2.avanzarAlOeste();
		destructor3.despegar();
		destructor3.avanzarAlNorte();
		destructor3.avanzarAlOeste();
	}	
	void posicionarDestructores(){
		for(int salidas=0;salidas<1;salidas++){
			for(int destructorUno=0;destructorUno<9;destructorUno++){destructor1.avanzarAlSur(); pasosD1++;}
			for(int destructorDos=0;destructorDos<12;destructorDos++){destructor2.avanzarAlOeste(); pasosD2++;}
			for(int destructorTres=0;destructorTres<4;destructorTres++){destructor3.avanzarAlSur(); pasosD3++;}
		}
		
	}
	void acercarseABaseGris(){
		for(int salidas=0;salidas<1;salidas++){
			for(int destructorUno=0;destructorUno<10;destructorUno++){destructor1.avanzarAlOeste(); pasosD1++;}
			for(int destructorDos=0;destructorDos<9;destructorDos++){destructor2.avanzarAlSur(); pasosD2++;}
			for(int destructorTres=0;destructorTres<9;destructorTres++){destructor3.avanzarAlOeste(); pasosD3++;}
			for(int destructorTres=0;destructorTres<4;destructorTres++){destructor3.avanzarAlSur(); pasosD3++;}
			destructor3.avanzarAlOeste();
			destructor3.avanzarAlSur();
			destructor3.avanzarAlSur();
		}
	}
	void atacarABaseGris(){
		if (radarDestructor1.escanearNorte() == Espectro.BASE && radarDestructor2.escanearSur() == Espectro.BASE && radarDestructor3.escanearEste() == Espectro.BASE){ 
		while(radarDestructor1.escanearNorte() == Espectro.BASE && radarDestructor2.escanearSur() == Espectro.BASE && radarDestructor3.escanearEste() == Espectro.BASE){
			  destructor1.atacarAlNorte();
			  destructor2.atacarAlSur();
			  destructor3.atacarAlEste();}
		}
	}
}


/*
 * 	void avanzarBaseGrisDestructor1(){
 *      for(int pasosSur=0;pasosSur<9;pasosSur++){destructor1.avanzarAlSur(); pasosNave1++;}
		for(int pasosOeste=0;pasosOeste<9;pasosOeste++){destructor1.avanzarAlOeste(); pasosNave1++;}
		}	
 */

	/* POR SI LA NAVE VA A BASE GRIS DERECHA
	 * 			for(int pasosEste=0;pasosEste<16;pasosEste++){
				if (radarDestructor1.escanearEste() == Espectro.ASTEROIDE){ 
				while(radarDestructor1.escanearEste() == Espectro.ASTEROIDE){destructor1.atacarAlEste();} }
			    else{destructor1.avanzarAlEste(); pasosNave1++;} 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   

