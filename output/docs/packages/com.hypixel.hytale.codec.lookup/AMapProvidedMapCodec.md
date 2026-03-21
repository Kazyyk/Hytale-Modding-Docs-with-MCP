---
title: "AMapProvidedMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.AMapProvidedMapCodec"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Codec<T>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "codec"
  - "lookup"
  - "serialization"
---

**Package:** `com.hypixel.hytale.codec.lookup`

```java
public abstract class AMapProvidedMapCodec<K, T> implements Codec<T>
```

Abstract codec that resolves keys from a provided map at decode time. Decodes values by looking up the discriminator key in a dynamically supplied map rather than a fixed registry. Used where the set of available codecs varies by context.
