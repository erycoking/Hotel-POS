package com.erycoking.hotel_pos.error_handler

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class RoomErrorHandler{
    @ResponseBody
    @ExceptionHandler(RoomNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun roomNotFoundHandler(ex: RoomNotFoundException) = ex.message
}