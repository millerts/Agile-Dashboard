package agile.dashboard

import grails.test.*

class IterationTests extends GrailsUnitTestCase {
	protected void setUp() {
		super.setUp()
		mockDomain Iteration
		mockForConstraintsTests Iteration
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testConstraints() {
		def i = new Iteration()
		assertFalse i.validate()
		assertEquals 'nullable', i.errors['name']
		i.name = ""
		assertFalse i.validate()
		assertEquals 'blank', i.errors['name']
	}
}
