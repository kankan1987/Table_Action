package com.test;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.springframework.test.AbstractTransactionalSpringContextTests;
/**
 * 事务性的测试可实现回滚等方法
 * 其余的方法与AbstractDependencyInjectionSpringContextTests是一样的
 * @author kk
 *
 */
public class AbstractTransactionalTests extends
		AbstractTransactionalSpringContextTests {
	public AbstractTransactionalTests() throws Exception{
		//不检查测试类中定义的属性在spring容器中是否存在
		//setDependencyCheck(false);
		//启用直接对属性的注入而不需要setter方法，但是属性要申明为protected
		//setPopulateProtectedVariables(true);
		/**
		 * 1.AUTOWIRE_BY_TYPE：按类型匹配的方式进行自动装配，这个默认的机制
		 * 2.AUTOWIRE_BY_NAME：按名字匹配的方式进行自动装配 
		 * 3.AUTOWIRE_NO：不使用自动装配机制，这意味着你需要手工调用getBean()进行装配。 
		 */
		setAutowireMode(AUTOWIRE_BY_NAME);
		//提交事务，测试数据真正提交到数据库中，此方法可以在测试方法中调用
		//setComplete();
		
		//子类可以覆盖这两个方法，以便在事务性测试方法运行的前后执行一些数据库初始化的
		//操作并在事务完成后清除之
		//onSetUpBeforeTransaction();
		//onTearDownAfterTransaction();
		
		//这对方法和前面介绍的方法完成相同的功能，只不过它们是在测试方法的相同事务中执行的。 
		//AbstractTransactionalSpringContextTests另外还提供了一组用于测试延迟数据加载的方法：endTransaction()/startNewTransaction()。我在测试
		//Hibernate、JPA等允许延迟数据加载的应用时，如何模拟数据在Service层事务中被部分加载，当传递到Web层时重新打开事务完成延迟部分数据加载的测试场景
		//呢？这两个方法即为此用途而生：你可以在测试方法中显式调用endTransaction()方法以模拟从Service层中获取部分数据后返回，尔后，再通过
		//startNewTransaction()开启一个和原事务无关新事务——模拟在Web层中重新打开事务，接下来你就可以访问延迟加载的数据，看是否一切如期所料了。 

//		onSetUpInTransaction();
//		onTearDownInTransaction();
//		
//		endTransaction();
//		startNewTransaction();	
	}
	
	@Override
	protected String[] getConfigLocations() {
		// TODO Auto-generated method stub
		/*return new String[]{"classpath:jetty-spring-localhost.xml",
				"classpath:context.xml",
				"classpath:persistence-context.xml"};*/
		return new String[]{"classpath:persistence-context.xml",};
	}
}
