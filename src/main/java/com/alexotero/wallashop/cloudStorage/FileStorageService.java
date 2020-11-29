package com.alexotero.wallashop.cloudStorage;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.storage.Storage.BlobTargetOption;
import com.google.cloud.storage.Storage.PredefinedAcl;


@Service
public class FileStorageService implements IFileStorageService{
	// get service by env var GOOGLE_APPLICATION_CREDENTIALS. Json file generated in API & Services -> Service account key
	private static Storage storage = StorageOptions.getDefaultInstance().getService(); 
	
	@Override
	public String upload(MultipartFile file) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        String extension = StringUtils.getFilenameExtension(filename);
        String justFilename = filename.replace("."+extension, "");
        String storedFilename = System.currentTimeMillis() + "_" + justFilename + "." + extension;
		
		try {			
			BlobInfo blobInfo = storage.create(
				BlobInfo.newBuilder("wallashop-imgbucket", storedFilename).build(), //get original file name
				file.getBytes(), // the file
				BlobTargetOption.predefinedAcl(PredefinedAcl.PUBLIC_READ) // Set file permission
			);
			return blobInfo.getMediaLink(); // Return file url
		}catch(IllegalStateException e){
			throw new RuntimeException(e);
		}catch(IOException io) {
			throw new RuntimeException(io);
		}
  	}
	
	@Override
	public void delete(String name) {
		storage.delete("wallashop-imgbucket", name);
	}
}
