---
title: "BuilderComponent"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderComponent"
api_surface: false
extends: "BuilderBase<T>"
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
public class BuilderComponent<T> extends BuilderBase<T>
```

A generic builder that wraps a [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) to read a `"Content"` JSON object. Used when a builder category needs a simple wrapper around a referenced or inline component. Every [BuilderFactory](BuilderFactory.md) automatically registers a `"Component"` type that creates a `BuilderComponent`.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type this component produces. |

## Constructor

```java
public BuilderComponent(Class<T> classType)
```

## Methods

### build

```java
@Override
public T build(@Nonnull BuilderSupport builderSupport)
```

Delegates to the inner `BuilderObjectReferenceHelper.build()`.

### category

```java
@Override
public Class<T> category()
```

Returns the class type passed to the constructor.

### readConfig

```java
@Nonnull
@Override
public Builder<T> readConfig(@Nonnull JsonElement data)
```

Reads a `"Content"` JSON object into the internal reference helper.

### validate

```java
@Override
public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
```

Validates both this builder and the inner reference helper.

### canRequireFeature

```java
@Override
public boolean canRequireFeature()
```

Returns `true` if `T` is assignable from `Action` or `Motion`.

### toSchema

```java
@Nonnull
@Override
public Schema toSchema(@Nonnull SchemaContext context)
```

Adds `Class`, `Interface`, `Default`, `DefaultState`, and `ResetOnStateChange` properties to the schema.

## Related Types

- [BuilderBase](BuilderBase.md) -- parent class
- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- handles the reference resolution
- [BuilderFactory](BuilderFactory.md) -- automatically registers this as the `"Component"` type
