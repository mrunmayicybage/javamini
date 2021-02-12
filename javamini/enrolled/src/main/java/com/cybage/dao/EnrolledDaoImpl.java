package com.cybage.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Enrolled;
import com.cybage.util.DbUtil;


public class EnrolledDaoImpl implements EnrolledDao{
	public List<Enrolled> findEnrolled(int user_id) throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "SELECT course_name, enroll_course.start_date,enroll_course.end_date FROM course RIGHT JOIN enroll_course ON course.course_id = enroll_course.course_id and enroll_course.user_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,user_id);
		ResultSet rs = ps.executeQuery();
		
		List<Enrolled> enroll = new ArrayList<Enrolled>();
		while (rs.next()) {
			Enrolled enrolled = new Enrolled();
			//enrolled.setEcid(rs.getInt(1));
			enrolled.setCoursename(rs.getString(1));
			//enrolled.setUserid(rs.getInt());
			//enrolled.setCourseid(rs.getInt());
			//enrolled.setCompletedcourse(rs.getInt(4));
			enrolled.setStartdate(rs.getDate(2));
			enrolled.setEnddate(rs.getDate(3));
			
			
			enroll.add(enrolled);
		}
		
		return enroll;
	}

}
