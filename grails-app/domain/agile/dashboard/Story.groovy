package agile.dashboard

class Story {
		Backlog backlog
		Iteration iteration
		StoryState storyState
		User user
		String trackingId
		String story
		String positiveCriteria
		String negativeCriteria
		Boolean isCandidateAutomation
		Boolean isDemo
		Integer baPoints
		Integer devPoints
		Integer manualTestingPoints
		Integer automatedTestingPoints
		
    static constraints = {
			negativeCriteria(nullable:true)
    }
}
