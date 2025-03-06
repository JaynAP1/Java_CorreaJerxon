package Ejercicio2.Ejercicio4;

interface ProcesarEnvio{
    void Enviar(Orden orden);
}

class ProcesadorDeOrdenesSms extends EnviarOrdenSms {
    public void ProcesarSms(Orden orden){
        Enviar(orden);
    }
}
class ProcesadorDeOrdenesMail extends EnviarOrdenMail{
    public void ProcesarMail(Orden orden){
        Enviar(orden);
    }
}
class EnviarOrdenSms implements ProcesarEnvio{
    public void Enviar(Orden orden){
        if (orden.Isvalid() && new Repositorio().grabar(orden)) {
            NotificarPorMail.getInstance().enviarMensajeDeConfirmacion(orden);
        }
    }
}
class EnviarOrdenMail implements ProcesarEnvio{
    public void Enviar(Orden orden){
        if (orden.Isvalid() && new Repositorio().grabar(orden)) {
            NotificarPorMail.getInstance().enviarMensajeDeConfirmacion(orden);
        }
    }
}