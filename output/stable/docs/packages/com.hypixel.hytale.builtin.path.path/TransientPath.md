---
title: "TransientPath"
kind: "class"
package: "com.hypixel.hytale.builtin.path.path"
fqcn: "com.hypixel.hytale.builtin.path.path.TransientPath"
api_surface: false
extends: ~
implements: 
  - "IPath<SimplePathWaypoint>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "pathing"
---

**Package:** `com.hypixel.hytale.builtin.path.path`

```java
public class TransientPath implements IPath<SimplePathWaypoint>
```

Implementation of `IPath<SimplePathWaypoint>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `addWaypoint(@Nonnull Vector3d position, @Nonnull Vector3f rotation)` | `void` | public method. |
| `getId()` | `UUID` | public method. |
| `getName()` | `String` | public method. |
| `getPathWaypoints()` | `List<SimplePathWaypoint>` | public method. |
| `length()` | `int` | public method. |
| `get(int index)` | `SimplePathWaypoint` | public method. |
