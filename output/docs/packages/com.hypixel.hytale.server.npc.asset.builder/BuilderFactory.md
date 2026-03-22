---
title: "BuilderFactory"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderFactory"
api_surface: false
extends: ~
implements:
  - "SchemaConvertable<Void>"
  - "NamedSchema"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderFactory<T> implements SchemaConvertable<Void>, NamedSchema
```

Factory for creating [Builder](Builder.md) instances from JSON type discriminators. Each factory manages a map of named builder suppliers for a single category (e.g., Role, Action, Sensor). When reading JSON, the factory looks up the type tag value (default key: `"Type"`) and instantiates the corresponding builder. Every factory automatically registers a `"Component"` builder that creates a [BuilderComponent](BuilderComponent.md).

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type produced by builders in this factory. |

## Constants

| Constant | Type | Value |
|---|---|---|
| `DEFAULT_TYPE` | `String` | `"Type"` |
| `COMPONENT_TYPE` | `String` | `"Component"` |

## Fields

| Field | Type | Description |
|---|---|---|
| `typeTag` | `String` | The JSON key used as the type discriminator. |
| `defaultBuilder` | `Supplier<Builder<T>>` | Optional default builder for when no type tag is present. |
| `category` | `Class<T>` | The category class. |
| `buildersSuppliers` | `Map<String, Supplier<Builder<T>>>` | Registered builder suppliers by name. |

## Constructors

```java
public BuilderFactory(Class<T> category, String typeTag)
public BuilderFactory(Class<T> category, String typeTag, Supplier<Builder<T>> defaultBuilder)
```

## Methods

### add

```java
@Nonnull
public BuilderFactory<T> add(String name, Supplier<Builder<T>> builder)
```

Registers a named builder supplier. Throws if the name is already registered or the type tag is empty.

### getCategory

```java
public Class<T> getCategory()
```

### createBuilder

```java
public Builder<T> createBuilder(@Nonnull JsonElement config)
```

Creates a builder from a JSON element by reading the type tag. Falls back to the default builder for non-object elements.

```java
@Nonnull
public Builder<T> createBuilder(String name)
```

Creates a builder by name. Validates the category matches.

### tryCreateDefaultBuilder

```java
@Nullable
public Builder<T> tryCreateDefaultBuilder()
```

Returns a new default builder instance, or `null` if none is configured.

### getKeyName

```java
public String getKeyName(@Nonnull JsonElement config)
```

Extracts the type tag value from a JSON element without creating a builder.

### getBuilderNames

```java
@Nonnull
public List<String> getBuilderNames()
```

Returns all registered builder names.

### getSchemaName

```java
@Nonnull
@Override
public String getSchemaName()
```

Returns `"NPCType:" + category.getSimpleName()`.

### toSchema

```java
@Nonnull
@Override
public Schema toSchema(@Nonnull SchemaContext context)
```

Generates a conditional JSON Schema where the `if/then/else` structure selects the correct builder schema based on the type tag value.

## Related Types

- [Builder](Builder.md) -- the interface of created objects
- [BuilderComponent](BuilderComponent.md) -- default `"Component"` builder
- [BuilderManager](BuilderManager.md) -- registers and retrieves factories
