---
title: "EntityStatBoundCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.EntityStatBoundCondition"
api_surface: false
extends: "Condition"
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
public abstract class EntityStatBoundCondition extends Condition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `unknownStat` |
| `protected` | `int` | `stat` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `EntityStatBoundCondition()` |
| `public` | `` | `EntityStatBoundCondition(boolean inverse, int stat)` |
| `public` | `boolean` | `eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)` |
| `public abstract` | `boolean` | `eval0(@Nonnull Ref<EntityStore> var1, @Nonnull Instant var2, @Nonnull EntityStatValue var3)` |
| `public` | `String` | `toString()` |
