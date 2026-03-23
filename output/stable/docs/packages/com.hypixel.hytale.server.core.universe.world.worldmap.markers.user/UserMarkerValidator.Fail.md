---
title: "UserMarkerValidator.Fail"
kind: "record"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.user"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.user.UserMarkerValidator.Fail"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "map"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.markers.user`

```java
public record Fail(Message errorMsg) implements UserMarkerValidator.PlaceResult, UserMarkerValidator.RemoveResult
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `record` | `Fail(Message errorMsg)` |
| `public` | `` | `Fail(String messageKey)` |
