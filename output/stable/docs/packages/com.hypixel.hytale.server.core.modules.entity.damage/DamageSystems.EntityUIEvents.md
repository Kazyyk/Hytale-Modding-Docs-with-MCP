---
title: "DamageSystems.EntityUIEvents"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.EntityUIEvents"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.EntityUIEvents extends DamageEventSystem
```

Sends combat text UI updates to the attacking player when damage is dealt. Part of the inspect damage group. If the damage amount is positive and the source is an `EntitySource` with a valid player reference, queues a `CombatTextUpdate` on the source player's entity viewer, displaying the damage amount and optional hit angle.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage](Damage.md) -- reads `HIT_ANGLE` meta key
- [DamageEventSystem](DamageEventSystem.md) -- base class
