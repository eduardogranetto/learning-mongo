package com.learning.learningmongo.integration.fixtures

import com.learning.learningmongo.model.Movie
import java.util.*

fun Movie.Companion.fixture(
	id: UUID = UUID.randomUUID(),
	name: String = "The Godfather"
)  = Movie(id, name)