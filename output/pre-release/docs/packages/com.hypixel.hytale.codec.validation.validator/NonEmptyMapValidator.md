---
title: "NonEmptyMapValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NonEmptyMapValidator"
api_surface: false
extends: "NonNullValidator"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "codec"
  - "validator"
---
**Package:** `com.hypixel.hytale.codec.validation.validator`

```java
public class NonEmptyMapValidator<K, V> extends NonNullValidator<Map<K, V>>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `NonEmptyMapValidator()` |
| `public` | `void` | `accept(@Nullable Map<K, V> t, @Nonnull ValidationResults results)` |
