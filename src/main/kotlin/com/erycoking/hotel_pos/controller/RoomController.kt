package com.erycoking.hotel_pos.controller

import com.erycoking.hotel_pos.components.RoomResourceAssembler
import com.erycoking.hotel_pos.error_handler.RoomNotFoundException
import com.erycoking.hotel_pos.modal.Room
import com.erycoking.hotel_pos.services.RoomService
import org.springframework.hateoas.Resource
import org.springframework.http.HttpRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/room")
class RoomController(val roomService: RoomService, val resourceAssembler: RoomResourceAssembler){

    @GetMapping
    fun getAllRooms() = roomService.allRooms().map { resourceAssembler.toResource(it) }

    @GetMapping("/{id}")
    fun getRoomById(@PathVariable("id") roomNo: Int): Resource<Room> {
        val room = roomService.findRoom(roomNo).orElseThrow {RoomNotFoundException(roomNo)}
        return resourceAssembler.toResource(room)
    }

    @PostMapping("/save")
    fun saveRoom(@RequestBody room: Room) = resourceAssembler.toResource(roomService.saveRoom(room))

    @DeleteMapping("/delete")
    fun deleteRoom(@RequestBody room: Room): ResponseEntity<String> {
        roomService.deleteRoom(room)
        return ResponseEntity.ok("deleted")
    }
}