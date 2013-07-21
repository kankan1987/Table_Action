package com.test.xiekang;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.AbstractTransactionalTests;
import com.ygsoft.xiekang.dao.XiekangDAO;
import com.ygsoft.xiekang.model.Kstable;

@RunWith(BlockJUnit4ClassRunner.class)
public class DAOTest extends AbstractTransactionalTests {
	public DAOTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private XiekangDAO xieKangDAOProxy;

	@Test
	public void testDao() {
		Kstable kstable = new Kstable();
		kstable.setAccBookId(3);
		// kstable.setAccBookBz(1);

		// kstable.setAccBookName("xxxxx");
		// kstable.seteTime(Calendar.getInstance());
		// kstable.setsTime(Calendar.getInstance());
		// kstable.setStopFlag("a");
		// ApplicationContext context=new
		// FileSystemXmlApplicationContext("classpath:persistence-context.xml");
		// ((XiekangDAO)context.getBean("xieKangDAOProxy")).insertData(kstable);
		// ((XiekangDAO)context.getBean("xieKangDAOProxy")).deleteData(kstable);
		xieKangDAOProxy.selectAll();
		System.out.println("数据：" + xieKangDAOProxy.selectAll().size());

	}
	/**
	 * 增加数据测试
	 */
	@Test
	public void testInsertData() {
		testData();
		
		List<Kstable> kstableList = xieKangDAOProxy.selectData("from Kstable where accbookname = 'test'");
		assertEquals("test", kstableList.get(0).getAccBookName());
	}

	// 删除数据测试
	@Test
	public void testDeleteData(){
		testData();
		List<Kstable> kstableList = xieKangDAOProxy.selectData("from Kstable where accbookname = 'test'");
		xieKangDAOProxy.deleteData(kstableList.get(0));
		kstableList = xieKangDAOProxy.selectData("from Kstable where accbookname = 'test1'");
		assertTrue(kstableList.size() == 0);
	}
	
	// 修改数据测试
	@Test
	public void testUpdateData(){
		testData();
		List<Kstable> kstableList = xieKangDAOProxy.selectData("from Kstable where accbookname = 'test'");	
		Kstable kstable = kstableList.get(0);
		kstable.setAccBookName("test1");
		xieKangDAOProxy.updataData(kstable);
		kstableList = xieKangDAOProxy.selectData("from Kstable where accbookid =" + kstable.getAccBookId());
		assertEquals("test1", kstableList.get(0).getAccBookName());
	}
	
	// 查询数据测试
	@Test
	public void testSelectAll(){
		testData();
		List<Kstable> kstableList = xieKangDAOProxy.selectAll();	
		assertTrue(kstableList.size() > 0);
	}

	
	public void testData() {
		Kstable kstable = new Kstable();
		kstable.setAccBookName("test");
		kstable.seteTime(Calendar.getInstance());
		kstable.setsTime(Calendar.getInstance());
		kstable.setStopFlag("true");
		xieKangDAOProxy.insertData(kstable);
	}
	
	public void setXieKangDAOProxy(XiekangDAO xieKangDAOProxy) {
		this.xieKangDAOProxy = xieKangDAOProxy;
	}
}
