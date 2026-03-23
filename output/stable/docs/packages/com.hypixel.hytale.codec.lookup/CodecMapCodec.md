---
title: "CodecMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.CodecMapCodec"
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
public class CodecMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>
```

Concrete string-keyed polymorphic codec map. The most commonly used codec map variant, using string IDs as discriminator keys. Extends `ACodecMapCodec` with `String` key type.
