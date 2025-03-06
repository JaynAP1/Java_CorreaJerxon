package principiossolid_correajerxon;

import Ejercicio2.Ejercicio2.AuditTransfMonet;
import Ejercicio2.Ejercicio2.Transferencia;

public class Main {
    public static void main(String[] args) {
        Transferencia transferencia = new Transferencia(52000);
        AuditTransfMonet auditTransfMonet = new AuditTransfMonet();

        System.out.println(auditTransfMonet.transferenciaRealizada(transferencia));
    }
}