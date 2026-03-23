---
title: "ActionDropItem"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.ActionDropItem"
api_surface: false
extends: "ActionWithDelay"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.corecomponents.items`

```java
public class ActionDropItem extends ActionWithDelay
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `String` | `item` |
| `protected final` | `String` | `dropList` |
| `protected final` | `float` | `dropSectorStart` |
| `protected final` | `float` | `dropSectorEnd` |
| `protected final` | `double` | `minDistance` |
| `protected final` | `double` | `maxDistance` |
| `protected final` | `boolean` | `highPitch` |
| `protected final` | `float[]` | `pitch` |
| `protected` | `float` | `throwSpeed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ActionDropItem(@Nonnull BuilderActionDropItem builder, @Nonnull BuilderSupport support)` |
| `public` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `protected` | `double` | `pickDistance()` |
| `protected` | `void` | `newDirection(@Nonnull Ref<EntityStore> ref, double distance, double height, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
