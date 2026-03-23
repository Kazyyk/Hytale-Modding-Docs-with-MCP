---
title: "AnimationUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.AnimationUtils"
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
public class AnimationUtils
```

Utility class for playing animations on entities. Provides static `playAnimation()` methods that look up the entity's `ModelComponent`, resolve animation indices from the model's animation set (optionally via `ItemPlayerAnimations`), and broadcast `PlayAnimation` packets to nearby players.
