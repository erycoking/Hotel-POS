package com.erycoking.hotel_pos.modal

import org.springframework.hateoas.ResourceSupport
import javax.persistence.*

@Entity
data class Staff(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(length = 10, nullable = false)
        val staffNo: Int,
        @Embedded
        val name: Name,
        @Column(length = 20, nullable = false)
        val category: String,
        @Column(length = 11, nullable = false, unique = true)
        val idNo: Int,
        @Column(length = 100, nullable = false, unique = true)
        val email: String,
        @Column(length = 13, nullable = false, unique = true)
        val phoneNo: Int,
        @Column(length = 100, nullable = false)
        val address: String
): ResourceSupport()