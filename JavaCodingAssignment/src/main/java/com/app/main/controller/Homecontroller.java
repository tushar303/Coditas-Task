package com.app.main.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.main.model.RepositoryInfo;
import com.app.main.model.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Homecontroller {
	RestTemplate rstemp = new RestTemplate();

	@RequestMapping(value = "/github/{username}/repos")
	public User allrepository(@PathVariable String username)
			throws JsonParseException, JsonMappingException, IOException {

		String url = "https://api.github.com/users/" + username + "/repos";
		System.out.println(url);
		List list = rstemp.getForObject(url, List.class);

		/*
		 * ObjectMapper ob=new ObjectMapper(); List<RepositoryInfo>
		 * list=ob.readValue(response, List.class)
		 */;
		User user = new User();
		if (list.isEmpty()) {

		} else {
			user.setUserName(username);
			user.setRepo(list);
			user.setCoderepotype("github");

		}

		return user;
	}

}
