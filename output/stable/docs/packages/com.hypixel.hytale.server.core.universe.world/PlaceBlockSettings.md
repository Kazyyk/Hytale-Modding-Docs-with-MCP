---
title: "PlaceBlockSettings"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.PlaceBlockSettings"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "blocks"
  - "flags"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class PlaceBlockSettings
```

Bitfield constants for block placement behavior flags.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `NONE` | `int` | `0` | No special behavior. |
| `PERFORM_BLOCK_UPDATE` | `int` | `2` | Trigger a block update after placement. |
| `UPDATE_CONNECTIONS` | `int` | `8` | Update connected block state (e.g. fences, walls). |
