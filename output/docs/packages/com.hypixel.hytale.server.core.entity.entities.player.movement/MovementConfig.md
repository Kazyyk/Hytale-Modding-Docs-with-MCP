---
title: "MovementConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.movement"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.movement.MovementConfig"
api_surface: false
extends: null
implements: ["JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, MovementConfig>>", "NetworkSerializable<MovementSettings>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "player"
  - "movement"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.movement`

```java
public class MovementConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, MovementConfig>>, NetworkSerializable<MovementSettings>
```

JSON-configured movement parameter set supporting inheritance. Defines velocity resistance, jump force, walk/sprint/crouch/swim speeds, gravity, and fly speed. Serializable to `MovementSettings` for network transmission.
