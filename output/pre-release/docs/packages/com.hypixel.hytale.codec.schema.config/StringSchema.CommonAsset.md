---
title: "StringSchema.CommonAsset"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.StringSchema.CommonAsset"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "asset"
  - "api"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public static class StringSchema.CommonAsset
```

Configuration for common asset file references within a [StringSchema](StringSchema.md). Specifies required root directories, file extension, and whether the asset is a UI asset.

## Codec Properties

| Key | Type | Description |
|---|---|---|
| `requiredRoots` | `String[]` | Required root directories the asset path must start with. |
| `requiredExtension` | `String` | Required file extension (e.g., `".png"`). |
| `isUIAsset` | `boolean` | Whether this references a UI asset. |

## Constructors

```java
public CommonAsset(String requiredExtension, boolean isUIAsset, String... requiredRoots)
```

```java
protected CommonAsset()
```

## Methods

```java
public String[] getRequiredRoots()
```

```java
public String getRequiredExtension()
```

```java
public boolean isUIAsset()
```

## See Also

- [StringSchema](StringSchema.md) -- parent class
