package com.digitalbooks.services;

import java.util.Optional;

import com.digitalbooks.entity.ReaderInfo;

public interface IReaderServices {
	
	ReaderInfo buybook(ReaderInfo readInfo);
	
	ReaderInfo saveReader(ReaderInfo readInfo);
	
	Optional<ReaderInfo> getInfo(Integer id);
	
	public void deleteInfo(Integer id);

}
