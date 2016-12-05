/*
 * Created on 5 Dec 2016 ( Time 11:51:40 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.heroku.ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.heroku.ra.entities.GuestStayC;



/**
 * Spring JPA Repository for GuestStayC
 * 
 * @author Telosys Tools Generator
 *
 */
public interface GuestStayCRepository extends PagingAndSortingRepository<GuestStayC, Integer> {
		GuestStayC findBySfid(String sfid);


}