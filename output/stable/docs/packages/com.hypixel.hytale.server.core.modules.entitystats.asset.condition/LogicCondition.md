---
title: "LogicCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.LogicCondition"
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
public class LogicCondition extends Condition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `LogicCondition.Operator` | `operator` |
| `protected` | `Condition[]` | `conditions` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `LogicCondition()` |
| `public` | `` | `LogicCondition(boolean inverse, @Nonnull LogicCondition.Operator operator, @Nonnull Condition[] conditions)` |
| `public` | `boolean` | `eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)` |
| `public` | `String` | `toString()` |
| `public` | `boolean` | `eval( @Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )` |
| `public` | `boolean` | `eval( @Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )` |
| `public abstract` | `boolean` | `eval( @Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3, @Nonnull Condition[] var4 )` |
