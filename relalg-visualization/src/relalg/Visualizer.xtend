package relalg

class Visualizer {

	val extension static Serializer s = new Serializer
	val extension static RelalgFactory factory = RelalgFactory.eINSTANCE
	
	def visualize() {
		val r = createInputRelation => [type = "r"]
		val s = createInputRelation => [type = "s"]
		val t = createInputRelation => [type = "t"]
		val join1 = createJoinOperation => [name = "Join1"; leftParent = r; rightParent = s]
		val join2 = createJoinOperation => [name = "Join1"; leftParent = join1; rightParent = t]
		
		val expression = join2
		print(expression.convertToLateX)
	}
}