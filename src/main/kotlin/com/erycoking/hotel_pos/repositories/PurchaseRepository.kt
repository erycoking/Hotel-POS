package com.erycoking.hotel_pos.repositories

import com.erycoking.hotel_pos.modal.Purchase
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PurchaseRepository: JpaRepository<Purchase, Int>{}