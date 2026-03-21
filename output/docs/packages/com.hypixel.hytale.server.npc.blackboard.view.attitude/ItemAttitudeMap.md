---
title: "ItemAttitudeMap"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.attitude"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.attitude.ItemAttitudeMap"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.attitude`

```java
public class ItemAttitudeMap
```

Provides ItemAttitudeMap functionality within the attitude subsystem.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<String, Attitude>[]` | `map` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `ItemAttitudeMap(Map<String, Attitude>[] map)` |
| `@Nullable public` | `Attitude` | `getAttitude(@Nonnull NPCEntity parent, @Nullable ItemStack item)` |
| `public` | `int` | `getAttitudeGroupCount()` |
| `public` | `void` | `updateAttitudeGroup(int id, @Nonnull ItemAttitudeGroup group)` |
