---
title: "Vector3iArrayCodec"
kind: "class"
package: "com.hypixel.hytale.math.codec"
fqcn: "com.hypixel.hytale.math.codec.Vector3iArrayCodec"
api_surface: false
extends: ~
implements: 
  - "Codec<Vector3i>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "math"
  - "codec"
---

**Package:** `com.hypixel.hytale.math.codec`

```java
public class Vector3iArrayCodec implements Codec<Vector3i>
```

Implementation of `Codec<Vector3i>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` | `Vector3i` | public method. |
| `encode(@Nonnull Vector3i t, ExtraInfo extraInfo)` | `BsonValue` | public method. |
| `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` | `Vector3i` | public method. |
| `toSchema(@Nonnull SchemaContext context)` | `Schema` | public method. |
