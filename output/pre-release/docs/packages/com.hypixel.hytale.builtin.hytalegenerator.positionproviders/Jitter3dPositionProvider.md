---
title: "Jitter3dPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.Jitter3dPositionProvider"
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
public class Jitter3dPositionProvider extends PositionProvider
```

Wraps another position provider, applying random 3D jitter to each emitted position using a seeded RNG field. Uses spherical rotation for uniform 3D distribution. Positions outside bounds after jitter are discarded.
