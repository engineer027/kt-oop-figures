package mate.academy.model

class Square(color: Color = Color.WHITE, private val leg: Int) : Figure(color) {

    override fun draw() {
        println("Figure: right triangle, area:${calculateArea()}. units, "
                + "firstLeg: $leg units, "
                + "secondLeg: $leg units, "
                + "color: $color")
    }

    override fun calculateArea(): Int {
       return leg * leg
    }
}
