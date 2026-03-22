---
title: "ActionInventory"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.ActionInventory"
api_surface: false
extends: "ActionBase"
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
public class ActionInventory extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ActionInventory.Operation` | `operation` |
| `protected final` | `String` | `item` |
| `protected final` | `int` | `count` |
| `protected final` | `boolean` | `useTarget` |
| `protected final` | `byte` | `slot` |
| `private final` | `String` | `description` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ActionInventory(@Nonnull BuilderActionInventory builder, @Nonnull BuilderSupport support)` |
| `public` | `boolean` | `canExecute( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store )` |
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `String` | `get()` |
