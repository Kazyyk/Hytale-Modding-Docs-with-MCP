---
title: "SelectionPrefabSerializer"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.config"
fqcn: "com.hypixel.hytale.server.core.prefab.config.SelectionPrefabSerializer"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "serializer"
---

**Package:** `com.hypixel.hytale.server.core.prefab.config`

```java
public class SelectionPrefabSerializer
```

Serializer/deserializer for `BlockSelection` prefabs to/from BSON documents. Handles versioned deserialization (versions 1-8) with legacy block migration, fluid conversion, rotation parsing, filler metadata, and entity decoding. Serialization always writes version 8 format.