---
title: "InheritCodec"
kind: "interface"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.InheritCodec"
api_surface: true
extends: "Codec<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "interface"
---

**Package:** `com.hypixel.hytale.codec`

```java
public interface InheritCodec<T> extends Codec<T>
```

Codec extension supporting asset inheritance. Decodes a child value that inherits default field values from a parent instance.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `T` | `decodeAndInherit(RawJsonReader reader, T parent, ExtraInfo extraInfo)` |
