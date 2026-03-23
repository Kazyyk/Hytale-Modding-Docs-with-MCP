---
title: "ValidatableCodec"
kind: "interface"
package: "com.hypixel.hytale.codec.validation"
fqcn: "com.hypixel.hytale.codec.validation.ValidatableCodec"
api_surface: true
extends: "Codec<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "codec"
  - "validation"
  - "interface"
---

**Package:** `com.hypixel.hytale.codec.validation`

```java
public interface ValidatableCodec<T> extends Codec<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `validate(T var1, ExtraInfo var2)` |
| `` | `void` | `validateDefaults(ExtraInfo var1, Set<Codec<?>> var2)` |
