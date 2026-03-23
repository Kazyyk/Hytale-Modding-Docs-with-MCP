---
title: "EnvironmentCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.EnvironmentCondition"
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
public class EnvironmentCondition extends Condition
```

Returns true when the entity's position is in one of the specified environments. Resolves environment names to indices lazily and uses binary search for matching.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<EnvironmentCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
