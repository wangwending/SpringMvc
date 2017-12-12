package com.wwd.web.service;

/**
 * 
		* ClassName: TxPropagationService <br/>
		* Function: 事务传播行为. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
public interface TxPropagationService {
	/**
	 * 
			* proPagationRequired:(当前方法必须在事务中，事务存在就运行在当前事物，否则开启新的事务). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationRequired();

	/**
	 * 
			* proPagationSupports:(当前方法不需要事务上下文，如果存在事务，那么方法会在这个事物中运行). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationSupports();

	/**
	 * 
			* proPagationManDatory:(表示改方法必须在事物中运行，否则抛出异常). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationManDatory();

	/**
	 * 
			* proPagationRequiredNew:(表示当前方法必须运行在自己的事物中，一个新的事物将被启动，如果存在当前事物，在该方法执行期间，当前事物会被挂起). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationRequiredNew();

	/**
	 * 
			* proPagationNotSupported:(表示该方法不应该运行在事物中，如果存在当前事物，在该方法运行期间，当前事物被挂起). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationNotSupported();

	/**
	 * 
			* proPagationNever:(表示当前方法不应该运行在事物上下午中，如果当前正有一个事物运行抛出异常). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationNever();

	/**
	 * 
			* proPagationNested:(表示如果当前存在事物，那么该方法嵌套事务中运行，嵌套的事务可以独立于当前事务进行单独的提交或回滚，如果当前事务不存在那么其行为和默认的传播行为一致，如果存在差异按照数据库厂商为准). <br/>
			*
			* @author wangwending
			* @since JDK 1.7
	 */
	void proPagationNested();
}
