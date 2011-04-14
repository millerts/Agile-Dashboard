package agile.dashboard

import grails.test.*

class BacklogTests extends GrailsUnitTestCase {
	protected void setUp() {
		super.setUp()
		def results = [
			new Backlog(backlogId:"1.1.2", section:"Assessor"),
			new Backlog(backlogId:"1.1.3", section:"Assessor")
		]

		mockDomain Backlog,results
		mockForConstraintsTests Backlog,results
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testBlank() {
		def b = new Backlog()
		assertFalse b.validate()
		assertEquals 'nullable', b.errors['backlogId']
		b.backlogId = ""
		assertFalse b.validate()
		assertEquals 'blank', b.errors['backlogId']
	}

	void testUnique(){
		def b = new Backlog(backlogId:"1.1.2", section:"hello")
		assertFalse b.validate()
		assertEquals 'unique', b.errors['backlogId']
	}
}
