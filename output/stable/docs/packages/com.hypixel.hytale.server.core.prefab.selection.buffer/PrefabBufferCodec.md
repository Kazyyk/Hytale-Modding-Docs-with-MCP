---
title: "PrefabBufferCodec"
kind: "interface"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.buffer.PrefabBufferCodec"
api_surface: false
extends: ~
implements:
  - "PrefabBufferSerializer<T>"
  - "PrefabBufferDeserializer<T>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "prefab"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.buffer`

```java
public interface PrefabBufferCodec
```

Combined interface for types that can both serialize and deserialize prefab buffers. Parameterized by the storage medium type (e.g., `ByteBuf` for binary, `BsonDocument` for BSON).
