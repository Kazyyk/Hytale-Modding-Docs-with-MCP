---
title: "ScalerPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.ScalerPositionProvider"
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
public class ScalerPositionProvider extends PositionProvider
```

Wraps another position provider, scaling its output positions by a 3D scale vector. The child provider operates in inverse-scaled bounds so that emitted positions map back to the original coordinate space after scaling.
