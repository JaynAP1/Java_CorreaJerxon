package Ejercicio2;

public class AuditTransfMonet {

    public boolean transferenciaRealizada(Transferencia transferencia) {
        if (ComprobarMonto.esTransferenciaImportante(transferencia)) {
            String auditor = ServicioMensaje.obtenerDireccionMailAuditor();
            String mensaje = ServicioMensaje.componerMensajeAviso(transferencia);
            EnviarMensaje.enviarMensaje(auditor, mensaje);
        }
        return false;
    }
}

class ConectarCorreo {
    public static ConexionMail abrirConexionMail() {
        return ConexionMail.getInstance();

    }
}

class ComprobarMonto {
    public static boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}

class EnviarMensaje {
    public static void enviarMensaje(String Destinario, String mensaje) {
        ConexionMail conexionMail = null;

        try {
            conexionMail = ConectarCorreo.abrirConexionMail();
            conexionMail.enviar(new Mail().to(Destinario).withBody(mensaje));
        } finally {
            if (conexionMail != null) conexionMail.cerrar();
            System.out.println("Mensaje enviado con exito");
        }
    }

}

class ServicioMensaje {

    public static String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    public static String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }
}