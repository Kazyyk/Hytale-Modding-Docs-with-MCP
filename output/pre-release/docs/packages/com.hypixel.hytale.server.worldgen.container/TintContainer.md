---
title: "TintContainer"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.container"
fqcn: "com.hypixel.hytale.server.worldgen.container.TintContainer"
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
public class TintContainer
```

Maps world coordinates to tint color values during generation. Contains a default entry and a list of conditional entries. Evaluates entries in order; the first matching entry's noise-driven weighted map determines the tint color.
