package ${groupId}.dao;

import ${groupId}.entity.Entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

public abstract class Dao <T extends Entity>{

    protected Logger logger =
            LogManager.getLogger(this.getClass());

    @PersistenceContext
    protected EntityManager em;

    public Optional<T> findById(T entity){

        return (Optional<T>) Optional
                .ofNullable( em.find( entity.getClass(), entity.getId() ) );

    }

    public T save (T entity){

        em.persist( entity );
        return entity;

    }

    public T update (T entity){

        em.merge( entity );
        return entity;

    }

    public void remove (T entity){

        em.remove( entity );

    }
}
