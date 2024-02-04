package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public interface MenuService {
	
	List<Menu> getList();
	Menu getMenu(String id);
	void setRepository(MenuRepository repository);
	
}
