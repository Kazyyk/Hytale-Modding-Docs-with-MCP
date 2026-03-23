---
title: "NumberSchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.NumberSchema"
api_surface: false
extends: "com.hypixel.hytale.codec.schema.config.Schema"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public class NumberSchema extends Schema
```

Schema node for the JSON Schema `"number"` type. Extends [Schema](Schema.md) with numeric validation keywords. The `minimum`, `exclusiveMinimum`, `maximum`, and `exclusiveMaximum` fields accept either a `double` value or a `Schema` reference (for dynamic bounds).

## Codec Properties

Inherits all codec properties from [Schema](Schema.md), plus:

| Key | Type | Description |
|---|---|---|
| `minimum` | `Double` or `Schema` | Minimum allowed value (inclusive). |
| `exclusiveMinimum` | `Double` or `Schema` | Exclusive minimum. |
| `maximum` | `Double` or `Schema` | Maximum allowed value (inclusive). |
| `exclusiveMaximum` | `Double` or `Schema` | Exclusive maximum. |
| `enum` | `double[]` | Allowed numeric values. |
| `const` | `Double` | Required constant value. |
| `default` | `Double` | Default value. |

## Static Methods

```java
@Nonnull
public static Schema constant(double c)
```

Creates a `NumberSchema` with a `const` value.

## Methods

Getter and setter methods for `minimum`, `exclusiveMinimum`, `maximum`, `exclusiveMaximum` (both `double` and `Schema` overloads), `enum`, `const`, and `default`.

```java
@Override
public boolean equals(@Nullable Object o)
```

```java
@Override
public int hashCode()
```

## See Also

- [Schema](Schema.md) -- base class
- [IntegerSchema](IntegerSchema.md) -- integer equivalent
