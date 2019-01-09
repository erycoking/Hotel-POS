package com.erycoking.hotel_pos.modal

import org.springframework.hateoas.ResourceSupport
import java.util.*
import javax.persistence.*

@Entity
data class Transaction(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val transactionId: Int,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(nullable = false)
        val customer: Customer,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(nullable = false)
        val purchase: Purchase,
        @Column(length = 15, nullable = false)
        val bill: Double,
        @Column(length = 20, nullable = false)
        val date: Int
): ResourceSupport()