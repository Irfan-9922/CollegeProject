package org.springboot.service.CollegeApplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Irfan
 *
 */
@Entity
public class CollegeEntity {

	/**
	 * The College Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "COLLEGE_ID")
	private Long collegeId;

	/**
	 * The College Name
	 */
	@Column(name = "COLLEGE_NAME")
	private String collegeName;

	/**
	 * The College City
	 */
	@Column(name = "COLLEGE_CITY")
	private String collegeCity;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "college", fetch = FetchType.EAGER)

	private List<StudentEntity> listOfStudent;

	/**
	 * @return listOfStudent
	 *//*
		 * public List<StudentEntity> getListOfStudent() { return listOfStudent; }
		 */
	/**
	 * @param listOfStudent
	 */
	public void setListOfStudent(List<StudentEntity> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	/**
	 * @return collegeId
	 */
	public Long getCollegeId() {
		return collegeId;
	}

	/**
	 * @param collegeId
	 */
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	/**
	 * @return collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * @param collegeName
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * @return collegeCity
	 */
	public String getCollegeCity() {
		return collegeCity;
	}

	/**
	 * @param collegeCity
	 */
	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}

}
