package com.digitalbooks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReaderInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int readerId;
	private String readerName;
	private String emailId;
	private int purchaseId;
	private boolean subs;

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public boolean isSubs() {
		return subs;
	}

	public void setSubs(boolean subs) {
		this.subs = subs;
	}


	public ReaderInfo() {
		super();
	}

	public ReaderInfo(int readerId, String readerName, String emailId, int purchaseId, boolean subs) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.emailId = emailId;
		this.purchaseId = purchaseId;
		this.subs = subs;
	}

	public ReaderInfo(String readerName, String emailId, int purchaseId, boolean subs) {
		super();
		this.readerName = readerName;
		this.emailId = emailId;
		this.purchaseId = purchaseId;
		this.subs = subs;
	}

	@Override
	public String toString() {
		return "ReaderInfo [readerId=" + readerId + ", readerName=" + readerName + ", emailId=" + emailId
				+ ", purchaseId=" + purchaseId + ", subs=" + subs + "]";
	}


}