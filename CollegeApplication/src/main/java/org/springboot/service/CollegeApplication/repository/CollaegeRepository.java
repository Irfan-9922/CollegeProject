package org.springboot.service.CollegeApplication.repository;

import org.springboot.service.CollegeApplication.entity.CollegeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Irfan
 *
 */
@Repository
public interface CollaegeRepository extends CrudRepository<CollegeEntity, Long>{

}
