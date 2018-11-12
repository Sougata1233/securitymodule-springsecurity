package com.sls.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sls.security.entity.GateStoreEntryRegDtl;

public interface GateStoreEntryDtlRepository extends JpaRepository<GateStoreEntryRegDtl, Long> {
	
	@Query(value = "SELECT GATE_STORE_ENTRY_REG_DTL_SEQ.nextval FROM dual", nativeQuery = true)
    Long getNextSeriesId();

}
