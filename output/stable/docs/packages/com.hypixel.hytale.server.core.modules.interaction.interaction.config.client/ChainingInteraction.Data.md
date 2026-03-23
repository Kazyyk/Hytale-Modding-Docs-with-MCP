---
title: "ChainingInteraction.Data"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ChainingInteraction.Data"
api_surface: true
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public static class ChainingInteraction.Data implements Component<EntityStore>
```

Per-entity `EntityStore` component that tracks chaining state. Maintains an `Object2IntMap<String>` for anonymous chain indices and a separate `namedMap` for named chain IDs (`ChainId`). Tracks the timestamp of the last attack for chaining allowance calculations via `getTimeSinceLastAttackInSeconds()`.
