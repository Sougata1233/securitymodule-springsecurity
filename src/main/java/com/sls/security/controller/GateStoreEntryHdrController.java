package com.sls.security.controller;

import static com.sls.security.constant.MasterManagementConstant.USER_HOST_SERVER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.GateStoreEntryRegHdrDTO;
import com.sls.security.services.serviceImpl.GateStoreEntryHdrServiceImple;

@RestController
@RequestMapping("gatestoreentryhdr")
public class GateStoreEntryHdrController {
	
	@Autowired
	GateStoreEntryHdrServiceImple storeentryhdrService;
	
	@GetMapping("/getAllStoreEntryHdr")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<GateStoreEntryRegHdrDTO> getAllStoreEntryHdr(){
		return storeentryhdrService.getAllGateStoreEntryRegHdr();
	}
	
	@GetMapping("/getAllStoreEntryHdrById/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public GateStoreEntryRegHdrDTO getAllStoreEntryHdrById(@PathVariable("id") long id){
		return storeentryhdrService.getGateStoreEntryRegHdrById(id);
	}
	
	@PostMapping("/saveStoreEntryHdr")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<GateStoreEntryRegHdrDTO> saveGateStoreEntryRegHdr(@RequestBody GateStoreEntryRegHdrDTO storeentryhdr) {
		storeentryhdrService.saveGateStoreEntryRegHdr(storeentryhdr);
		return new ResponseEntity<GateStoreEntryRegHdrDTO>(storeentryhdr, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateStoreEntryHdr")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public void supdateGateStoreEntryRegHdr(@RequestBody GateStoreEntryRegHdrDTO storeentryhdr) {
		storeentryhdrService.saveGateStoreEntryRegHdr(storeentryhdr);
	}
	
	@DeleteMapping("/deleteStoreEntryHdr/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public DeleteDTO deleteStoreEntryHdr(@PathVariable("id") long id) {
		storeentryhdrService.deleteGateStoreEntryRegHdr(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;
	}
	
}
