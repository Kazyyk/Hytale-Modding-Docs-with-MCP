---
title: "RawJsonCodec"
kind: "interface"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.RawJsonCodec"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "interface"
---

**Package:** `com.hypixel.hytale.codec`

```java
public interface RawJsonCodec<T>
```

Interface for codecs that can decode directly from a raw JSON stream (`RawJsonReader`) without first parsing to BSON.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `T` | `decodeJson(RawJsonReader reader, ExtraInfo extraInfo)` |
