package es.upm.dit.fprg23.p2;


public class PruebaUnidadHospitalizacion {

	public static void main(String[] args) throws Exception {
		// Creamos un área de hospitalización
		UnidadHospitalizacion unidadHospitalizacion = new UnidadHospitalizacion("Ala Este", 3, 10, 20);
		
		// Creamos algunos pacientes
		Paciente p1 = new Paciente("00000000A", "Julio", "Lopez", 1993, 175, 83.5, GrupoSanguineo.A_NEGATIVO);
		Paciente p2 = new Paciente("00000001B", "Julia", "Garcia", 1953, 179, 66.7, GrupoSanguineo.B_NEGATIVO);
		Paciente p3 = new Paciente("60000002C", "Mario", "Iglesias", 1979, 166, 70.1, GrupoSanguineo.CERO_POSITIVO);
		Paciente p4 = new Paciente("30000003D", "María", "Vallejo", 1981, 160, 73.0, GrupoSanguineo.A_NEGATIVO);
		
		// Asignamos a cada paciente su histórico de temperaturas
		p1.setHistoricoTemperatura(new double[]{37.3, 37.2, 40.0, 39.8});
		p2.setHistoricoTemperatura(new double[]{36.0, 36.3, 36.2, 37.0});
		p3.setHistoricoTemperatura(new double[]{37.1, 37.8, 38.1, 36.4});
		p4.setHistoricoTemperatura(new double[]{40.2, 39.2, 38.1, 36.7});
		
		// Asignamos a un paciente su histórico de presiones
		p1.setHistoricoPresionDiastolica(new int[] {120, 125, 123, 130, 119});
		p1.setHistoricoPresionSistolica(new int[] {80, 85, 80, 82, 81});

		// Asignamos cada paciente a una habitación y comprobamos que se ha asignado correctamente.
		unidadHospitalizacion.ingresaPaciente(p1, 0, 0, 0);
		System.out.println("Paciente en habitación 0-0-0: " + unidadHospitalizacion.getPaciente(0, 0, 0).getNombre());
		unidadHospitalizacion.ingresaPaciente(p2, 0, 1, 4);
		System.out.println("Paciente en habitación 0-1-4: " + unidadHospitalizacion.getPaciente(0, 1, 4).getNombre());
		unidadHospitalizacion.ingresaPaciente(p3, 1, 0, 1);
		System.out.println("Paciente en habitación 1-0-1: " + unidadHospitalizacion.getPaciente(1, 0, 1).getNombre());
		unidadHospitalizacion.ingresaPaciente(p4, 1, 0, 4);
		System.out.println("Paciente en habitación 1-0-4: " + unidadHospitalizacion.getPaciente(1, 0, 4).getNombre());
		
		// Comprobamos el grupo sanguíneo del paciente de una determinada habitación.
		System.out.println("Grupo sanguíneo paciente " + p1.getNombre() + " = " + unidadHospitalizacion.getGrupoSanguineoDePaciente(0, 0, 0));
				
		// Comprobamos que la habitación donde está el/la paciente p4 está ocupada.
		System.out.println("¿Está ocupada la habitación 1-0-4? " + unidadHospitalizacion.habitacionOcupada(1, 0, 4));
		
		// Damos el alta al paciente de la habitación 1-0-4
		Paciente sano = unidadHospitalizacion.altaPaciente(1, 0, 4);
		if (sano != null) System.out.println("El/La paciente " + sano.getNombre() + " ha sido dado/a de alta.");
		
		// Comprobamos que la habitación donde estaba el/la paciente p4 está libre.
		System.out.println("¿Está ocupada la habitación 1-0-4? " + unidadHospitalizacion.habitacionOcupada(1, 0, 4));
		
		
		// TODO: rellene todas las sentencias que considere necesarias para probar
		// que su clase UnidadHospitalizacion cumple las especificaciones del enunciado de la
		// práctica.
		
		// Recuerde que debería probar que el resto de métodos desarrollados en la clase funcionan correctamente.
	}
}
