package ancm.springframework.springrestclient.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ancm.springframework.api.domain.User;
import ancm.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService{

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers(Integer limit) {
		
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
		return userData.getData();
	}




}
