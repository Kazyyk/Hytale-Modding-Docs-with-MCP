---
title: "Validator"
kind: "interface"
package: "com.hypixel.hytale.codec.validation"
fqcn: "com.hypixel.hytale.codec.validation.Validator"
api_surface: true
extends: "BiConsumer<T, ValidationResults>"
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
public interface Validator<T> extends BiConsumer<T, ValidationResults>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `accept(T t, ValidationResults results)` |
| `@Override public` | `void` | `acceptLate(T t, ValidationResults results, ExtraInfo extraInfo)` |
| `@Override public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
| `` | `void` | `accept(T var1, ValidationResults var2)` |
| `` | `void` | `updateSchema(SchemaContext var1, Schema var2)` |
| `@Nonnull` | `LateValidator<T>` | `late()` |
