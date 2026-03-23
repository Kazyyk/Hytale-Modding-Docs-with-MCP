---
title: "StatCondition.StatComparisonType"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.StatCondition.StatComparisonType"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset.condition`

```java
public static enum StatComparisonType
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `prefix` |
| `private final` | `BiFloatPredicate` | `satisfies` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `StatComparisonType(String prefix, BiFloatPredicate satisfies)` |
| `public` | `String` | `getPrefix()` |
| `public` | `boolean` | `satisfies(float compareTo, float f)` |
