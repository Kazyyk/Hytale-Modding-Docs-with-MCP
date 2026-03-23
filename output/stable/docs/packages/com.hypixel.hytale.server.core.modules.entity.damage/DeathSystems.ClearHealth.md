---
title: "DeathSystems.ClearHealth"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.ClearHealth"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "health"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.ClearHealth extends DeathSystems.OnDeathSystem
```

Sets the entity's health stat to 0 on death. Runs as the first death system (root dependency). Requires the entity to have an `EntityStatMap` component.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
