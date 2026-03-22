---
title: "RegeneratingModifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.modifier.RegeneratingModifier"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "regeneration"
  - "modifiers"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset.modifier`

```java
public class RegeneratingModifier
```

A conditional multiplier applied to a regeneration amount. If all conditions are met, the regeneration tick is multiplied by `amount`; otherwise the multiplier is `1.0` (no effect).

## Fields

| Field | Type | JSON Key | Description |
|---|---|---|---|
| `conditions` | `Condition[]` | `Conditions` | Conditions that must be met for the modifier to activate. |
| `amount` | `float` | `Amount` | Multiplier to apply to regeneration when conditions are met. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getModifier(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant)` | `float` | Returns `amount` if conditions are met, otherwise `1.0f`. |
