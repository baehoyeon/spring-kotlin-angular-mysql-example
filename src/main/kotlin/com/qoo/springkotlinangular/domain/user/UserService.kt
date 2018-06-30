package com.qoo.springkotlinangular.domain.user

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
@Transactional(readOnly = true)
class UserService(val userRepository: UserRepository) {

    fun findAll(): List<User> = userRepository.findAll()

    fun findById(id: Long): User = userRepository.findOne(id)

    @Transactional(readOnly = false)
    fun update(id: Long, form: UserForm) {
        val user = findById(id)

        user.name = form.email
        user.phoneNumber = form.phoneNumber
        user.email = form.email
    }

    @Transactional(readOnly = false)
    fun create(form: UserForm):User = userRepository.save(User(form.name, form.phoneNumber, form.email))

    @Transactional(readOnly = false)
    fun delete(id: Long) {
        val user = findById(id)
        userRepository.delete(user)
    }

}