---
title: "EntityUIComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entityui.asset"
fqcn: "com.hypixel.hytale.server.core.modules.entityui.asset.EntityUIComponent"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "entityui"
  - "asset"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entityui.asset`

```java
public abstract class EntityUIComponent implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityUIComponent>>, NetworkSerializable<EntityUIComponent>
```

Abstract base class for entity UI components displayed above or near entities. Supports hitbox offset configuration and packet generation for client synchronization.
