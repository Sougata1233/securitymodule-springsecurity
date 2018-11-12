package com.sls.security.services;

import java.util.List;

import com.sls.security.dto.POHeaderDTO;
import com.sls.security.entity.POHeader;

public interface POHeaderService {
	
	List<POHeaderDTO> getAllPOHeader();
	POHeaderDTO getPOHeaderById(long id);
	void savePOHeader(POHeaderDTO pohdr);
	void updatePOHeader(POHeaderDTO pohdr);
	void deletePOHeader(long id);
}
