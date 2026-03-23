---
title: "PathProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.PathProvider"
api_surface: false
extends: ~
implements: 
  - "IPathProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public class PathProvider implements IPathProvider
```

Implementation of `IPathProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `path` | `IPath<? extends IPathWaypoint>` | IPath<? extends IPathWaypoint> field. |
| `isValid` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `setPath(IPath<? extends IPathWaypoint> path)` | `void` | public method. |
| `clear()` | `void` | public method. |
| `hasPath()` | `boolean` | public method. |
| `getPath()` | `IPath<? extends IPathWaypoint>` | public method. |
