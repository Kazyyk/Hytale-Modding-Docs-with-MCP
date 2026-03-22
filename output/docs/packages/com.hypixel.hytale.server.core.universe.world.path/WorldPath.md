---
title: "WorldPath"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.path"
fqcn: "com.hypixel.hytale.server.core.universe.world.path.WorldPath"
api_surface: true
extends: null
implements: ["IPath"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "path"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.path`

```java
public class WorldPath implements IPath
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<WorldPath>` | `CODEC` |
| `protected` | `UUID` | `id` |
| `protected` | `String` | `name` |
| `protected` | `List<Transform>` | `waypoints` |
| `protected` | `List<SimplePathWaypoint>` | `simpleWaypoints` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `UUID` | `getId()` |
| `@Override public` | `String` | `getName()` |
| `@Nonnull @Override public` | `List<SimplePathWaypoint>` | `getPathWaypoints()` |
| `@Override public` | `int` | `length()` |
| `public` | `SimplePathWaypoint` | `get(int index)` |
| `public` | `List<Transform>` | `getWaypoints()` |
| `@Nonnull @Override public` | `String` | `toString()` |
