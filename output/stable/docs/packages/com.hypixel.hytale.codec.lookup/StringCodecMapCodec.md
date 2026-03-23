---
title: "StringCodecMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.StringCodecMapCodec"
api_surface: true
extends: "ACodecMapCodec<String, T, Codec<? extends T>>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "codec"
  - "lookup"
  - "serialization"
---

**Package:** `com.hypixel.hytale.codec.lookup`

```java
public class StringCodecMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>
```

String-keyed codec map that decodes from a plain string value rather than a BSON document. When the input is a string, it is used directly as the lookup key. When the input is a document, it falls back to the standard key-field lookup.
