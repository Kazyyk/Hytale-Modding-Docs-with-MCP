---
title: "InteractionManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.InteractionManager"
api_surface: true
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class InteractionManager implements Component<EntityStore>
```

Per-entity `EntityStore` component that manages all active interaction chains and cooldowns. Maintains a map of active `InteractionChain` instances keyed by chain ID, a `CooldownHandler`, and references to the owning `LivingEntity` and `PlayerRef`. Provides the primary `tick()` method for advancing all chains, methods for starting/cancelling chains, and static utilities for walking interaction trees (`walkInteraction()`). Defines `MAX_REACH_DISTANCE = 8.0` and `DEFAULT_CHARGE_TIMES`.
