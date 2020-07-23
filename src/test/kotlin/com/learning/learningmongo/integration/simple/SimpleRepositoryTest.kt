package com.learning.learningmongo.integration.simple

import com.learning.learningmongo.integration.IntegrationTest
import com.learning.learningmongo.integration.fixtures.fixture
import com.learning.learningmongo.model.Movie
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull

class SimpleRepositoryTest : IntegrationTest(){
	
	@Autowired
	private lateinit var simpleMovieRepository: SimpleMovieRepository
	
	@BeforeEach
	fun beforeEach(){
		simpleMovieRepository.deleteAll()
	}
	
	@Test
	fun `Should create a movie with success`(){
	
			with(insertMovie()){
				assertThat(simpleMovieRepository.findByIdOrNull(id)).isEqualToComparingFieldByField(this)
			}
	
	}
	
	@Test
	fun `Should update a movie with success`(){
		val createdMovie = insertMovie()
		val updatedMovie = Movie.fixture(id = createdMovie.id, name = "The Godfather II")
		with(simpleMovieRepository.save(updatedMovie)){
			assertThat(simpleMovieRepository.findByIdOrNull(createdMovie.id)).isEqualToComparingFieldByField(this)
		}
	}
	
	private fun insertMovie() = simpleMovieRepository.save(Movie.fixture())
	
}