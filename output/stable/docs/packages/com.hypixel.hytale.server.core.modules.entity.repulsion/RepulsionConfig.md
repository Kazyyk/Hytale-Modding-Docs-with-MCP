---
title: "RepulsionConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.repulsion"
fqcn: "com.hypixel.hytale.server.core.modules.entity.repulsion.RepulsionConfig"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, RepulsionConfig>>"
  - "NetworkSerializable<com.hypixel.hytale.protocol.RepulsionConfig>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entity"
  - "repulsion"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.repulsion`

```java
public class RepulsionConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, RepulsionConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.RepulsionConfig>
```

Asset-backed repulsion configuration defining radius, minimum force, and maximum force.
