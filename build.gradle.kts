plugins {
    id("java")
    id("xyz.wagyourtail.unimined") version "1.3.11"
}

group = "dev.tomwmth"
version = "1.0-SNAPSHOT"

val main: SourceSet by sourceSets.getting
val fabric: SourceSet by sourceSets.creating
val forge: SourceSet by sourceSets.creating

unimined.minecraft {
    version("1.18.2")
    side("client")

    mappings {
        intermediary()
        mojmap()
    }

    defaultRemapJar = false
}

unimined.minecraft(fabric) {
    combineWith(main)

    fabric {
        loader("0.16.9")
    }

    defaultRemapJar = true
}

unimined.minecraft(forge) {
    combineWith(main)

    minecraftForge {
        loader("40.2.26")
    }

    defaultRemapJar = true
}
