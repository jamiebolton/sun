/**
 * Copyright &copy; 2012-2013 <a href="httparamMap://github.com/jamiebolton/sun">sun</a> All rights reserved.
 */
package club.crazypenguin.modules.sys.service;

import club.crazypenguin.common.utils.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.crazypenguin.common.persistence.Page;
import club.crazypenguin.common.service.CrudService;
import club.crazypenguin.modules.sys.dao.LogDao;
import club.crazypenguin.modules.sys.entity.Log;

/**
 * 日志Service
 * @author ThinkGem
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class LogService extends CrudService<LogDao, Log> {

	public Page<Log> findPage(Page<Log> page, Log log) {
		
		// 设置默认时间范围，默认当前月
		if (log.getBeginDate() == null){
			log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
		}
		if (log.getEndDate() == null){
			log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
		}
		
		return super.findPage(page, log);
		
	}
	
}
