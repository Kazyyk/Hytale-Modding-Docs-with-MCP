---
title: "SensorDroppedItem"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.SensorDroppedItem"
api_surface: false
extends: "SensorBase"
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
public class SensorDroppedItem extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `List<String>` | `items` |
| `protected final` | `EnumSet<Attitude>` | `attitudes` |
| `protected final` | `double` | `range` |
| `protected final` | `float` | `viewCone` |
| `protected final` | `boolean` | `hasLineOfSight` |
| `protected` | `float` | `heading` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `SensorDroppedItem(@Nonnull BuilderSensorDroppedItem builder, @Nonnull BuilderSupport support)` |
| `public` | `void` | `registerWithSupport(@Nonnull Role role)` |
| `public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `InfoProvider` | `getSensorInfo()` |
| `protected` | `boolean` | `filterItem( @Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> itemRef, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
