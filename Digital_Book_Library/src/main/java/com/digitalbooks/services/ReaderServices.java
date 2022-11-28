package com.digitalbooks.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.ReaderInfo;
import com.digitalbooks.repo.IReaderRepo;

@Service
public class ReaderServices implements IReaderServices {

	@Autowired
	IReaderRepo readRepo;

	@Override
	public ReaderInfo buybook(ReaderInfo readInfo) {
		ReaderInfo boughtBook = readRepo.save(readInfo);
		return boughtBook;
	}

	@Override
	public ReaderInfo saveReader(ReaderInfo readInfo) {
		ReaderInfo savedReader = readRepo.save(readInfo);
		return savedReader;
	}

	@Override
	public Optional<ReaderInfo> getInfo(Integer id) {
		return readRepo.findById(id);
	}

	@Override
	public void deleteInfo(Integer id) {
		readRepo.deleteById(id);
	}

}