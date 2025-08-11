package mate.academy.model

class RightTriangle(
    color: Color = Color.WHITE,
    private val firstLeg: Int,
    private val secondLeg: Int
) : Figure(color) {

    override fun draw() {
        println(
            "Figure: right triangle, area:${calculateArea()}. units, "
                    + "firstLeg: $firstLeg units, "
                    + "secondLeg: $secondLeg units, "
                    + "color: $color"
        )
    }

    override fun calculateArea(): Int {
        return firstLeg * secondLeg / 2
    }
}
