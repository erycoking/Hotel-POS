package com.erycoking.hotel_pos.repositories

import com.erycoking.hotel_pos.modal.Room
import com.erycoking.hotel_pos.modal.Category
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoomRepository: JpaRepository<Room, Int>{
    fun findAllByCategory(t: Category, pageable: Pageable): List<Room>
}