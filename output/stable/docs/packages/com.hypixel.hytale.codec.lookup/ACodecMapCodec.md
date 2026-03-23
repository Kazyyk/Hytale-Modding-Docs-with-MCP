---
title: "ACodecMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.ACodecMapCodec"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Codec<T>"
  - "ValidatableCodec<T>"
  - "InheritCodec<T>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "codec"
  - "lookup"
  - "serialization"
---

**Package:** `com.hypixel.hytale.codec.lookup`

```java
public abstract class ACodecMapCodec<K, T, C extends Codec<? extends T>> implements Codec<T>, ValidatableCodec<T>, InheritCodec<T>
```

Abstract base class for polymorphic codec maps that dispatch deserialization based on a discriminator key in the BSON document. Maintains concurrent bidirectional mappings between keys, classes, and codecs. Supports priority-ordered default codecs, inheritance-aware decoding, and JSON schema generation.
