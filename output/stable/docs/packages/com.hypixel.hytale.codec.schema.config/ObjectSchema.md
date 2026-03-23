---
title: "ObjectSchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.ObjectSchema"
api_surface: true
extends: "com.hypixel.hytale.codec.schema.config.Schema"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "api"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public class ObjectSchema extends Schema
```

Schema node for the JSON Schema `"object"` type. Extends [Schema](Schema.md) with object-specific keywords: `properties` (ordered map), `additionalProperties` (boolean or schema), and `propertyNames` (string schema constraint on key names).

## Codec Properties

Inherits all codec properties from [Schema](Schema.md), plus:

| Key | Type | Description |
|---|---|---|
| `properties` | `Map<String, Schema>` (LinkedHashMap, ordered) | Named property schemas. |
| `additionalProperties` | `Boolean` or `Schema` | Whether additional properties are allowed, or a schema they must conform to. |
| `propertyNames` | [StringSchema](StringSchema.md) | Constraint on property key names. |

## Methods

```java
public Map<String, Schema> getProperties()
```

```java
public void setProperties(Map<String, Schema> properties)
```

```java
@Nullable
public Object getAdditionalProperties()
```

```java
public void setAdditionalProperties(boolean additionalProperties)
```

```java
public void setAdditionalProperties(Schema additionalProperties)
```

```java
public StringSchema getPropertyNames()
```

```java
public void setPropertyNames(StringSchema propertyNames)
```

```java
@Override
public boolean equals(@Nullable Object o)
```

```java
@Override
public int hashCode()
```

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [Schema](Schema.md) -- base class
- [StringSchema](StringSchema.md) -- used for `propertyNames` constraints
