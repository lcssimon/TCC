package lcs.tcc.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

public interface InterfaceDAO<T> {

    void salvar(T entity);

    void alterar(T entity);

    void excluir(T entity);

    void marge(T entity);

    T getEntity(Serializable id);

    T getEntityByDetachedCriteria(DetachedCriteria criteria);

    List<T> getEntity();

    List<T> getListDetachedCriteria(DetachedCriteria criteria);
}
