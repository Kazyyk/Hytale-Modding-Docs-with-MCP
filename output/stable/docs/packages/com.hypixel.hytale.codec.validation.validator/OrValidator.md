---
title: "OrValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.OrValidator"
api_surface: false
extends: null
implements:
  - "Validator"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "codec"
  - "validator"
---
**Package:** `com.hypixel.hytale.codec.validation.validator`

```java
public class OrValidator<T> implements Validator<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Validator<T>[]` | `validators` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `OrValidator(Validator<T>[] validators)` |
| `public` | `void` | `accept(T t, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, @Nonnull Schema target)` |
