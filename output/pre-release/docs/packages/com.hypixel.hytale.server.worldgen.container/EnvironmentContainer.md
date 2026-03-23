---
title: "EnvironmentContainer"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.container"
fqcn: "com.hypixel.hytale.server.worldgen.container.EnvironmentContainer"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "container"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.container`

```java
public class EnvironmentContainer
```

Maps world coordinates to environment IDs during generation. Contains a default entry and an array of conditional entries. Evaluates entries in order; the first matching entry's noise-driven weighted map determines the environment ID.
