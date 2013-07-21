package com.ygsoft.xiekang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.ygsoft.xiekang.model.Kstable;

public class XiekangDAOImp extends HibernateDaoSupport implements XiekangDAO {
	private LocalSessionFactoryBean sessionFactory;

	public void setSessionFactory(LocalSessionFactoryBean sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void deleteData(Kstable deleteData) {
		// TODO Auto-generated method stub
		Kstable kstable = (Kstable) getHibernateTemplate().get(Kstable.class,
				deleteData.getAccBookId());
		getHibernateTemplate().delete(kstable);
	}

	public void insertData(Kstable insertData) {
		getHibernateTemplate().save(insertData);

	}

	public void updataData(Kstable updataData) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(updataData);
	}

	public List<Kstable> selectData(String sql) {
		List<Kstable> listKstable = getHibernateTemplate().find(sql);
		return listKstable;
	}

	public List<Kstable> selectAll() {
		List<Kstable> listKstable = getHibernateTemplate().find("from Kstable");
		return listKstable;
	}
}
