/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/sun">sun</a> All rights reserved.
 */
package club.crazypenguin.modules.sys.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.modules.sys.entity.Log;
import club.crazypenguin.common.persistence.CrudDao;

/**
 * 日志DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
