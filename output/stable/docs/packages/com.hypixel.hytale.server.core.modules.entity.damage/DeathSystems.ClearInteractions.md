---
title: "DeathSystems.ClearInteractions"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.ClearInteractions"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.ClearInteractions extends DeathSystems.OnDeathSystem
```

Clears the entity's `InteractionManager` on death, cancelling any active interaction chains. Runs as a root dependency (first). Requires the entity to have an `InteractionManager` component.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
