---
title: "NonEmptyStringValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NonEmptyStringValidator"
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
public class NonEmptyStringValidator implements Validator<String>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `NonEmptyStringValidator` | `INSTANCE` | `new NonEmptyStringValidator()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `NonEmptyStringValidator()` |
| `public` | `void` | `accept(@Nonnull String string, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
