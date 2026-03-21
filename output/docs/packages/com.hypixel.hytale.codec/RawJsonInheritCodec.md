---
title: "RawJsonInheritCodec"
kind: "class"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.RawJsonInheritCodec"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "class"
---

**Package:** `com.hypixel.hytale.codec`

```java
public interface RawJsonInheritCodec<T> extends InheritCodec<T>
```

Combines `InheritCodec` and `RawJsonCodec` to support both inheritance-based decoding and raw JSON stream decoding.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `T` | `decodeAndInheritJson(RawJsonReader reader, T parent, ExtraInfo extraInfo)` |
