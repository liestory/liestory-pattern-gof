package adapter.home.orm.first;

import adapter.home.IDbEntity;

/**
 * IFirstOrm.
 *
 * @author Ilya_Sukhachev
 */
public interface IFirstOrm<T extends IDbEntity> {

    void create(T entity);

    T read(Long id);

    void update(T entity);

    void delete(T entity);
}
