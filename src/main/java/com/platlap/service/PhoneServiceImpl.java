package com.platlap.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platlap.common.DataProvider;

import com.platlap.exception.NotFoundException;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	ServuceUtil servuceUtil;

	@Override
	public Map<String, String> getAllContacts() {
		return DataProvider.contacts;
	}

	/*
	 * @Override public List<String> getContacts(String name) { List<String> data =
	 * servuceUtil.filterContacts(name); if (data != null) { return
	 * servuceUtil.filterContacts(name); } else { throw new
	 * NotFoundException("No Records Found","204"); } }
	 */
	
	@Override
	public List<String> getContacts() {
		List<String> data = DataProvider.contacts.keySet().stream()
				.map(s->s)
			.collect(Collectors.toList());
		if (data != null) {
			return data;
		} else {
			throw new NotFoundException("No Records Found","204");
		}
	}

}
