package com.qoo.springkotlinangular.domain.user

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") val id: Long? = null,
                @Column(name = "name", nullable = false) var name: String,
                @Column(name = "phoneNumber", nullable = false) var phoneNumber: String,
                @Column(name = "email", nullable = false) var email: String){
    constructor(name: String, phoneNumber: String, email: String): this(null, name, phoneNumber, email)
}

