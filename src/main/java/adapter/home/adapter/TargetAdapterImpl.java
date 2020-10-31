package adapter.home.adapter;

import adapter.home.DbUserEntity;
import adapter.home.DbUserInfoEntity;

/**
 * @author nemykin 31.10.2020
 */
public class TargetAdapterImpl implements TargetAdapter {

    private DbUserEntity dbUserEntity;
    private DbUserInfoEntity dbUserInfoEntity;

    public TargetAdapterImpl(DbUserEntity dbUserEntity, DbUserInfoEntity dbUserInfoEntity) {
        this.dbUserEntity = dbUserEntity;
        this.dbUserInfoEntity = dbUserInfoEntity;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        dbUserEntity.setId(entity.getId());
        dbUserEntity.setLogin(entity.getLogin());
        dbUserEntity.setPassword(entity.getPassword());
        dbUserEntity.setUserInfoId(entity.getUserInfoId());
    }

    @Override
    public DbUserEntity readUser(Long id) {
        if (dbUserEntity.getId() == id) {
            return dbUserEntity;
        }
        return null;
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        dbUserEntity.setId(entity.getId());
        dbUserEntity.setLogin(entity.getLogin());
        dbUserEntity.setPassword(entity.getPassword());
        dbUserEntity.setUserInfoId(entity.getUserInfoId());
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        if (dbUserEntity.equals(entity)) {
            dbUserEntity.setId(null);
            dbUserEntity.setLogin(null);
            dbUserEntity.setPassword(null);
            dbUserEntity.setUserInfoId(null);
        }
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        dbUserInfoEntity.setId(entity.getId());
        dbUserInfoEntity.setName(entity.getName());
        dbUserInfoEntity.setBirthday(entity.getBirthday());
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        if (dbUserInfoEntity.getId() == id) {
            return dbUserInfoEntity;
        }
        return null;
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        dbUserInfoEntity.setId(entity.getId());
        dbUserInfoEntity.setName(entity.getName());
        dbUserInfoEntity.setBirthday(entity.getBirthday());
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        if (dbUserInfoEntity.equals(entity)) {
            dbUserInfoEntity.setId(null);
            dbUserInfoEntity.setName(null);
            dbUserInfoEntity.setBirthday(null);
        }
    }
}
