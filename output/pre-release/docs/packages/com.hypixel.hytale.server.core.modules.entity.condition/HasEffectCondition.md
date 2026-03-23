---
title: "HasEffectCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.HasEffectCondition"
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
public class HasEffectCondition extends Condition
```

Returns true when the entity has an active effect matching the configured `EffectId`. Lazily resolves the effect ID string to an `EntityEffect` asset.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<HasEffectCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
