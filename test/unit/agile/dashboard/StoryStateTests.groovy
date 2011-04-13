package agile.dashboard

import grails.test.*

class StoryStateTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
		def states = [
			new StoryState(id:1, description:"test1"),
			new StoryState(id:2, description:"test2")
		]
		
		mockDomain StoryState
		mockForConstraintsTests StoryState, states
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testConstraints() {
		def state = new StoryState(description:"")
		assertFalse state.validate()
		assertEquals 'blank', state.errors['description']
    }
}
