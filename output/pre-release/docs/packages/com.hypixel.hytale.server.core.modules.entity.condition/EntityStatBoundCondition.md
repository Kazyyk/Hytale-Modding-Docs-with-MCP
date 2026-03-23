---
title: "EntityStatBoundCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.EntityStatBoundCondition"
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
public abstract class EntityStatBoundCondition extends Condition
```

Abstract base for conditions that evaluate against a named entity stat. Lazily resolves the stat name to an index via `EntityStatType.getAssetMap()`. Subclasses implement `eval0(Ref, Instant, EntityStatValue)`.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<EntityStatBoundCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
