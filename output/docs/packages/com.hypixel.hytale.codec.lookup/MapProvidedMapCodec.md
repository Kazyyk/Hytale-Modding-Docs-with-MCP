---
title: "MapProvidedMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.MapProvidedMapCodec"
api_surface: true
extends: "AMapProvidedMapCodec<String, T>"
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
public class MapProvidedMapCodec<T> extends AMapProvidedMapCodec<String, T>
```

Concrete string-keyed map-provided codec. Resolves the codec for a BSON document by looking up the discriminator key in a dynamically supplied `Map<String, T>`.
