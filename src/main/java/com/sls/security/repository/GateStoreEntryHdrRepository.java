package com.sls.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sls.security.entity.GateStoreEntryRegHdr;

@Repository
public interface GateStoreEntryHdrRepository extends JpaRepository<GateStoreEntryRegHdr, Long> {
	
	/*@Query("SELECT s FROM GateStoreEntryHdr s WHERE s.hdrId =:hdrId")
	GateStoreEntryHdrRepository findByHdrId(@Param("hdrId") long hdrId);*/

}
