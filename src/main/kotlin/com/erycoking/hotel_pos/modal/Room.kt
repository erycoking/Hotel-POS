package com.erycoking.hotel_pos.modal

import org.springframework.hateoas.ResourceSupport
import javax.persistence.*

@Entity
data class Room(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(length = 10, nullable = false)
        val roomNo: Int,
        @Enumerated(value = EnumType.STRING)
        @Column(name = "category", nullable = false, columnDefinition = "enum('A','B','C','D')")
        val category: Category,
        @Column(length = 10, nullable = false)
        val name: String,
        @Column(length = 100, nullable = false)
        val image: String,
        @Column(length = 10, nullable = false)
        val price: Double
): ResourceSupport()