---
title: "IPrefabPathWaypoint"
kind: "interface"
package: "com.hypixel.hytale.builtin.path.waypoint"
fqcn: "com.hypixel.hytale.builtin.path.waypoint.IPrefabPathWaypoint"
api_surface: false
extends: "IPathWaypoint"
implements: ['IPathWaypoint']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builtin"
  - "path"
  - "waypoint"
---

**Package:** `com.hypixel.hytale.builtin.path.waypoint`

```java
public interface IPrefabPathWaypoint extends IPathWaypoint
```

Utility type in the `waypoint` subsystem.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `onReplaced` | `void` | `` |
| `initialise` | `void` | `UUID var1, String var2, int var3, double var4, float var6, int var7, ComponentAccessor<EntityStore> var8` |
| `getParentPath` | `IPath<IPrefabPathWaypoint>` | `` |
