package com.app.main.model;

import java.util.List;

public class User {
private String userName;
private String coderepotype;
private List<RepositoryInfo> repo;


public String getCoderepotype() {
	return coderepotype;
}

public void setCoderepotype(String coderepotype) {
	this.coderepotype = coderepotype;
}

public List<RepositoryInfo> getRepo() {
	return repo;
}

public void setRepo(List<RepositoryInfo> repo) {
	this.repo = repo;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}


	
}
