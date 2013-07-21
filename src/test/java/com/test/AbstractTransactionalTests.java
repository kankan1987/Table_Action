package com.test;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.springframework.test.AbstractTransactionalSpringContextTests;
/**
 * �����ԵĲ��Կ�ʵ�ֻع��ȷ���
 * ����ķ�����AbstractDependencyInjectionSpringContextTests��һ����
 * @author kk
 *
 */
public class AbstractTransactionalTests extends
		AbstractTransactionalSpringContextTests {
	public AbstractTransactionalTests() throws Exception{
		//�����������ж����������spring�������Ƿ����
		//setDependencyCheck(false);
		//����ֱ�Ӷ����Ե�ע�������Ҫsetter��������������Ҫ����Ϊprotected
		//setPopulateProtectedVariables(true);
		/**
		 * 1.AUTOWIRE_BY_TYPE��������ƥ��ķ�ʽ�����Զ�װ�䣬���Ĭ�ϵĻ���
		 * 2.AUTOWIRE_BY_NAME��������ƥ��ķ�ʽ�����Զ�װ�� 
		 * 3.AUTOWIRE_NO����ʹ���Զ�װ����ƣ�����ζ������Ҫ�ֹ�����getBean()����װ�䡣 
		 */
		setAutowireMode(AUTOWIRE_BY_NAME);
		//�ύ���񣬲������������ύ�����ݿ��У��˷��������ڲ��Է����е���
		//setComplete();
		
		//������Ը����������������Ա��������Բ��Է������е�ǰ��ִ��һЩ���ݿ��ʼ����
		//��������������ɺ����֮
		//onSetUpBeforeTransaction();
		//onTearDownAfterTransaction();
		
		//��Է�����ǰ����ܵķ��������ͬ�Ĺ��ܣ�ֻ�����������ڲ��Է�������ͬ������ִ�еġ� 
		//AbstractTransactionalSpringContextTests���⻹�ṩ��һ�����ڲ����ӳ����ݼ��صķ�����endTransaction()/startNewTransaction()�����ڲ���
		//Hibernate��JPA�������ӳ����ݼ��ص�Ӧ��ʱ�����ģ��������Service�������б����ּ��أ������ݵ�Web��ʱ���´���������ӳٲ������ݼ��صĲ��Գ���
		//�أ�������������Ϊ����;������������ڲ��Է�������ʽ����endTransaction()������ģ���Service���л�ȡ�������ݺ󷵻أ�������ͨ��
		//startNewTransaction()����һ����ԭ�����޹������񡪡�ģ����Web�������´����񣬽�������Ϳ��Է����ӳټ��ص����ݣ����Ƿ�һ�����������ˡ� 

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
