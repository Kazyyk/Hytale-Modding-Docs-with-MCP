---
title: "MapKeyMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.MapKeyMapCodec"
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
public class MapKeyMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>
```

Codec map variant that uses the BSON document's map key (rather than a nested field) as the discriminator. When an object has a single key-value pair, the key selects the codec and the value is decoded with it.
