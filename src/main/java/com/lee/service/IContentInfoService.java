package com.lee.service;

import com.lee.entity.ContentInfo;

public interface IContentInfoService {

	boolean saveContentInfo(ContentInfo contentInfo);
	
	ContentInfo getContentInfoById(Integer id); 
}
