package com.cybage.service;
import java.util.List;

import com.cybage.dao.EnrolledDao;
import com.cybage.dao.EnrolledDaoImpl;
import com.cybage.model.Enrolled;

public class EnrolledServiceImpl implements EnrolledService {
	private EnrolledDao enrollDao;
	public EnrolledServiceImpl(EnrolledDao enrollDao) {
		this.enrollDao = enrollDao;
	}
	public List<Enrolled> findEnrolled() throws Exception {
		// TODO Auto-generated method stub
		return enrollDao.findEnrolled();
	}

}
