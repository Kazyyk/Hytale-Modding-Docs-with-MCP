---
title: "ExplosionUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.ExplosionUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class ExplosionUtils
```

Static utility for performing explosions in the world. The `performExplosion()` method applies block damage in a sphere (using `BlockSphereUtil`), applies entity damage with distance falloff via `DamageSystems`, and applies knockback to affected entities. Handles block gathering/drops based on config and tool type.
