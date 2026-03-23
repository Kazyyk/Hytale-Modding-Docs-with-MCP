---
title: "DamageSystems.RecordLastCombat"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.RecordLastCombat"
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
public static class DamageSystems.RecordLastCombat extends DamageEventSystem
```

Records the timestamp of the last combat action on both the damaged entity and the attacker (if applicable). Part of the inspect damage group. Sets `DamageDataComponent.lastCombatAction` on the target, and also on the source entity if the source is an `EntitySource` with a valid reference that has a `DamageDataComponent`.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage.EntitySource](Damage.EntitySource.md) -- checked for bidirectional combat tracking
- [DamageEventSystem](DamageEventSystem.md) -- base class
