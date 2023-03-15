
class MisionPatrullarContenedor {
	
	void iniciar(){
		Nave patrulla = new Nave();
		patrulla.despegar();
		patrulla.avanzarAlNorte();
		
		for(int vueltasTotal=0;vueltasTotal<4;vueltasTotal++){
			for(int vueltasBase = 0; vueltasBase<3;vueltasBase++){
					patrulla.avanzarAlOeste();
					patrulla.avanzarAlSur();
					patrulla.avanzarAlSur();
					patrulla.avanzarAlEste();
					patrulla.avanzarAlEste();
					patrulla.avanzarAlNorte();
					patrulla.avanzarAlNorte();
					patrulla.avanzarAlOeste();
			}
			patrulla.avanzarAlOeste();
			for(int pasos = 0;pasos<4;pasos++){patrulla.avanzarAlSur();}
			
			for(int vueltasContenedor=0;vueltasContenedor<3;vueltasContenedor++){
				for(int irOeste=0;irOeste<2;irOeste++){patrulla.avanzarAlOeste();}
				for(int irNorte=0;irNorte<2;irNorte++){patrulla.avanzarAlNorte();}
				for(int irEste=0;irEste<2;irEste++){patrulla.avanzarAlEste();}
				for(int irSur=0;irSur<2;irSur++){patrulla.avanzarAlSur();}
			}
			}
		}
	}
