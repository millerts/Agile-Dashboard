package agile.dashboard

class Backlog {
	String backlogId
	String section
	
    static constraints = {
		backlogId(blank:false, unique:true)
		section(nullable:true)
    }
}
