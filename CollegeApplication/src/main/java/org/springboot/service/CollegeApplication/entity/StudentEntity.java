package org.springboot.service.CollegeApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Irfan
 *
 */
@Entity
public class StudentEntity {

	/**
	 * The Student Id
	 */
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name ="STUDENT_ID")

	private Long studentId;

	/**
	 * The StudentName
	 */
	@Column(name ="STUDENT_NAME")
	private String studentName;

	/**
	 * The StudentAge
	 */
	@Column(name ="STUDENT_AGE")
	private Long studentAge;

	/**
	 * @return college
	 */
	public CollegeEntity getCollege() {
		return college;
	}

	/**
	 * @param college
	 */
	public void setCollege(CollegeEntity college) {
		this.college = college;
	}

	@ManyToOne
	@JoinColumn(name ="COLLEGE_ID")
	private CollegeEntity college;
	/**
	 * @return studentId
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return studentAge
	 */
	public Long getStudentAge() {
		return studentAge;
	}

	/**
	 * @param studentAge
	 */
	public void setStudentAge(Long studentAge) {
		this.studentAge = studentAge;
	}

}
