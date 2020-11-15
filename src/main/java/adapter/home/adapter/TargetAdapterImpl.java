package adapter.home.adapter;

import adapter.home.DbUserEntity;
import adapter.home.DbUserInfoEntity;
import adapter.home.orm.first.IFirstOrm;
import adapter.home.orm.second.ISecondOrm;

/**
 * @author nemykin 31.10.2020
 */
public class TargetAdapterImpl implements TargetAdapter {

    private IFirstOrm iFirstOrm;
    private ISecondOrm iSecondOrm;

    public TargetAdapterImpl(IFirstOrm iFirstOrm, ISecondOrm iSecondOrm) {
        this.iFirstOrm = iFirstOrm;
        this.iSecondOrm = iSecondOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        iFirstOrm.create(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        for (DbUserEntity dbUserInfoEntity : iSecondOrm.getContext().getUsers()) {
            if (dbUserInfoEntity == iFirstOrm.read(id))
                return dbUserInfoEntity;
        }
        return null;
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        iFirstOrm.update(entity);
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        iFirstOrm.delete(entity);
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        iFirstOrm.create(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        for (DbUserInfoEntity dbUserInfoEntity : iSecondOrm.getContext().getUserInfos()) {
            if (dbUserInfoEntity == iFirstOrm.read(id))
                return dbUserInfoEntity;
        }
        return null;
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        iFirstOrm.update(entity);
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        iFirstOrm.delete(entity);
    }
}
