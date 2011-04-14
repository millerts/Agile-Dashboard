package agile.dashboard

class Iteration {
	String name
	String description
	static constraints = {
		name(blank:false, unique:true)
		description(nullable:true)
	}
}
