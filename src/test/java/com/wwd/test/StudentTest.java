package com.wwd.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wwd.web.mapper.StudentMapper;
import com.wwd.web.model.Student;

public class StudentTest extends BaseTest {
	private static Logger log = LoggerFactory.getLogger(Student.class);

	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void save() {
		Student student = new Student();
		student.setAge(18);
		student.setName("哈哈");
		student.setSex("女");
		studentMapper.insert(student);
	}

	@Test
	public void getStudent() {

		Student student = studentMapper.selectByPrimaryKey(1);
		log.info("student id:{} name:{} age:{} sex:{}", student.getId(), student.getName(), student.getAge(),
				student.getSex());
	}

}
