package admin_user.services;

import admin_user.dto.UserDto;
import admin_user.model.User;

public interface UserService {
	
	User save (UserDto userDto);
	

}
