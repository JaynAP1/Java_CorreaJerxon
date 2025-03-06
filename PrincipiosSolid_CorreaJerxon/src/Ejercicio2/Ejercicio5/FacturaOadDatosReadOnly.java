package Ejercicio2.Ejercicio5;

interface ReadIOad {
    Object[] GetAll();
    Object GetById(Object id);
}
interface WriteIOad {
    void Insert(Object entity);
    void Update(Object id, Object entity);
    void Delete(Object id);
}

public class FacturaOadDatosReadOnly implements ReadIOad {

    public Object[] GetAll() {
        // Obtener todas las facturas
        return new Object[0];
    }
    public Object GetById(Object id) {
        // Obtener factura por ID
        return id;
    }
}
class FacturaOadDatosWriteOnly implements WriteIOad{
    @Override
    public void Insert(Object entity) {
        //Insertar objetos
    }

    @Override
    public void Update(Object id, Object entity) {
        //Actualizar objetos
    }

    @Override
    public void Delete(Object id) {
        //Borrar objetos
    }
}
