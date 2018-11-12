package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.JuteEntryHeaderDTO;
import com.sls.security.entity.JuteEntryHeader;

public interface JuteGateEntryHdrService {

	List<JuteEntryHeaderDTO> getAllJuteGateEntryHeader();
	ResponseEntity<JuteEntryHeaderDTO> saveJuteGateEntryHeader(JuteEntryHeaderDTO entryHdr);
	ResponseEntity<JuteEntryHeaderDTO> updateJuteGateEntryHeader(JuteEntryHeaderDTO entryHdr);
	DeleteDTO deleteJuteEntryHeader(long id);
	JuteEntryHeaderDTO getJuteGateEntryHeaderById(long id);
	
}
