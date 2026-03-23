---
title: "NoDamageTakenCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.NoDamageTakenCondition"
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
public class NoDamageTakenCondition extends Condition
```

Returns true when the entity has not taken damage within the configured delay duration. Checks `DamageDataComponent.getLastDamageTime()`.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<NoDamageTakenCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
