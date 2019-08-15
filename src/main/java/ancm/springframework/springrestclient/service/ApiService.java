package ancm.springframework.springrestclient.service;

import java.util.List;

import ancm.springframework.api.domain.User;

public interface ApiService {
	
	List<User> getUsers(Integer limit);

}
