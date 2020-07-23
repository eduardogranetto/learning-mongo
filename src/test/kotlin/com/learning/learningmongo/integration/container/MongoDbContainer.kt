package com.learning.learningmongo.integration.container

import org.testcontainers.containers.BindMode.READ_ONLY
import org.testcontainers.containers.GenericContainer

class MongoDbContainer : GenericContainer<MongoDbContainer>("mongo"){
	
	init {
		withExposedPorts(27017)
		withEnv(mapOf(
				"MONGO_INITDB_ROOT_USERNAME" to "root",
				"MONGO_INITDB_ROOT_PASSWORD" to "example",
				"MONGO_INITDB_DATABASE" to "learning-mongo"
			)
		)
		withClasspathResourceMapping("init-mongo", "/docker-entrypoint-initdb.d", READ_ONLY)
		portBindings.add("27017:27017")
	}
	
	
}