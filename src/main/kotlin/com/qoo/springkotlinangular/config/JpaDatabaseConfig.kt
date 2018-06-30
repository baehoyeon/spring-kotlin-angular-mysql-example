package com.qoo.springkotlinangular.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@Configuration
@EnableJpaRepositories(basePackages = ["com.qoo.springkotlinangular.domain"])
class JpaDatabaseConfig {

}