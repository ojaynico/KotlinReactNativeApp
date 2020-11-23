import ojaynico.kotlin.react.*
import ojaynico.kotlin.react.native.AppRegistry
import react.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
            statusBar {
                barStyle = "dark-content"
            }
            safeAreaView {
                scrollView {
                    attrs.contentInsetAdjustmentBehavior = "automatic"
                    attrs.asDynamic().style = styles.scrollView
                    child(Header)
                    view {
                        attrs.style = styles.body
                        view {
                            attrs.style = styles.sectionContainer
                            text("Step One") {
                                style = styles.sectionTitle
                            }
                            text("Edit App.kt to change this screen, run gradle assemble in shared folder and then come back to see your edits.") {
                                style = styles.sectionDescription
                            }
                        }
                        view {
                            attrs.style = styles.sectionContainer
                            text("See Your Changes") {
                                style = styles.sectionTitle
                            }
                            text("Double tap R on your keyboard to reload your app's code.") {
                                style = styles.sectionDescription
                            }
                        }
                        view {
                            attrs.style = styles.sectionContainer
                            text("Debug") {
                                style = styles.sectionTitle
                            }
                            text("Press Cmd or Ctrl + M or Shake your device to open the React Native debug menu.") {
                                style = styles.sectionDescription
                            }
                        }
                        view {
                            attrs.style = styles.sectionContainer
                            text("Learn More") {
                                style = styles.sectionTitle
                            }
                            text("Read the docs to discover what to do next:") {
                                style = styles.sectionDescription
                            }
                        }
                        view {
                            attrs.style = styles.container
                            links.forEach { link ->
                                view {
                                    attrs.style = styles.separator
                                }
                                touchableOpacity {
                                    attrs.style = styles.linkContainer
                                    text(link.title) {
                                        style = styles.link
                                    }
                                    text(link.description) {
                                        style = styles.description
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }

}

val Header = functionalComponent<RProps> {
    imageBackground {
        attrs.source = kotlinext.js.require("./resources/logo.png")
        attrs.style = styles.background
        attrs.imageStyle = styles.logo

        text("Welcome to React and Kotlin") {
            style = styles.text
        }
    }

}

fun main() {
    AppRegistry.registerComponent("KotlinReactNativeApp") { App::class.js }
}
