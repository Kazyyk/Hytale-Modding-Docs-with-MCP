---
title: "IntegerSchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.IntegerSchema"
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
public class IntegerSchema extends Schema
```

Schema node for the JSON Schema `"integer"` type. Extends [Schema](Schema.md) with integer-specific validation keywords. The `minimum`, `exclusiveMinimum`, `maximum`, and `exclusiveMaximum` fields accept either an integer value or a `Schema` reference (for dynamic bounds).

## Codec Properties

Inherits all codec properties from [Schema](Schema.md), plus:

| Key | Type | Description |
|---|---|---|
| `minimum` | `Integer` or `Schema` | Minimum allowed value (inclusive). |
| `exclusiveMinimum` | `Integer` or `Schema` | Exclusive minimum. |
| `maximum` | `Integer` or `Schema` | Maximum allowed value (inclusive). |
| `exclusiveMaximum` | `Integer` or `Schema` | Exclusive maximum. |
| `enum` | `int[]` | Allowed integer values. |
| `const` | `Integer` | Required constant value. |
| `default` | `Integer` | Default value. |

## Static Methods

```java
@Nonnull
public static Schema constant(int c)
```

Creates an `IntegerSchema` with a `const` value.

## Methods

Getter and setter methods for `minimum`, `exclusiveMinimum`, `maximum`, `exclusiveMaximum` (both `int` and `Schema` overloads), `enum`, `const`, and `default`.

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
- [NumberSchema](NumberSchema.md) -- floating-point equivalent
