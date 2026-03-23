---
title: "ArraySchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.ArraySchema"
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
public class ArraySchema extends Schema
```

Schema node for the JSON Schema `"array"` type. Extends [Schema](Schema.md) with array-specific keywords: `items` (single schema or tuple of schemas), `minItems`, `maxItems`, and `uniqueItems`.

## Codec Properties

Inherits all codec properties from [Schema](Schema.md), plus:

| Key | Type | Description |
|---|---|---|
| `items` | `Schema` or `Schema[]` | Schema for array items (single or tuple). |
| `minItems` | `Integer` | Minimum number of items. |
| `maxItems` | `Integer` | Maximum number of items. |
| `uniqueItems` | `Boolean` | Whether items must be unique. |

## Constructors

```java
public ArraySchema()
```

```java
public ArraySchema(Schema item)
```

## Methods

```java
@Nullable
public Object getItems()
```

```java
public void setItem(Schema items)
```

Sets a single item schema.

```java
public void setItems(Schema... items)
```

Sets a tuple of item schemas.

```java
@Nullable
public Integer getMinItems()
```

```java
public void setMinItems(Integer minItems)
```

```java
@Nullable
public Integer getMaxItems()
```

```java
public void setMaxItems(Integer maxItems)
```

```java
public boolean getUniqueItems()
```

```java
public void setUniqueItems(boolean uniqueItems)
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
