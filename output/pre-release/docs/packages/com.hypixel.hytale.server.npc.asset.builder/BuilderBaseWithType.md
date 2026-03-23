---
title: "BuilderBaseWithType"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderBaseWithType"
api_surface: false
extends: "BuilderBase<T>"
implements:
  - "ISpawnable"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public abstract class BuilderBaseWithType<T> extends BuilderBase<T> implements ISpawnable
```

An abstract builder base that adds a `Type` string field to the standard [BuilderBase](BuilderBase.md). Used by builder categories that require a secondary type discriminator in addition to the factory type tag. Implements `ISpawnable` to participate in the spawning system.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type this builder produces. |

## Fields

| Field | Type | Description |
|---|---|---|
| `type` | `String` | The type string read from the JSON `Type` key. |

## Methods

### readTypeKey

```java
protected void readTypeKey(@Nonnull JsonElement data, String typeKey)
```

Reads the type discriminator from the JSON data using the specified key name. Validates the value is a non-empty string via `StringNotEmptyValidator`.

```java
protected void readTypeKey(@Nonnull JsonElement data)
```

Reads the type discriminator using the default key `"Type"`.

### getType

```java
public String getType()
```

Returns the type string previously read from JSON.

### readCommonConfig

```java
@Override
public Builder<T> readCommonConfig(JsonElement data)
```

Delegates to `BuilderBase.readCommonConfig`.

## Related Types

- [BuilderBase](BuilderBase.md) -- parent class
- [Builder](Builder.md) -- root builder interface
