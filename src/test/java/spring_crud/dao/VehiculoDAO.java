package spring_crud.dao;


import com.javamaster.spring_crud.modelo.Vehiculo;

public interface VehiculoDAO {
    void registrar(Vehiculo vehiculo);

    Vehiculo buscarVehiculoPlaca(String placa);
}
