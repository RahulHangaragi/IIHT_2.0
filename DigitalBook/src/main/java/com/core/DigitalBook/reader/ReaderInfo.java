package com.core.DigitalBook.reader;

public class ReaderInfo {

	private String readerName;
	private int readerEmailId;

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public int getReaderEmailId() {
		return readerEmailId;
	}

	public void setReaderEmailId(int readerEmailId) {
		this.readerEmailId = readerEmailId;
	}

	public ReaderInfo(String readerName, int readerEmailId) {
		super();
		this.readerName = readerName;
		this.readerEmailId = readerEmailId;
	}

	public ReaderInfo() {
		super();
	}

	@Override
	public String toString() {
		return "ReaderInfo [readerName=" + readerName + ", readerEmailId=" + readerEmailId + "]";
	}

}
