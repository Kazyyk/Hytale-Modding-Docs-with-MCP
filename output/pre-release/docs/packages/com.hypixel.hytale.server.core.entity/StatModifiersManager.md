---
title: "StatModifiersManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.StatModifiersManager"
api_surface: true
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
public class StatModifiersManager
```

Manages equipment-based stat modifiers for a `LivingEntity`. Tracks which stats need recalculation via an `AtomicBoolean` flag and maintains a set of stats to clear. Processes armor inventory changes to apply/remove `StaticModifier` instances from the entity's `EntityStatMap`, and handles entity effect modifiers from equipped items.
