---
title: "EntityStatType.Regenerating.RegenType"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.EntityStatType.Regenerating.RegenType"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "regeneration"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public static enum EntityStatType.Regenerating.RegenType
```

Determines how the regeneration amount is interpreted.

## Enum Constants

| Constant | Description |
|---|---|
| `ADDITIVE` | The amount is added directly to the stat value. |
| `PERCENTAGE` | The amount is multiplied by `(max - min)` to get the actual value to add. |
