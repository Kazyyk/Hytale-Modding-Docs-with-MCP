---
title: "StatCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.StatCondition"
api_surface: false
extends: "EntityStatBoundCondition"
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
public class StatCondition extends EntityStatBoundCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `StatCondition.StatComparisonType` | `comparison` |
| `protected` | `float` | `amount` |
| `private final` | `String` | `prefix` |
| `private final` | `BiFloatPredicate` | `satisfies` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `StatCondition()` |
| `public` | `` | `StatCondition(boolean inverse, int stat, float amount)` |
| `public` | `boolean` | `eval0(@Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull EntityStatValue statValue)` |
| `public` | `String` | `toString()` |
| `public` | `String` | `getPrefix()` |
| `public` | `boolean` | `satisfies(float compareTo, float f)` |
