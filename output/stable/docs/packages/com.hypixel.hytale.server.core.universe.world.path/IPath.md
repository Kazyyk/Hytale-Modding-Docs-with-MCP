---
title: "IPath"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.path"
fqcn: "com.hypixel.hytale.server.core.universe.world.path.IPath"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "path"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.path`

```java
public interface IPath<Waypoint>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable` | `UUID` | `getId()` |
| `@Nullable` | `String` | `getName()` |
| `` | `List<Waypoint>` | `getPathWaypoints()` |
| `` | `int` | `length()` |
| `` | `Waypoint` | `get(int var1)` |
