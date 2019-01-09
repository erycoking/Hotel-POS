package com.erycoking.hotel_pos.components

import com.erycoking.hotel_pos.modal.Room
import com.erycoking.hotel_pos.modal.Category
import com.erycoking.hotel_pos.repositories.RoomRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val roomRepository: RoomRepository): CommandLineRunner{
    override fun run(vararg args: String?) {
        roomRepository.save(Room(1, Category.A, "A1", "http://image.com/image", 600.00))
    }

}