---
title: "BuilderCodecObjectHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderCodecObjectHelper"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderCodecObjectHelper<T>
```

A helper class that reads a JSON element into a typed value using a `Codec<T>` and optionally validates it. Used by builders that embed codec-decoded configuration objects (such as combat configs and interaction variables).

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The decoded value type. |

## Fields

| Field | Type | Description |
|---|---|---|
| `codec` | `Codec<T>` | The codec used to decode JSON to BSON to the target type. |
| `classType` | `Class<?>` | The class of the decoded type. |
| `validator` | `Validator<T>` | Optional codec-level validator. |
| `value` | `T` | The decoded value, or `null` if not yet read. |

## Constructor

```java
public BuilderCodecObjectHelper(Class<?> classType, Codec<T> codec, Validator<T> validator)
```

## Methods

### build

```java
@Nullable
public T build()
```

Returns the decoded value.

### readConfig

```java
public void readConfig(@Nonnull JsonElement data, @Nonnull ExtraInfo extraInfo)
```

Decodes the JSON element via the codec (translating JSON to BSON first), runs the validator if present, and processes validation results.

### hasValue

```java
public boolean hasValue()
```

Returns `true` if a value has been decoded.

### getClassType

```java
public Class<?> getClassType()
```

Returns the class type.

## Related Types

- [BuilderCombatConfig](BuilderCombatConfig.md) -- extends this for combat configuration
- [BuilderTemplateInteractionVars](BuilderTemplateInteractionVars.md) -- extends this for interaction variable maps
