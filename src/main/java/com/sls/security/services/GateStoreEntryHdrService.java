package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.GateStoreEntryRegHdrDTO;
import com.sls.security.entity.GateStoreEntryRegHdr;

public interface GateStoreEntryHdrService {
	
	List<GateStoreEntryRegHdrDTO> getAllGateStoreEntryRegHdr();
	GateStoreEntryRegHdrDTO getGateStoreEntryRegHdrById(long id);
	ResponseEntity<GateStoreEntryRegHdrDTO> saveGateStoreEntryRegHdr(GateStoreEntryRegHdrDTO gatestoreenryhdr);
	ResponseEntity<GateStoreEntryRegHdrDTO> updateGateStoreEntryRegHdr(GateStoreEntryRegHdrDTO gatestorehdr);
	DeleteDTO deleteGateStoreEntryRegHdr(long id);

}
