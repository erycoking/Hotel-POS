package com.erycoking.hotel_pos.services

import com.erycoking.hotel_pos.modal.Customer
import com.erycoking.hotel_pos.repositories.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(val customerRepository: CustomerRepository){
    fun allCustomers() = customerRepository.findAll()
    fun saveCustomer(customer: Customer) = customerRepository.save(customer)
    fun findCustomer(email: String) = customerRepository.findById(email)
    fun deleteCustomer(email: String) = customerRepository.deleteById(email)
    fun deleteCustomer(customer: Customer) = customerRepository.delete(customer)
}