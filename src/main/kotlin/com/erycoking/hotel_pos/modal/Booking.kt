package com.erycoking.hotel_pos.modal

import org.springframework.hateoas.ResourceSupport
import javax.persistence.*


@Entity
data class Booking(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val orderId: Int,
        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "roomNo", nullable = false)
        val room: Room,
        @Column(length = 4, nullable = false)
        val quantity: Int
): ResourceSupport()