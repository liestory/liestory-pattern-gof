package adapter.home.orm.second;



import adapter.home.DbUserEntity;
import adapter.home.DbUserInfoEntity;

import java.util.Set;

/**
 * ISecondOrmContext.
 *
 * @author Ilya_Sukhachev
 */
public interface ISecondOrmContext {

    Set<DbUserEntity> getUsers();
    Set<DbUserInfoEntity> getUserInfos();

}
