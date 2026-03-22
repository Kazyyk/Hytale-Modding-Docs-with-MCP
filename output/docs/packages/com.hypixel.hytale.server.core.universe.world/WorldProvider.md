---
title: "WorldProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.WorldProvider"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public interface WorldProvider
```

Simple provider interface for obtaining a `World` reference. Implemented by stores and other components that belong to a specific world.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getWorld()` | `World` | Returns the associated world. |

## See Also

- [World](World.md)
