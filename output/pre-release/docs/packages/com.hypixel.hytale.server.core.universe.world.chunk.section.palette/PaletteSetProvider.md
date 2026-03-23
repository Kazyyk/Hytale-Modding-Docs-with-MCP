---
title: "PaletteSetProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.palette.PaletteSetProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "chunk"
  - "palette"
  - "thread-local"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.palette`

```java
public class PaletteSetProvider
```

Thread-local provider of reusable `ByteSet` and `ShortSet` instances for palette lookup operations, avoiding allocation per query.