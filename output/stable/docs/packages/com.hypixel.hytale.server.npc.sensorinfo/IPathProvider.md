---
title: "IPathProvider"
kind: "interface"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.IPathProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public interface IPathProvider extends ExtraInfoProvider
```

Interface defining: `hasPath()`, `getPath()`, `clear()`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `hasPath()` | `boolean` | package-private method. |
| `getPath()` | `IPath<? extends IPathWaypoint>` | package-private method. |
| `clear()` | `void` | package-private method. |
| `getType()` | `Class<IPathProvider>` | package-private method. |
