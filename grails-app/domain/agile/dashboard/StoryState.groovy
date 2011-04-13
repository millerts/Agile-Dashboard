package agile.dashboard

class StoryState {
	String description
	
    static constraints = {
		description(blank:false)
    }
}
