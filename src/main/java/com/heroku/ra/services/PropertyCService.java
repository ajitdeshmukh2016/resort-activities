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

import com.heroku.ra.entities.PropertyC;
import com.heroku.ra.exceptions.PropertyCNotFoundException;
import com.heroku.ra.repository.PropertyCRepository;

@Service
@Transactional(rollbackFor=PropertyCNotFoundException.class)
public class PropertyCService 
{
	private static Logger logger = LoggerFactory.getLogger(PropertyCService.class);
	
	@Autowired
	private PropertyCRepository propertycRepository;
		
	/*
	 * READ methods
	 */
	public Page<PropertyC> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("PropertyCService -> findAll PropertyCs");
		
		return propertycRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<PropertyC> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("PropertyCService -> findAll PropertyCs");
		
		return propertycRepository.findAll();
	}

	public PropertyC findBySfid(String propertyc){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving PropertyC with sfid:" + propertyc);
		
		return propertycRepository.findBySfid(propertyc);
		
	}

	public PropertyC get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving PropertyC with id:" + id);
		
		PropertyC elementToGet = propertycRepository.findOne(id);
		
		if (elementToGet == null)
			throw new PropertyCNotFoundException(id);
		
		return elementToGet;
	}

	public PropertyC create(PropertyC propertyc) {

		if (logger.isDebugEnabled())
			logger.debug("PropertyCService -> create:" + propertyc);
			
		return propertycRepository.save(propertyc);
	}

	public PropertyC update(PropertyC propertyc) {
		
		if (logger.isDebugEnabled())
			logger.debug("PropertyCService -> create:" + propertyc);

		PropertyC elementToUpdate = propertycRepository.findOne(propertyc.getId());
		
		if (elementToUpdate == null)
			throw new PropertyCNotFoundException(propertyc.getName());
		
		elementToUpdate.update(propertyc);
		propertycRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public PropertyC delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("PropertyCService -> delete:" + id);

		PropertyC elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new PropertyCNotFoundException(id);
		
		propertycRepository.delete(elementToDelete);

		return elementToDelete;
	}

}

