---
title: "LogicCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.LogicCondition"
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
public class LogicCondition extends Condition
```

Combines an array of child conditions using either AND or OR logic. Both the operator and the conditions array are codec-deserialized.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<LogicCondition>` | `CODEC` |

## Relationships

- Extends [Condition](Condition.md)
