package ss5.baitap1

class Circle {
    // Phương thức private: getRadius
    // Thuộc tính private
    private var radius = 1.0
    private val color = "red"

    // Hàm tạo không tham số
    constructor()

    // Hàm tạo có tham số radius
    constructor(radius: Double) {
        this.radius = radius
    }

    private val area: Double
        // Phương thức private: getArea
        get() = Math.PI * radius * radius

    // Phương thức public mới để in thông tin
    fun printDetails() {
        println("Radius: " + radius)
        println("Area: " + area)
    }
}
