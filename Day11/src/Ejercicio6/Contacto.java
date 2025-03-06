package Ejercicio6;

public class Contacto {
    public String Nombre;
    public String CuentaBancaria;
    public String Email;
}

class SendMail implements IMailSender {
    @Override
    public void Enviar(Contacto contacto, String cuerpoMensaje) {
        System.out.println("Enviando contacto");
    }
}

interface IMailSender {
    void Enviar(Contacto contacto, String cuerpoMensaje);
}
