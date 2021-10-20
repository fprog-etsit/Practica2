package es.upm.dit.fprg21.p2;

public class PruebaAreaHospitalizacion {

	public static void main(String[] args) throws Exception {
		// Creamos un área de hospitalización
		AreaHospitalizacion areaHospitalizacion = new AreaHospitalizacion("Ala Este", 3, 10, 20);
		
		// Creamos algunos pacientes
		Paciente p1 = new Paciente("00000000A", "Julio", "Lopez", 67, 175, 83, 120, 80);
		Paciente p2 = new Paciente("00000001B", "Julia", "Garcia", 22, 179, 66, 122, 72);
		Paciente p3 = new Paciente("60000002C", "Mario", "Iglesias", 33, 166, 70, 110, 67);
		Paciente p4 = new Paciente("30000003D", "María", "Vallejo", 82, 160, 73, 130, 91);
		
		// Asignamos a cada paciente su grupo sanguíneo
		p1.setGrupoSanguineo(GrupoSanguineo.A_NEGATIVO);
		p2.setGrupoSanguineo(GrupoSanguineo.CERO_NEGATIVO);
		p3.setGrupoSanguineo(GrupoSanguineo.A_POSITIVO);
		p4.setGrupoSanguineo(GrupoSanguineo.B_NEGATIVO);
		
		// Asignamos a cada paciente su histórico de temperaturas
		p1.setTemperatura(new double[]{37.3, 37.2, 40.0, 39.8});
		p2.setTemperatura(new double[]{36.0, 36.3, 36.2, 37.0});
		p3.setTemperatura(new double[]{37.1, 37.8, 38.1, 36.4});
		p4.setTemperatura(new double[]{40.2, 39.2, 38.1, 36.7});
		
		// Asignamos cada paciente a una habitación.
		areaHospitalizacion.ingresaPaciente(p1, 0, 0, 0);
		System.out.println("Paciente en habitación 0-0-0: " + areaHospitalizacion.getPaciente(0, 0, 0).getNombre());
		areaHospitalizacion.ingresaPaciente(p2, 0, 1, 4);
		System.out.println("Paciente en habitación 0-1-4: " + areaHospitalizacion.getPaciente(0, 1, 4).getNombre());
		areaHospitalizacion.ingresaPaciente(p3, 1, 0, 1);
		System.out.println("Paciente en habitación 1-0-1: " + areaHospitalizacion.getPaciente(1, 0, 1).getNombre());
		areaHospitalizacion.ingresaPaciente(p4, 1, 0, 4);
		System.out.println("Paciente en habitación 1-0-4: " + areaHospitalizacion.getPaciente(1, 0, 4).getNombre());
		
		// Comprobamos el grupo sanguíneo del paciente de una determinada habitación.
		System.out.println("Grupo sanguíneo paciente " + p1.getNombre() + " = " + areaHospitalizacion.getGrupoSanguineoDePaciente(0, 0, 0));
		
		// Comprobamos que la habitación donde está el/la paciente p4 está ocupada.
		System.out.println("¿Está ocupada la habitación 1-0-4? " + areaHospitalizacion.habitacionOcupada(1, 0, 4));
		
		// Damos el alta al paciente de la habitación 1-0-4
		Paciente sano = areaHospitalizacion.altaPaciente(1, 0, 4);
		if (sano != null) System.out.println("El/La paciente " + sano.getNombre() + " ha sido dado/a de alta.");
		
		// Comprobamos que la habitación donde estaba el/la paciente p4 está libre.
		System.out.println("¿Está ocupada la habitación 1-0-4? " + areaHospitalizacion.habitacionOcupada(1, 0, 4));
		
		// Intentamos obtener el/la paciente alojada en la habitación 1-1-5, y comprobamos que da excepción
		// ya que no hay ningún paciente en esa habitación.
		try {
			areaHospitalizacion.getPaciente(1, 1, 5);
		} catch (Exception e) {
			// Esta sentencia imprime por pantalla un pequeño resumen de la
			// excepción.
			e.printStackTrace();
		}
		
		// TODO: rellene todas las sentencias que considere necesarias para probar
		// que su clase AreaHospitalizacion cumple las especificaciones del enunciado de la
		// práctica.
		
		// Recuerde que debería probar que el resto de métodos desarrollados en la clase funcionan correctamente.
	}

}
