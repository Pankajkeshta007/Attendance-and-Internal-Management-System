package com.AIMS.Servlet;

import jakarta.servlet.annotation.MultipartConfig;

public class FileUpload {
	private MultipartConfig file;

	public MultipartConfig getFile() {
		return file;
	}

	public void setFile(MultipartConfig file) {
		this.file = file;
	}

	public FileUpload(MultipartConfig file) {
		super();
		this.file = file;
	}
	
	

}
