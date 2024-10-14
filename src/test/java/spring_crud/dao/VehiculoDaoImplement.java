package spring_crud.dao;


import com.javamaster.spring_crud.dao.VehiculoDAO;
import com.javamaster.spring_crud.modelo.Vehiculo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class VehiculoDaoImplement implements VehiculoDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void registrar(Vehiculo vehiculo) {
        entityManager.merge(vehiculo);
    }

    @Override
    @Transactional
    public Vehiculo buscarVehiculoPlaca(String placa) {
        return entityManager.find(Vehiculo.class, placa);
    }

    @Override
    public void eliminar(String id) {
        Vehiculo usuario = entityManager.find(Vehiculo.class, id);
        entityManager.remove(usuario);

    }


}
