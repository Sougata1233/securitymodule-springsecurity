package com.sls.security.services;

import java.util.List;

import com.sls.security.dto.FinishingDispatchRegHdrDTO;

public interface FinishingDispatchRegHdrService {

	List<FinishingDispatchRegHdrDTO> getAllFinishingDispatchRegHdr();
	FinishingDispatchRegHdrDTO getFinishingDispatchRegHdrById(long id);
	void saveFinishingDispatchRegHdr(FinishingDispatchRegHdrDTO finishingdispatch);
	void updateFinishingDispatchRegHdr(FinishingDispatchRegHdrDTO finishingdispatch);
	void deleteFinishingDispatchRegHdr(long id);
	
}
