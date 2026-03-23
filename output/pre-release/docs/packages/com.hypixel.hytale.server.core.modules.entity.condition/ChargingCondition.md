---
title: "ChargingCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.ChargingCondition"
api_surface: false
extends: "Condition"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:03Z"
tags:
  - "condition"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.condition`

```java
public class ChargingCondition extends Condition
```

Returns true when the entity is currently in a `ChargingInteraction` or has charged within a configurable delay duration. Checks both the interaction manager's active interactions and the `DamageDataComponent.getLastChargeTime()`.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ChargingCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
