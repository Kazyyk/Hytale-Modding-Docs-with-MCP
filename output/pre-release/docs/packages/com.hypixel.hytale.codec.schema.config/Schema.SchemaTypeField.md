---
title: "Schema.SchemaTypeField"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.Schema.SchemaTypeField"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "discriminator"
  - "api"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public static class Schema.SchemaTypeField
```

Configures a type discriminator field for the `hytaleSchemaTypeField` key. Used to define which property acts as a type selector, its default value, allowed values, and an optional parent property key for hierarchical discrimination.

## Codec Properties

| Key | Type | Description |
|---|---|---|
| `property` | `String` | The property name used as the type discriminator. |
| `defaultValue` | `String` | Default value when the discriminator is absent. |
| `values` | `String[]` | Allowed values for the discriminator. |
| `parentPropertyKey` | `String` | Parent property key for hierarchical type fields. |

## Constructors

```java
public SchemaTypeField(String property, String defaultValue, String... values)
```

```java
protected SchemaTypeField()
```

## Methods

```java
public String getProperty()
```

```java
public String getDefaultValue()
```

```java
public String[] getValues()
```

```java
public String getParentPropertyKey()
```

```java
public void setParentPropertyKey(String parentPropertyKey)
```

```java
@Override
public boolean equals(Object o)
```

```java
@Override
public int hashCode()
```

## See Also

- [Schema](Schema.md) -- parent class
