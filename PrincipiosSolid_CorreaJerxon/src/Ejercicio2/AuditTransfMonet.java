package Ejercicio2;

public class AuditTransfMonet {

	public void transferenciaRealizada(Transferencia transferencia) {
        if(transferencia.importe()>50000) {
            ConexionMail conexionMail=null;
            try {
                conexionMail = this.abrirConexionMail();
                conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
            } finally {
            if(conexionMail!=null)
              conexionMail.cerrar();
            }
        }
    }
    
    private ConexionMail abrirConexionMail() {
       return ConexionMail.getInstance();
    }
}
