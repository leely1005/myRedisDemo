package com.lee.service;

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.lee.base.BaseTest;
import com.lee.entity.ContentInfo;

public class MyTest extends BaseTest{ 
	@Autowired
	private IContentInfoService contentInfoService;
	
	@Test
	public void saveContentInfo(){
		ContentInfo contentInfo = new ContentInfo();
		contentInfo.setAuthor("Lee");
		contentInfo.setContent("That's perfect!");
		contentInfo.setCreateTime(new Date());
		assertTrue(contentInfoService.saveContentInfo(contentInfo));
	}
	
	@Test
	public void getContentInfo(){
		ContentInfo content = contentInfoService.getContentInfoById(3);
		assertNotNull(content);
	}
}
