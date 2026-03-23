---
title: "ObjectCodecMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.ObjectCodecMapCodec"
api_surface: true
extends: "ACodecMapCodec<K, T, Codec<? extends T>>"
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
public class ObjectCodecMapCodec<K, T> extends ACodecMapCodec<K, T, Codec<? extends T>>
```

Generic-keyed polymorphic codec map. Unlike `CodecMapCodec` (which is always string-keyed), this variant supports any key type `K` with a corresponding key codec.
