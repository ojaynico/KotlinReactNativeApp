import ojaynico.kotlin.react.native.StyleSheet

val styles = StyleSheet.create(object {
    val scrollView = object {
        val backgroundColor = "#F3F3F3"
    }
    val engine = object {
        val position = "absolute"
        val right = 10
    }
    val body = object {
        val backgroundColor = "#FFF"
    }
    val sectionContainer = object {
        val marginTop = 32
        val paddingHorizontal = 24
    }
    val sectionTitle = object {
        val fontSize = 24
        val fontWeight = "600"
        val color = "#000"
    }
    val sectionDescription = object {
        val marginTop = 8
        val fontSize = 18
        val fontWeight = "400"
        val color = "#444"
    }
    val highlight = object {
        val fontWeight = "700"
    }
    val footer = object {
        val color  = "#000"
        val fontSize = 12
        val fontWeight = "600"
        val padding = 4
        val paddingRight = 12
        val textAlign = "right"
    }
    val background = object {
        val paddingBottom = 40
        val paddingTop = 96
        val paddingHorizontal = 32
        val backgroundColor = "#F3F3F3"
    }
    val logo = object {
        val opacity = 0.2
        val overflow = "visible"
        val resizeMode = "cover"
        val marginLeft = -128
        val marginBottom = -192
    }
    val text = object {
        val fontSize = 40
        val fontWeight = "600"
        val textAlign = "center"
        val color = "#000"
    }
    val container = object {
        val marginTop = 32
        val paddingHorizontal = 24
    }
    val linkContainer = object {
        val flexWrap = "wrap"
        val flexDirection = "row"
        val justifyContent = "space-between"
        val alignItems = "center"
        val paddingVertical = 8
    }
    val link = object {
        val flex = 2
        val fontSize = 18
        val fontWeight = "400"
        val color = "#1292B4"
    }
    val description = object {
        val flex = 3
        val paddingVertical = 16
        val fontWeight = "400"
        val fontSize = 18
        val color = "#444"
    }
    val separator = object {
        val backgroundColor = "#DAE1E7"
        val height = 1
    }
})
