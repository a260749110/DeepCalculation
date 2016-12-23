package com.sql.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sql.domain.TestPo;

public interface  TestDao extends PagingAndSortingRepository<TestPo, Integer>{

}
