package com.greenenergy.solarsolutions.repository;

import com.greenenergy.solarsolutions.model.EstimatorRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimatorRepository extends JpaRepository<EstimatorRecord, Long> {
}
