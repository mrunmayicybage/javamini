package com.cybage.service;
import java.util.List;

import com.cybage.model.Enrolled;

public interface EnrolledService {
	
	public List<Enrolled> findEnrolled() throws Exception;

}
