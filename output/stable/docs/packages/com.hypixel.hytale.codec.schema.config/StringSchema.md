---
title: "StringSchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.StringSchema"
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
public class StringSchema extends Schema
```

Schema node for the JSON Schema `"string"` type. Extends [Schema](Schema.md) with string-specific validation keywords and Hytale-specific asset reference extensions.

## Codec Properties

Inherits all codec properties from [Schema](Schema.md), plus:

| Key | Type | Description |
|---|---|---|
| `pattern` | `String` | Regex pattern the value must match. |
| `enum` | `String[]` | Allowed string values. |
| `const` | `String` | Required constant value. |
| `default` | `String` | Default value. |
| `minLength` | `Integer` | Minimum string length. |
| `maxLength` | `Integer` | Maximum string length. |
| `hytaleCommonAsset` | [StringSchema.CommonAsset](StringSchema.CommonAsset.md) | Common asset file reference configuration. |
| `hytaleCosmeticAsset` | `String` | Cosmetic asset reference. |

## Static Methods

```java
@Nonnull
public static Schema constant(String c)
```

Creates a `StringSchema` with a `const` value.

## Methods

```java
public String getPattern()
```

```java
public void setPattern(String pattern)
```

```java
public void setPattern(@Nonnull Pattern pattern)
```

Sets pattern from a compiled `Pattern`. Throws if the pattern has flags set.

```java
public Integer getMinLength()
```

```java
public void setMinLength(int minLength)
```

```java
public Integer getMaxLength()
```

```java
public void setMaxLength(int maxLength)
```

```java
public String[] getEnum()
```

```java
public void setEnum(String[] enum_)
```

```java
public String getConst()
```

```java
public void setConst(String const_)
```

```java
public String getDefault()
```

```java
public void setDefault(String default_)
```

```java
public StringSchema.CommonAsset getHytaleCommonAsset()
```

```java
public void setHytaleCommonAsset(StringSchema.CommonAsset hytaleCommonAsset)
```

```java
public String getHytaleCosmeticAsset()
```

```java
public void setHytaleCosmeticAsset(String hytaleCosmeticAsset)
```

```java
@Override
public boolean equals(@Nullable Object o)
```

```java
@Override
public int hashCode()
```

## Inner Classes

- [StringSchema.CommonAsset](StringSchema.CommonAsset.md) -- configuration for common asset file references

## See Also

- [Schema](Schema.md) -- base class
- [ObjectSchema](ObjectSchema.md) -- uses `StringSchema` for `propertyNames`
