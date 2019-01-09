package com.erycoking.hotel_pos.services

import com.erycoking.hotel_pos.modal.Category
import com.erycoking.hotel_pos.modal.Room
import com.erycoking.hotel_pos.repositories.RoomRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class RoomService(val roomRepository: RoomRepository){

    private val size = 50

    fun allRooms() = roomRepository.findAll()
    fun findRoom(roomId: Int) = roomRepository.findById(roomId)
    fun findAllByCategory(t: Category, page: Int) = roomRepository.findAllByCategory(t, PageRequest.of(page, size, Sort.by("roomNo").ascending()))
    fun saveRoom(room: Room) = roomRepository.save(room)
    fun deleteRoom(roomId: Int) = roomRepository.deleteById(roomId)
    fun deleteRoom(room: Room) = roomRepository.delete(room)
}