
package lcs.tcc.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

public class HibernateDAO<T> implements InterfaceDAO<T>, Serializable{

    private Class<T> classe;
    private Session session;

    public HibernateDAO(Class<T> classe, Session session) {
        super();
        this.classe = classe;
        this.session = session;
    }
    
    
    
    @Override
    public void salvar(T entity) {
      session.save(entity);
    }

    @Override
    public void alterar(T entity) {
       session.update(entity);
    }

    @Override
    public void excluir(T entity) {
      session.delete(entity);
    }

    @Override
    public void marge(T entity) {
        session.merge(entity);
    }

    @Override
    public T getEntity(Serializable id) {
        T entity = (T) session.get(classe, id);
        return entity;
    }

    @Override
    public T getEntityByDetachedCriteria(DetachedCriteria criteria) {
        T entity = (T) criteria.getExecutableCriteria(session).uniqueResult();
        return entity;
    }

    @Override
    public List<T> getEntity() {
        List<T> entities = (List<T>) session.createCriteria(classe).list();
        return entities;        
    }

    @Override
    public List<T> getListDetachedCriteria(DetachedCriteria criteria) {
       return criteria.getExecutableCriteria(session).list();
    }    
}
