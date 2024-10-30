package es.upm.dit.fprg24.p2;

public class PruebaInventario {

    public static void main(String[] args) {            

            // Crear algunos dispositivos médicos con el constructor actualizado
            DispositivoMedico dispositivo1 = new DispositivoMedico("ID001", "ECG", "Electrocardiograma", Tipo.DIAGNOSTICO, 2018, 2, true, true, 1500.0, 200.0);
            DispositivoMedico dispositivo2 = new DispositivoMedico("ID002", "Rayos X", "Máquina de rayos X", Tipo.IMAGEN, 2017, 3, true, true, 3000.0, 500.0);
            DispositivoMedico dispositivo3 = new DispositivoMedico("ID003", "Ventilador", "Ventilador mecánico", Tipo.DESCONOCIDO, 2019, 1, true, false, 5000.0, 300.0);
            DispositivoMedico dispositivo4 = new DispositivoMedico("ID004", "Rayos X Nuevo", "Máquina de rayos X", Tipo.IMAGEN, 2019, 3, false, true, 3000.0, 500.0);

            // Crear inventario

            // Almacenar dispositivos en el inventario     

            // Verificar que los dispositivos se almacenaron correctamente

            // Buscar dispositivo por ID

            // Encontrar un dispositivo compatible

            // Obtener el dispositivo más caro

            // Calcular precio promedio de los dispositivos

            // Obtener todos los espacios disponibles

            // Transferir dispositivo

            // Verificar que el dispositivo fue transferido

            
    }
}
