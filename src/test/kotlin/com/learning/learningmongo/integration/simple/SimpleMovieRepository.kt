package com.learning.learningmongo.integration.simple

import com.learning.learningmongo.model.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface SimpleMovieRepository : CrudRepository<Movie, UUID>