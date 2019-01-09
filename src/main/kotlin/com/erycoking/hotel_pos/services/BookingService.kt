package com.erycoking.hotel_pos.services

import com.erycoking.hotel_pos.modal.Booking
import com.erycoking.hotel_pos.repositories.BookingRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class BookingService(val bookingRepository: BookingRepository){
    fun allOrder() = bookingRepository.findAll(Sort.by("orderId").ascending())
    fun findOrder(orderId: Int) = bookingRepository.findById(orderId)
    fun saveOrder(booking: Booking) = bookingRepository.save(booking)
    fun deleteOrder(booking: Booking) = bookingRepository.delete(booking)
    fun deleteOrder(orderId: Int) = bookingRepository.deleteById(orderId)
}