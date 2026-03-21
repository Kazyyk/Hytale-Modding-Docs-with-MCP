---
title: "Condition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.Condition"
api_surface: true
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
public abstract class Condition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `inverse` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `Condition()` |
| `public` | `` | `Condition(boolean inverse)` |
| `public` | `boolean` | `eval(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)` |
| `public abstract` | `boolean` | `eval0(@Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3)` |
| `public static` | `boolean` | `allConditionsMet( @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull EntityStatType.Regenerating regenerating )` |
| `public static` | `boolean` | `allConditionsMet( @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )` |
| `public` | `String` | `toString()` |
