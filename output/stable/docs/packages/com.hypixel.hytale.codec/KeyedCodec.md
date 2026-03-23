---
title: "KeyedCodec"
kind: "class"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.KeyedCodec"
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
public class KeyedCodec<T>
```

Wraps a `Codec` with an associated string key, used for encoding/decoding named fields in JSON/BSON documents.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getKey()` |
| `public` | `Codec<T>` | `getCodec()` |
