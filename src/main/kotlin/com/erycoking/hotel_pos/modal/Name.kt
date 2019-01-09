package com.erycoking.hotel_pos.modal

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class Name(
        @Column(length = 20, nullable = false)
        val firstName: String,
        @Column(length = 20)
        val middleName: String,
        @Column(length = 20, nullable = false)
        val lastName: String
)