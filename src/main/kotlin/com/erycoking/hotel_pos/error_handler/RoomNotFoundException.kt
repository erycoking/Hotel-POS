package com.erycoking.hotel_pos.error_handler

import java.lang.RuntimeException

class RoomNotFoundException(val id: Int): RuntimeException(){
    override val message: String?
        get() = "Could not find room $id"
}