package com.lee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.dao.IContentInfoDao;
import com.lee.entity.ContentInfo;
import com.lee.service.IContentInfoService;

@Service
public class ContentInfoServiceImpl implements IContentInfoService{
	
	@Autowired
	IContentInfoDao contentInfoDao;
	public boolean saveContentInfo(ContentInfo contentInfo) {
		return contentInfoDao.insert(contentInfo) > 0 ? true : false;
	}
	
	public ContentInfo getContentInfoById(Integer id) {
		return contentInfoDao.selectByPrimaryKey(id);
	}
}
