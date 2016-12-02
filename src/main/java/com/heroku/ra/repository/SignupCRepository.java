/*
 * Created on 2 Dec 2016 ( Time 16:47:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.heroku.ra.repository;

import com.heroku.ra.entities.SignupC ;

import org.springframework.data.repository.PagingAndSortingRepository;



/**
 * Spring JPA Repository for SignupC
 * 
 * @author Telosys Tools Generator
 *
 */
public interface SignupCRepository extends PagingAndSortingRepository<SignupC, Integer> {
		SignupC findBySfid(String sfid);


}