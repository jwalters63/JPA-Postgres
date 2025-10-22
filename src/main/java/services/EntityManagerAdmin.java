package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static EntityManager instance;
    private static final String UNIDAD_PERSISTENCIA = "crud-practica-jpa";

    public static EntityManager getInstance() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(UNIDAD_PERSISTENCIA);
        instance = emf.createEntityManager();
        return instance;
    }
}
