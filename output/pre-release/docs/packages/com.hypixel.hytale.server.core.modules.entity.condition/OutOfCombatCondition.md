---
title: "OutOfCombatCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.OutOfCombatCondition"
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
public class OutOfCombatCondition extends Condition
```

Returns true when the entity has been out of combat for the configured delay (or the world's default combat delay if not specified). Checks `DamageDataComponent.getLastCombatAction()`.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<OutOfCombatCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
