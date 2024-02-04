package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.JDBCMenuRepository;
import kr.co.rland.web.repository.MenuRepository;

public class MenuServiceImp implements MenuService {
	
	private MenuRepository repository;
	
	public MenuServiceImp() {
		//repository = new JDBCMenuRepository();
	}
	
	public List<Menu> getList() {
		List<Menu> list= repository.findAll();
		return list;
	}

	public Menu getMenu(String id) {
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public void setRepository(MenuRepository repository) {
		this.repository =repository;
	}

}
