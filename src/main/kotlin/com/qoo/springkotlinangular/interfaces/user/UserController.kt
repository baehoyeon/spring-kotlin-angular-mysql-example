package com.qoo.springkotlinangular.interfaces.user

import com.qoo.springkotlinangular.domain.user.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(value = ["/users"])
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/{userId}")
    fun findOne(@PathVariable("userId") userId: Long): UserDto {
        return from(userService.findById(userId))
    }

    @GetMapping
    fun findAll(): List<UserDto> {
        return fromList(userService.findAll())
    }

    @PostMapping
    fun create(@RequestBody form: UserForm): UserDto {
        return from(userService.create(form))
    }

    @PutMapping("/{userId}")
    fun update(@PathVariable("userId") userId: Long, @RequestBody form: UserForm) {
        return userService.update(userId, form)
    }

    @DeleteMapping("/{userId}")
    fun delete(@PathVariable("userId") userId: Long) {
        return userService.delete(userId)
    }
}