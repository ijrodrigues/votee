package br.com.votee.voteemanager.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class Greet(
    @Id val id: String = UUID.randomUUID().toString(),
    val message: String
)