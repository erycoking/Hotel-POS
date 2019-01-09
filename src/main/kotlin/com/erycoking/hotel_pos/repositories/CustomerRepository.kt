package com.erycoking.hotel_pos.repositories

import com.erycoking.hotel_pos.modal.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, String>{

}