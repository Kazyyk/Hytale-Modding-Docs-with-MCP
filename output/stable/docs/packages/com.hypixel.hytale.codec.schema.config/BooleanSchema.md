---
title: "BooleanSchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.BooleanSchema"
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
public class BooleanSchema extends Schema
```

Schema node for the JSON Schema `"boolean"` type. Extends [Schema](Schema.md) with a `default` value.

## Codec Properties

Inherits all codec properties from [Schema](Schema.md), plus:

| Key | Type | Description |
|---|---|---|
| `default` | `Boolean` | Default boolean value. |

## Methods

```java
public Boolean getDefault()
```

```java
public void setDefault(Boolean default_)
```

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
