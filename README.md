# graalvm-kt

Demo application presenting basics of building a native GraalVM image of a Spring Boot 3 application written in Kotlin.

# Prerequisites

1. JDK
2. GraalVM + native-image

# Native image - AOT
```shell
./gradlew nativeCompile
./build/native/nativeCompile/graalvm-kt
```

Stdout: "Started GraalvmKtApplicationKt in 0.04 seconds"

# JVM - JIT
```shell
./gradlew bootRun
```

Stdout: "Started GraalvmKtApplicationKt in 1.061 seconds"

# Machine specs
Processor: AMD® Ryzen 7 5800u
OS: Ubuntu 22.04.3
OS Type: 64-bit
