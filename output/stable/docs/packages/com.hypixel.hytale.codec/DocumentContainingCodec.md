---
title: "DocumentContainingCodec"
kind: "class"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.DocumentContainingCodec"
api_surface: false
extends: "BsonFunctionCodec<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "class"
---

**Package:** `com.hypixel.hytale.codec`

```java
@Deprecated
public class DocumentContainingCodec<T> extends BsonFunctionCodec<T>
```

Deprecated codec that preserves unknown fields from a BSON document alongside the known decoded fields. Strips known keys during decode and merges extra keys during encode.
