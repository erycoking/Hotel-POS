package com.erycoking.hotel_pos.services

import com.erycoking.hotel_pos.modal.Customer
import com.erycoking.hotel_pos.modal.Transaction
import com.erycoking.hotel_pos.repositories.TransactionRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class TransactionService(val transactionRepository: TransactionRepository){

    private val size = 50

    fun allTransaction() = transactionRepository.findAll(Sort.by("date").ascending())
    fun findTransaction(transactionId: Int) = transactionRepository.findById(transactionId)
    fun findTransactionByDate(date: Int, page: Int) = transactionRepository.findAllByDate(date, PageRequest.of(page, size, Sort.by("date").ascending()))
    fun findTransactionByCustomer(customer: Customer, page: Int) = transactionRepository.findAllByCustomer(customer, PageRequest.of(page, size, Sort.by("date").ascending()))
    fun saveTransaction(transaction: Transaction) = transactionRepository.save(transaction)
    fun deleteTransation(transaction: Transaction) = transactionRepository.delete(transaction)
    fun deleteTransaction(transactionId: Int) = transactionRepository.deleteById(transactionId)
}