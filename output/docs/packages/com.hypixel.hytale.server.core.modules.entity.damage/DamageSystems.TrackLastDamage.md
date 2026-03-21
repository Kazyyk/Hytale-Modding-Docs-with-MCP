---
title: "DamageSystems.TrackLastDamage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.TrackLastDamage"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "tracking"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.TrackLastDamage extends DamageEventSystem
```

Records the timestamp of the last damage received on the target entity's `DamageDataComponent`. Part of the inspect damage group. Only applies to living entities that have a `DamageDataComponent`.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageSystems.RecordLastCombat](DamageSystems.RecordLastCombat.md) -- similar system for bidirectional combat tracking
- [DamageEventSystem](DamageEventSystem.md) -- base class
