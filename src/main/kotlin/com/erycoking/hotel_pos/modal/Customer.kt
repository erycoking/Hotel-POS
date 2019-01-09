package com.erycoking.hotel_pos.modal

import org.springframework.hateoas.ResourceSupport
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Customer(
        @Embedded
        val name: Name,
        @Id
        @Column(length = 100, nullable = false)
        val email: String,
        @Column(length = 15)
        val phoneNo: Int,
        @Column(length = 5, nullable = false)
        val numberOfPurchase: Int = 1
): ResourceSupport()