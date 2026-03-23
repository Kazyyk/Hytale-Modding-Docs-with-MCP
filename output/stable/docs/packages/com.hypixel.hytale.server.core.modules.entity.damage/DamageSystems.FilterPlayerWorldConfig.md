---
title: "DamageSystems.FilterPlayerWorldConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.FilterPlayerWorldConfig"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "filter"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.FilterPlayerWorldConfig extends DamageEventSystem
```

Cancels all incoming damage to player entities when player incoming damage is disabled in the world's combat config. Part of the filter damage group. Also removes any knockback component from the entity when damage is cancelled.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageSystems.FilterNPCWorldConfig](DamageSystems.FilterNPCWorldConfig.md) -- equivalent system for NPCs
- [DamageEventSystem](DamageEventSystem.md) -- base class
