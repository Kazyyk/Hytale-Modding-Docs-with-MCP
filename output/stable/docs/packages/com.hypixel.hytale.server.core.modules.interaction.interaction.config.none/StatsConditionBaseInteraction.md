---
title: "StatsConditionBaseInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.StatsConditionBaseInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none`

```java
public abstract class StatsConditionBaseInteraction extends SimpleInstantInteraction
```

Abstract base for stat-condition interactions. Defines codec fields for stat costs, less-than comparison, lenient overdraw, and value type (absolute vs percent). Subclasses implement `canAfford`.
