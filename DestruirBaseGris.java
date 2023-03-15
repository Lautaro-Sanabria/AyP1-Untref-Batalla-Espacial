class DestruirBaseGris {
        Nave destructor1 = new Nave();
		Nave destructor2 = new Nave();
		Nave destructor3 = new Nave();
		
		Radar radarDestructor1 = destructor1.obtenerRadar();
		Radar radarDestructor2 = destructor2.obtenerRadar();
		Radar radarDestructor3 = destructor3.obtenerRadar();
		
		int pasosD1 = 0; //  Se almacenan los movimientos realizados por la Nave correspondiente...
		int pasosD2 = 0; //  Ejemplo: cuando "destructor1.avazarAlSur" a "pasosD1 = pasosD1 +1"
		int pasosD3 = 0; //  Esto nos sirve para que la nave regrese al lugar de origen atravez de un for en reversa.
		
		void iniciar(){
			
			destructorUnoAtacar();
			regresarABaseD1();
			destructorDosAtacar();
			regresarABaseD2();
			destructorTresAtacar();
			regresarABaseD3();
      }
  private void destructorUnoAtacar() {
					destructor1.despegar();
	//System.out.println("Nave Destructor 1 despegue...");
	
   for(int pasosSur=0;pasosSur<12;pasosSur++){//son 12 pasos porque consultar si hay un ASTEROIDE consume un ciclo for
	   if (radarDestructor1.escanearSur() == Espectro.ASTEROIDE){
		   while(radarDestructor1.escanearSur() == Espectro.ASTEROIDE){destructor1.atacarAlSur();}} // La nave se dirije hacia abajo.
		         else{destructor1.avanzarAlSur(); pasosD1++;}
}
   for(int pasosEste=0;pasosEste<15;pasosEste++){
	   if (radarDestructor1.escanearEste() == Espectro.ASTEROIDE){
		   while(radarDestructor1.escanearEste() == Espectro.ASTEROIDE){destructor1.atacarAlEste();} } //La nave se dirije a la derecha.
	             else{destructor1.avanzarAlEste(); pasosD1++;}
}
	   if (radarDestructor1.escanearEste() == Espectro.BASE){ 
		   for(int disparos=0; disparos<8;disparos++){destructor1.atacarAlEste();}} //La nave realiza 7 disparos.
		       else{destructor1.avanzarAlEste(); pasosD2++;}
} 
  
  private void destructorDosAtacar(){
	destructor2.despegar();
	//System.out.println("Nave Destructor 2 despegue...");
	for(int pasosSur=0;pasosSur<10;pasosSur++){destructor2.avanzarAlSur(); pasosD2++;} // La nave se dirije hacia abajo.
	
	for(int pasosEste=0;pasosEste<14;pasosEste++){                                   //La nave se dirije a la derecha.
		if (radarDestructor2.escanearEste() == Espectro.BASE){ 
			for(int disparos=0; disparos<8;disparos++){destructor2.atacarAlEste();}} //La nave realiza 7 disparos.
		        else{destructor2.avanzarAlEste(); pasosD2++;}}
}  
  private void destructorTresAtacar(){
	destructor3.despegar();
	//System.out.println("Nave Destructor 3 despegue...");
	for(int pasosSur=0;pasosSur<10;pasosSur++){destructor3.avanzarAlSur(); pasosD3++;} // La nave se dirije hacia abajo.
	
	for(int pasosEste=0;pasosEste<14;pasosEste++){                                   //La nave se dirije a la derecha.
		if (radarDestructor3.escanearEste() == Espectro.BASE){ 
			for(int disparos=0; disparos<8;disparos++){destructor3.atacarAlEste();}} //La nave realiza 7 disparos.
		        else{destructor3.avanzarAlEste(); pasosD3++;}}
}
  private void regresarABaseD1(){
	//System.out.println("Avanzaste: " + pasosD1 + " casilleros felicidades!");
	                               //23>10? >> Si
	 for( int regresar=pasosD1;regresar>10;regresar--){destructor1.avanzarAlOeste();} //La nave se dirije 14 casilleros hacia la izquierda.
	 for( int regresar=pasosD1;regresar>14;regresar--){destructor1.avanzarAlNorte();} //La nave se dirije 9 casilleros hacia arriba.
	 destructor1.avanzarAlOeste();
	 destructor1.avanzarAlNorte();
	 
	 //System.out.println("CheckPoint: Descansa y guarda energias para combatir.");
	 //System.out.println("                                                      ");
	// System.out.println("Preparando proxima Nave...");
 }
  private void regresarABaseD2(){
	//System.out.println("Avanzaste: " + pasosD1 + " casilleros felicidades!");
                                   //23>10? >> Si
	 for( int regresar=pasosD1;regresar>10;regresar--){destructor2.avanzarAlOeste();} //La nave se dirije 14 casilleros hacia la izquierda.
	 for( int regresar=pasosD1;regresar>14;regresar--){destructor2.avanzarAlNorte();} //La nave se dirije 9 casilleros hacia arriba.
	 destructor2.avanzarAlEste();
	 destructor2.avanzarAlNorte();
	 
	 //System.out.println("CheckPoint: Descansa y guarda energias para combatir.");
	 //System.out.println("                                                      ");
	// System.out.println("Preparando proxima Nave...");
 }
  private void regresarABaseD3(){

		 for( int regresar=pasosD1;regresar>10;regresar--){destructor3.avanzarAlOeste();} //La nave se dirije 14 casilleros hacia la izquierda.
		 for( int regresar=pasosD1;regresar>14;regresar--){destructor3.avanzarAlNorte();} //La nave se dirije 9 casilleros hacia arriba.
		 
		 //System.out.println("CheckPoint: Descansa y guarda energias para combatir.");
		 //System.out.println("                                                      ");
		// System.out.println("Mision finalizada con exito FELICIDADES!!!");
 }
}