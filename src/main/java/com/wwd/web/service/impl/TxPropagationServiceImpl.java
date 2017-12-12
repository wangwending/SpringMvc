package com.wwd.web.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wwd.web.mapper.StudentMapper;
import com.wwd.web.service.TxPropagationService;

/**
 * 
		* ClassName: TxPropagationServiceImpl <br/>
		* Function: 事务传播行为实现. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
public class TxPropagationServiceImpl implements TxPropagationService {
	private static final Logger log = LoggerFactory.getLogger(TxPropagationServiceImpl.class);
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void proPagationRequired() {
		log.info("事务传播行为开始Propagation.REQUIRED");
		
		log.info("事务传播行为结束Propagation.REQUIRED");
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public void proPagationSupports() {
		log.info("事务传播行为开始Propagation.SUPPORTS");
		
		log.info("事务传播行为结束Propagation.SUPPORTS");	
	}

	@Override
	@Transactional(propagation = Propagation.MANDATORY)
	public void proPagationManDatory() {
		log.info("事务传播行为开始Propagation.MANDATORY");
		
		log.info("事务传播行为结束Propagation.MANDATORY");
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void proPagationRequiredNew() {
		log.info("事务传播行为开始Propagation.REQUIRES_NEW");
		
		log.info("事务传播行为结束Propagation.REQUIRES_NEW");
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void proPagationNotSupported() {
		log.info("事务传播行为开始Propagation.NOT_SUPPORTED");
		
		log.info("事务传播行为结束Propagation.NOT_SUPPORTED");
	}

	@Override
	@Transactional(propagation = Propagation.NEVER)
	public void proPagationNever() {
		log.info("事务传播行为开始Propagation.NEVER");
		
		log.info("事务传播行为结束Propagation.NEVER");
	}

	@Override
	@Transactional(propagation = Propagation.NESTED)
	public void proPagationNested() {
		log.info("事务传播行为开始Propagation.NESTED");
		
		log.info("事务传播行为结束Propagation.NESTED");
	}

}
