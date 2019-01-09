package com.erycoking.hotel_pos.components

import com.erycoking.hotel_pos.controller.RoomController
import com.erycoking.hotel_pos.modal.Room
import org.springframework.hateoas.Resource
import org.springframework.hateoas.ResourceAssembler
import org.springframework.hateoas.mvc.ControllerLinkBuilder
import org.springframework.stereotype.Service

@Service
class RoomResourceAssembler: ResourceAssembler<Room, Resource<Room>> {
    override fun toResource(entity: Room?): Resource<Room> {
        return Resource(entity!!,
                ControllerLinkBuilder.linkTo(ControllerLinkBuilder
                        .methodOn(RoomController::class.java)
                        .getRoomById(entity.roomNo))
                        .withSelfRel(),
                ControllerLinkBuilder.linkTo(ControllerLinkBuilder
                        .methodOn(RoomController::class.java)
                        .getAllRooms()).withRel("all"))
    }

}