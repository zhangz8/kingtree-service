package com.kingtree.service.impl;

import org.springframework.stereotype.Service;

import com.kingtree.entity.House;
import com.kingtree.service.HouseService;

@Service("houseService")
public class HouseServiceImpl implements HouseService {

	@Override
	public House get(int id) {
		if (id <= 0) {
			return null;
		}
		House house = new House();
		house.setId(13);
		house.setPrice(120.00);
		house.setTitle("西城时代广场");
		house.setSpace(89.00);
		return house;
	}

}
