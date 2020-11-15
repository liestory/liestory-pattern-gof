package adapter.home.adapter;

import adapter.home.DbUserEntity;
import adapter.home.DbUserInfoEntity;

/**
 * @author nemykin 31.10.2020
 */
public interface TargetAdapter {

    void createUser(DbUserEntity entity);

    DbUserEntity readUser(Long id);

    void updateUser(DbUserEntity entity);

    void deleteUser(DbUserEntity entity);

    void createUserInfo(DbUserInfoEntity entity);

    DbUserInfoEntity readUserInfo(Long id);

    void updateUserInfo(DbUserInfoEntity entity);

    void deleteUserInfo(DbUserInfoEntity entity);

}
