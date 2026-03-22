---
title: "WrappedCodec"
kind: "class"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.WrappedCodec"
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
public class WrappedCodec<T> implements Codec<T>
```

Codec decorator that wraps another codec, allowing interception or modification of the encode/decode process.
