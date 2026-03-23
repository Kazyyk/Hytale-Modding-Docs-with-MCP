---
title: "Schema.InheritSettings"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.Schema.InheritSettings"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "inheritance"
  - "api"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public static class Schema.InheritSettings
```

Configures parent schema inheritance for the `hytaleParent` key. Defines the parent type and optional map-based lookup for determining the parent schema to inherit from.

## Codec Properties

| Key | Type | Description |
|---|---|---|
| `type` | `String` | The parent schema type identifier. |
| `mapKey` | `String` | The property key used for map-based parent lookup. |
| `mapKeyValue` | `String` | The expected value of the map key property. |

## Constructors

```java
public InheritSettings(String type)
```

```java
protected InheritSettings()
```

## Methods

```java
public String getType()
```

```java
public void setType(String type)
```

```java
public String getMapKey()
```

```java
public void setMapKey(String mapKey)
```

```java
public String getMapKeyValue()
```

```java
public void setMapKeyValue(String mapKeyValue)
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

- [Schema](Schema.md) -- parent class
