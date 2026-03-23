---
title: "StatCondition.StatComparisonType"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.StatCondition.StatComparisonType"
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
public static enum StatCondition.StatComparisonType
```

Comparison operators for stat conditions.

## Enum Constants

| Constant | Prefix | Description |
|---|---|---|
| `GTE` | `>=` | Greater than or equal |
| `GT` | `>` | Greater than |
| `LTE` | `<=` | Less than or equal |
| `LT` | `<` | Less than |
| `EQUAL` | `=` | Equal |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getPrefix()` |
| `public` | `boolean` | `satisfies(float compareTo, float f)` |

## Relationships

- Inner enum of [StatCondition](StatCondition.md)
