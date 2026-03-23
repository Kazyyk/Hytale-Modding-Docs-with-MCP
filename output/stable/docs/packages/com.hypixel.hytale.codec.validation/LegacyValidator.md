---
title: "LegacyValidator"
kind: "interface"
package: "com.hypixel.hytale.codec.validation"
fqcn: "com.hypixel.hytale.codec.validation.LegacyValidator"
api_surface: true
extends: "Validator<T>"
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
public interface LegacyValidator<T> extends Validator<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override` | `void` | `accept(T var1, ValidationResults var2)` |
| `@Override` | `void` | `updateSchema(SchemaContext context, Schema target)` |
