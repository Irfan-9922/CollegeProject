package org.springboot.service.CollegeApplication.repository;

import org.springboot.service.CollegeApplication.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Irfan
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long>{

}
