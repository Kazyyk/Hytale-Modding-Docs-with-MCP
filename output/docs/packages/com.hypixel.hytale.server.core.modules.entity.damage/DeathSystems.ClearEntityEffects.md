---
title: "DeathSystems.ClearEntityEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.ClearEntityEffects"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "effects"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.ClearEntityEffects extends DeathSystems.OnDeathSystem
```

Removes all active entity effects from the dying entity via `EffectControllerComponent.clearEffects()`. Requires the entity to have an `EffectControllerComponent`.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
