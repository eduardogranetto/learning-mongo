package com.learning.learningmongo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Movie(
	@Id
	val id: UUID = UUID.randomUUID(),
	val name: String
){
	companion object
}