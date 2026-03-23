---
title: "Jitter2dPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.Jitter2dPositionProvider"
api_surface: false
extends: "PositionProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "position-provider"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.positionproviders`

```java
public class Jitter2dPositionProvider extends PositionProvider
```

Wraps another position provider, applying random 2D (XZ-plane) jitter to each emitted position using a seeded RNG field. Positions that fall outside the context bounds after jitter are discarded.
