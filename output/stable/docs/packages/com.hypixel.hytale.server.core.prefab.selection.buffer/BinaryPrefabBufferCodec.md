---
title: "BinaryPrefabBufferCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.buffer.BinaryPrefabBufferCodec"
api_surface: false
extends: "java.lang.Object"
implements:
  - "PrefabBufferCodec<ByteBuf>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "prefab"
  - "codec"
  - "binary"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.buffer`

```java
public class BinaryPrefabBufferCodec
```

Codec that serializes and deserializes prefab buffers in a compact binary format. Handles block ID migration across versions, entity holder deserialization, and fluid data. The current format version is 21.
