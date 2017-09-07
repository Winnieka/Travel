package com.six.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.six.dto.Major;
import com.six.mapper.MajorMapper;
import com.six.service.MajorService;

@Service("majorService")
public class MajorServiceimpl implements MajorService {
	@Autowired
	private MajorMapper majorMapper;

	@Override
	public List<Major> getMajorList() {
		// TODO Auto-generated method stub
		return majorMapper.getMajorList();
	}

}
