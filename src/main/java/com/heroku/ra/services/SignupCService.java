/*
 * Created on 2 Dec 2016 ( Time 21:46:15 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.heroku.ra.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heroku.ra.entities.SignupC;
import com.heroku.ra.exceptions.SignupCNotFoundException;
import com.heroku.ra.repository.SignupCRepository;

@Service
@Transactional(rollbackFor=SignupCNotFoundException.class)
public class SignupCService 
{
	private static Logger logger = LoggerFactory.getLogger(SignupCService.class);
	
	@Autowired
	private SignupCRepository signupcRepository;
		
	/*
	 * READ methods
	 */
	public Page<SignupC> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("SignupCService -> findAll SignupCs");
		
		return signupcRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<SignupC> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("SignupCService -> findAll SignupCs");
		
		return signupcRepository.findAll();
	}

	public SignupC findBySfid(String signupc){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving SignupC with sfid:" + signupc);
		
		return signupcRepository.findBySfid(signupc);
		
	}

	public SignupC get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving SignupC with id:" + id);
		
		SignupC elementToGet = signupcRepository.findOne(id);
		
		if (elementToGet == null)
			throw new SignupCNotFoundException(id);
		
		return elementToGet;
	}

	public SignupC create(SignupC signupc) {

		if (logger.isDebugEnabled())
			logger.debug("SignupCService -> create:" + signupc);
			
		return signupcRepository.save(signupc);
	}

	public SignupC update(SignupC signupc) {
		
		if (logger.isDebugEnabled())
			logger.debug("SignupCService -> create:" + signupc);

		SignupC elementToUpdate = signupcRepository.findOne(signupc.getId());
		
		if (elementToUpdate == null)
			throw new SignupCNotFoundException(signupc.getName());
		
		elementToUpdate.update(signupc);
		signupcRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public SignupC delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("SignupCService -> delete:" + id);

		SignupC elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new SignupCNotFoundException(id);
		
		signupcRepository.delete(elementToDelete);

		return elementToDelete;
	}

}

