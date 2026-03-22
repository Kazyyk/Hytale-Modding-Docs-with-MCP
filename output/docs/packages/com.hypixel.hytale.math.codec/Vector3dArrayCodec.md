---
title: "Vector3dArrayCodec"
kind: "class"
package: "com.hypixel.hytale.math.codec"
fqcn: "com.hypixel.hytale.math.codec.Vector3dArrayCodec"
api_surface: true
extends: ~
implements:
  - "Codec<Vector3d>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "codec"
  - "math"
---

**Package:** `com.hypixel.hytale.math.codec`

```java
@Deprecated
public class Vector3dArrayCodec implements Codec<Vector3d>
```

Deprecated codec that serializes a `Vector3d` as a three-element JSON/BSON array `[x, y, z]`. Generates a JSON Schema with `minItems: 3, maxItems: 3`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` | `Vector3d` | Decodes a BSON array into a `Vector3d`. |
| `encode(@Nonnull Vector3d t, ExtraInfo extraInfo)` | `BsonValue` | Encodes a `Vector3d` as a three-element BSON array. |
| `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` | `Vector3d` | Decodes a `Vector3d` from raw JSON `[x, y, z]`. |
| `toSchema(@Nonnull SchemaContext context)` | `Schema` | Generates an array schema titled "Vector3d". |
