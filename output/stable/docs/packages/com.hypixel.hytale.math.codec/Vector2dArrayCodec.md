---
title: "Vector2dArrayCodec"
kind: "class"
package: "com.hypixel.hytale.math.codec"
fqcn: "com.hypixel.hytale.math.codec.Vector2dArrayCodec"
api_surface: true
extends: ~
implements:
  - "Codec<Vector2d>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "codec"
  - "math"
---

**Package:** `com.hypixel.hytale.math.codec`

```java
@Deprecated
public class Vector2dArrayCodec implements Codec<Vector2d>
```

Deprecated codec that serializes a `Vector2d` as a two-element JSON/BSON array `[x, y]`. Generates a JSON Schema with `minItems: 2, maxItems: 2`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` | `Vector2d` | Decodes a BSON array into a `Vector2d`. |
| `encode(@Nonnull Vector2d t, ExtraInfo extraInfo)` | `BsonValue` | Encodes a `Vector2d` as a two-element BSON array. |
| `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` | `Vector2d` | Decodes a `Vector2d` from raw JSON `[x, y]`. |
| `toSchema(@Nonnull SchemaContext context)` | `Schema` | Generates an array schema titled "Vector2d". |
