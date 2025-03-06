package Ejercicio2.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class NotificarPorSms {
    private static NotificarPorSms instance;

	private NotificarPorSms() {
	}

	public static NotificarPorSms getInstance() {
		if (instance == null) {
			instance = new NotificarPorSms();
		}
		return instance;
	}

	public List<Orden> ordenes = new ArrayList<Orden>();

	public void enviarMensajeDeConfirmacion(Orden orden) {
		ordenes.add(orden);
	}
}
