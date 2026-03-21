---
title: "RangeRefValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.RangeRefValidator"
api_surface: false
extends: "Comparable"
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
public class RangeRefValidator<T extends Comparable<T>> implements Validator<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `minPointer` |
| `private final` | `String` | `maxPointer` |
| `private final` | `boolean` | `inclusive` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `RangeRefValidator(String minPointer, String maxPointer, boolean inclusive)` |
| `public` | `void` | `accept(T t, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
