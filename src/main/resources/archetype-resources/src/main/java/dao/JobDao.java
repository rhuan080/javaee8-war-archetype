package ${groupId}.dao;

import ${groupId}.entity.Job;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class JobDao extends Dao<Job> {

    public List<Job> findAll(){

        return em.createQuery("select j from Job j", Job.class)
                .getResultList();

    }

}
