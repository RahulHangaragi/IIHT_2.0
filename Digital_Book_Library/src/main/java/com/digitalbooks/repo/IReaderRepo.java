package com.digitalbooks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbooks.entity.ReaderInfo;

public interface IReaderRepo extends JpaRepository<ReaderInfo, Integer>{

}
