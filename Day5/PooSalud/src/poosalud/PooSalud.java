package poosalud;

import Clases.Pacientes;
import java.time.LocalDate;

public class PooSalud {

    public static void main(String[] args) {
         String fechaActual = String.valueOf(LocalDate.now());
        
        
        Pacientes Paciente1 = new Pacientes(1,"Jerxon Jair Correa Amaris", fechaActual, "2003-05-11", 1,1 );
        
        Paciente1.Irhospital();
    }
    
}
