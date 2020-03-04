rootProject.name = "backend"

include("platform")
include("core")
include("email")
include("security")
include("app")

// set the child project to match the module name
rootProject.children.forEach { project ->
    project.buildFileName = "${project.name}.gradle.kts"
}
