package br.com.votee.voteemanager.repository

import br.com.votee.voteemanager.domain.Greet
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GreetRepository : MongoRepository<Greet, String>