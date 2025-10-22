package services;

import com.example.demo.Sucursal;
import java.util.List;

public interface IDAOsucursal {
    List<Sucursal> getAll(String nameQuery);
    void insert(Sucursal entity);
    Sucursal getById(Integer id);
    void remove(Sucursal entity);
    Sucursal update(Sucursal entity);
}
