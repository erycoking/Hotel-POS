package com.erycoking.hotel_pos.services

import com.erycoking.hotel_pos.modal.Staff
import com.erycoking.hotel_pos.repositories.StaffRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class StaffService(val staffRepository: StaffRepository){

    private val size = 50

    fun allStaff() = staffRepository.findAll(Sort.by("name").ascending())
    fun findStaff(staffNo: Int) = staffRepository.findById(staffNo)
    fun findByIdNo(idNo: Int)  = staffRepository.findByIdNo(idNo)
    fun findByEmail(email: String) = staffRepository.findByEmail(email)
    fun findAllByCategory(category: String, page: Int) = staffRepository.findAllByCategory(category, PageRequest.of(page, size, Sort.by("firstName").ascending()))
    fun saveStaff(staff: Staff) = staffRepository.save(staff)
    fun deleteStaff(staffNo: Int) = staffRepository.deleteById(staffNo)
    fun deleteStaff(staff: Staff) = staffRepository.delete(staff)
}