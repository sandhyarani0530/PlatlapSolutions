package com.platlap.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platlap.service.GroupAnagramService;
import com.platlap.service.PhoneService;

@RestController
@RequestMapping(path = "/api/v1")
public class PlatlapController {

	@Autowired
	GroupAnagramService groupAnagramService;

	@Autowired
	PhoneService phoneService;

	@PostMapping(path = "/getAnagram", produces = "application/json", consumes = "application/json")
	public ResponseEntity<List<List<String>>> getAnagram(@RequestParam(name="body") String body) {
		String[] split = body.split(",");
		List<List<String>> groupAnagrams = groupAnagramService.groupAnagrams(split);
		return new ResponseEntity<>(groupAnagrams, HttpStatus.OK);
	}

	@GetMapping(path = "/getAllContacts", produces = "application/json")
	public ResponseEntity<Map<String, String>> getAllContacts() {
		Map<String, String> allContacts = phoneService.getAllContacts();
		return new ResponseEntity<>(allContacts, HttpStatus.OK);
	}

	@GetMapping(path = "/getContacts", produces = "application/json")
	public ResponseEntity<List<String>> getContacts() {
		List<String> contacts = phoneService.getContacts();
		return new ResponseEntity<>(contacts, HttpStatus.OK);
	}

	}
