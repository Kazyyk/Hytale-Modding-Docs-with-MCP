---
title: "DeathSystems.RunDeathInteractions"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.RunDeathInteractions"
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
public static class DeathSystems.RunDeathInteractions extends DeathSystems.OnDeathSystem
```

Initiates the entity's death interaction chain when it dies. Runs after [DeathSystems.ClearEntityEffects](DeathSystems.ClearEntityEffects.md). Looks up the death interaction ID from the entity's `Interactions` component (or falls back to the "Empty" unarmed interactions), creates a `RootInteraction`, and queues the interaction chain for execution. The chain is stored on the `DeathComponent` for tracking by [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md).

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md) -- waits for interaction chain to finish
- [DeathComponent](DeathComponent.md) -- stores the interaction chain
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
