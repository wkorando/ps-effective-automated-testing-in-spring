package com.ps.bk.hotel.room.service.impl;

import com.ps.bk.hotel.room.model.Room;
import com.ps.bk.hotel.room.repo.RoomRepo;
import com.ps.bk.hotel.room.service.RoomService;

public class RoomServiceImpl implements RoomService {
	private RoomRepo repo;
	
	
	public RoomServiceImpl(RoomRepo repo) {
		this.repo = repo;
	}

	@Override
	public Iterable<Room> getAllRooms() {
		return repo.findAll();
	}

	@Override
	public Room findRoom(long roomId) {
		return repo.findOne(roomId);
	}

	@Override
	public void updateRoom(Room room) {
		repo.save(room);
	}

	@Override
	public void addRoom(Room room) {
		repo.save(room);
	}

}
