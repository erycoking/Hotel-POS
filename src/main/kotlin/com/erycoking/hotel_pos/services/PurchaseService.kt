package com.erycoking.hotel_pos.services

import com.erycoking.hotel_pos.modal.Purchase
import com.erycoking.hotel_pos.repositories.PurchaseRepository
import org.springframework.stereotype.Service

@Service
class PurchaseService(val purchaseRepository: PurchaseRepository){
    fun allPurchase() = purchaseRepository.findAll()
    fun findPurchase(purchaseId: Int) = purchaseRepository.findById(purchaseId)
    fun savePurchase(purchase: Purchase) = purchaseRepository.save(purchase)
    fun deletePurchase(purchase: Purchase) = purchaseRepository.delete(purchase)
    fun deletePurchase(purchaseId: Int) = purchaseRepository.deleteById(purchaseId)
}