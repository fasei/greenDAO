package de.greenrobot.dao.unittest;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import de.greenrobot.dao.unittest.MinimalEntity;

import de.greenrobot.dao.unittest.MinimalEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig minimalEntityDaoConfig;

    private final MinimalEntityDao minimalEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        minimalEntityDaoConfig = daoConfigMap.get(MinimalEntityDao.class).clone();
        minimalEntityDaoConfig.initIdentityScope(type);

        minimalEntityDao = new MinimalEntityDao(minimalEntityDaoConfig, this);

        registerDao(MinimalEntity.class, minimalEntityDao);
    }
    
    public void clear() {
        minimalEntityDaoConfig.getIdentityScope().clear();
    }

    public MinimalEntityDao getMinimalEntityDao() {
        return minimalEntityDao;
    }

}