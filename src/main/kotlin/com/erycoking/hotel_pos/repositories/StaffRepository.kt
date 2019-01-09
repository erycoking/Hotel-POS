package com.erycoking.hotel_pos.repositories

import com.erycoking.hotel_pos.modal.Staff
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StaffRepository:JpaRepository<Staff, Int>{
    fun findByIdNo(idNo: Int): Staff
    fun findByEmail(email: String): Staff
    fun findAllByCategory(category: String, pageable: Pageable): List<Staff>
}