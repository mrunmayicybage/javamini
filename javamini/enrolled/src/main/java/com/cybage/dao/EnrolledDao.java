package com.cybage.dao;
import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Enrolled;

public interface EnrolledDao {
	
	public List<Enrolled> findEnrolled() throws Exception;

}
