/*
 * Created on 2 Dec 2016 ( Time 16:47:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.heroku.ra.repository;

import com.heroku.ra.entities.Account ;

import org.springframework.data.repository.PagingAndSortingRepository;



/**
 * Spring JPA Repository for Account
 * 
 * @author Telosys Tools Generator
 *
 */
public interface AccountRepository extends PagingAndSortingRepository<Account, Integer> {
		Account findBySfid(String sfid);


}