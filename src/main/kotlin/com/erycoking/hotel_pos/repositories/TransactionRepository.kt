package com.erycoking.hotel_pos.repositories

import com.erycoking.hotel_pos.modal.Customer
import com.erycoking.hotel_pos.modal.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.domain.Pageable

@Repository
interface TransactionRepository:JpaRepository<Transaction, Int>{
    fun findAllByDate(date: Int, pageable: Pageable): List<Transaction>
    fun findAllByCustomer(customer: Customer, pageable: Pageable): List<Transaction>
}