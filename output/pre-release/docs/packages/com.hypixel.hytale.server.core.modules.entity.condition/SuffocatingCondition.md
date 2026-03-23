---
title: "SuffocatingCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.SuffocatingCondition"
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
public class SuffocatingCondition extends Condition
```

Returns true when the entity's head position (eye height) is inside a non-breathable block material or fluid. Uses `LivingEntity.canBreathe()`.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SuffocatingCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
