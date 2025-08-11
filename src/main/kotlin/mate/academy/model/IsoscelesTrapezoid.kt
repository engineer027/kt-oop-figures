package mate.academy.model

class IsoscelesTrapezoid(
    color: Color = Color.WHITE,
    private val topBase: Int,
    private val bottomBase: Int,
    private val height: Int
) : Figure(color) {

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area:${calculateArea()}. units, "
                    + "top base: $topBase units, "
                    + "bottom base: $bottomBase units, "
                    + "height: $height units, "
                    + "color: $color"
        )
    }

    override fun calculateArea(): Int {
        return (topBase + bottomBase) * height / 2;
    }
}
