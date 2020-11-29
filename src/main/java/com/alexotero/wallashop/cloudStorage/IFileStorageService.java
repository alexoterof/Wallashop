package com.alexotero.wallashop.cloudStorage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IFileStorageService {
	public String upload(MultipartFile file);
	
	public void delete(String name);
   // Resource loadAsResource(String filename);
}
