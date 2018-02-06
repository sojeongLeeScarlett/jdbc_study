package kr.or.dgit.jdbc_study.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import kr.or.dgit.erp_application.jdbc.DBcon;
import kr.or.dgit.jdbc_study.dao.StudentDao;

public class StudentService implements StudentDao {
	private final static StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}

	public StudentService() {

	}

	@Override
	public Student frindStudentById(int studid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(int studid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> lists = null;
		Connection con = DBcon.getInstance().getConnection();
		String sql ="select stud_id,name,email,dob from student;";
		try(PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(!rs.next()) {
				return Collections.emptyList();
			}lists = new ArrayList<>();
			do {
				lists.add(getStudent(rs));
			}while(rs.next());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lists;
	}

	private Student getStudent(ResultSet rs) throws SQLException {
		int studid = rs.getInt("stud_id");
		String name = rs.getString("name");
		String email = rs.getString("email");
		Date dob = rs.getDate("dob");
		return new Student(studid, name, email, dob);
	}

}
