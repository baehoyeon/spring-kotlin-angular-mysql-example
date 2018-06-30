package com.qoo.springkotlinangular.domain.user

data class UserDto(var userId: Long, var name: String, var phoneNumber: String, var email: String)

fun from(user: User): UserDto = UserDto(user.id!!, user.name, user.phoneNumber, user.email)
fun fromList(userList: List<User>): List<UserDto> = userList.map { UserDto(it.id!!, it.name, it.phoneNumber, it.email) }