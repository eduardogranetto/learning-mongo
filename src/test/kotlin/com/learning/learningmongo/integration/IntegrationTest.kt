package com.learning.learningmongo.integration

import com.learning.learningmongo.integration.container.MongoDbContainer
import org.springframework.boot.test.context.SpringBootTest
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Testcontainers
class IntegrationTest {

	companion object{
		@Container
		val mongo = MongoDbContainer()
	}
	
}