package com.erycoking.hotel_pos.modal

import org.springframework.hateoas.ResourceSupport
import javax.persistence.*

@Entity
data class Purchase(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val purchaseId: Int,
        @OneToMany(fetch = FetchType.EAGER)
        @JoinColumn(nullable = false)
        val bookings: List<Booking>
): ResourceSupport()