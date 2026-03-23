---
title: "DirectDecodeCodec"
kind: "interface"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.DirectDecodeCodec"
api_surface: true
extends: "Codec<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "interface"
---

**Package:** `com.hypixel.hytale.codec`

```java
public interface DirectDecodeCodec<T> extends Codec<T>
```

Extension of `Codec` that supports in-place decoding into an existing object instance rather than creating a new one.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `decode(BsonValue bsonValue, T target, ExtraInfo extraInfo)` |
