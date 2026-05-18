rootProject.name = "KeepEditorTooltipsWhileDebugging"

pluginManagement {
	plugins {
		kotlin("jvm") version "2.2.0" // https://plugins.jetbrains.com/docs/intellij/using-kotlin.html#bundled-stdlib-versions
		id("org.jetbrains.intellij.platform") version "2.11.0" // https://github.com/JetBrains/intellij-platform-gradle-plugin/releases
	}
}
