---
title: "LogicCondition.Operator"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.LogicCondition.Operator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:03Z"
tags:
  - "condition"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.condition`

```java
public static enum LogicCondition.Operator
```

Logical operators for combining conditions within a `LogicCondition`.

## Enum Constants

| Constant | Description |
|---|---|
| `AND` | All conditions must evaluate to true |
| `OR` | At least one condition must evaluate to true |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `boolean` | `eval(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime, Condition[] conditions)` |

## Relationships

- Inner enum of [LogicCondition](LogicCondition.md)
