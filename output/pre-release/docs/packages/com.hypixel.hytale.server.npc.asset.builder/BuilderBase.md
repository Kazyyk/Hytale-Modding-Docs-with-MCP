---
title: "BuilderBase"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderBase"
api_surface: false
extends: ~
implements:
  - "Builder<T>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public abstract class BuilderBase<T> implements Builder<T>
```

The abstract base implementation of the [Builder](Builder.md) interface. Provides the complete infrastructure for reading NPC JSON configuration files: attribute parsing (strings, ints, doubles, booleans, enums, arrays, assets, objects), expression evaluation, validation, schema generation, feature evaluation, state mapping, and instruction context handling.

This is the largest class in the builder package. Concrete builder types (for Actions, Sensors, BodyMotions, HeadMotions, Instructions, etc.) extend `BuilderBase` and override `readConfig(JsonElement)` to declare their specific JSON attributes.

## Type Parameters

| Parameter | Description |
|---|---|
| `T` | The runtime type this builder produces. |

## Key Fields

| Field | Type | Description |
|---|---|---|
| `fileName` | `String` | Name of the JSON file being read. |
| `queriedKeys` | `Set<String>` | Set of JSON keys that have been read, used to detect unknown attributes. |
| `useDefaultsOnly` | `boolean` | When true, attribute readers return defaults without reading JSON. |
| `label` | `String` | Label for breadcrumb error reporting. |
| `typeName` | `String` | Type discriminator name from the factory. |
| `evaluatorHelper` | [FeatureEvaluatorHelper](FeatureEvaluatorHelper.md) | Feature provider evaluation. |
| `stateHelper` | [StateMappingHelper](StateMappingHelper.md) | State machine index mapping. |
| `instructionContextHelper` | [InstructionContextHelper](InstructionContextHelper.md) | Instruction context validation. |
| `builderParameters` | [BuilderParameters](BuilderParameters.md) | Parameter definitions and scope. |
| `builderManager` | [BuilderManager](BuilderManager.md) | The manager loading this builder. |
| `builderDescriptor` | [BuilderDescriptor](BuilderDescriptor.md) | Schema descriptor. |
| `readErrors` | `List<String>` | Errors accumulated during read. |

## Configuration Reading Lifecycle

```java
public final void readConfig(BuilderContext owner, @Nonnull JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
```

Orchestrates the full read lifecycle:
1. `preReadConfig` -- initializes fields from the validation helper.
2. `readCommonConfig` -- reads common attributes shared by all builders.
3. `readConfig(JsonElement)` -- subclass-specific attribute reading (abstract).
4. `postReadConfig` -- detects unknown JSON keys.

## Abstract Methods

```java
@Nonnull
public abstract Builder<T> readConfig(@Nonnull JsonElement data);
```

Subclasses override this to read their specific JSON attributes.

```java
@Nullable
public abstract String getShortDescription();
```

Returns a brief description for schema/documentation.

```java
@Nullable
public abstract String getLongDescription();
```

Returns a detailed description for schema/documentation.

## Attribute Reading Methods

`BuilderBase` provides a large family of `require*` and `optional*` methods for reading typed values from JSON. Each method registers the key, reads the value, validates it, and feeds it to a consumer or holder. Key families include:

- **Strings:** `requireString`, `optionalString`, `requireStringList`, `readString`
- **Numbers:** `requireInt`, `optionalInt`, `requireDouble`, `optionalDouble`, `requireFloat`, `optionalFloat`
- **Booleans:** `requireBoolean`, `optionalBoolean`
- **Enums:** `requireEnum`, `optionalEnum`, `requireEnumSet`, `optionalEnumArray`
- **Arrays:** `requireNumberArray`, `optionalNumberArray`, `requireStringArray`, `optionalStringArray`, `requireBooleanArray`, `optionalTemporalArray`
- **Assets:** `requireAsset`, `optionalAsset`, `requireAssetArray`
- **Objects:** `requireObject`, `optionalObject`, `requireObjectList`, `requireObjectMap`
- **Codec objects:** `requireCodecObject`, `optionalCodecObject`

## Static Utility Methods

```java
public static JsonElement expectKey(@Nonnull JsonObject jsonObject, @Nonnull String key)
```

Returns the value for a required JSON key, throwing if absent.

```java
public static JsonObject expectObject(@Nonnull JsonElement element)
public static JsonObject expectObject(@Nonnull JsonElement element, @Nonnull String name)
```

Casts a JSON element to an object, throwing a descriptive error on type mismatch.

```java
public static boolean readBoolean(@Nonnull JsonObject data, @Nonnull String key, boolean defaultValue)
public static String readString(@Nonnull JsonObject data, @Nonnull String key)
public static String readString(@Nonnull JsonObject data, @Nonnull String key, String defaultValue)
public static String[] readStringArray(@Nonnull JsonObject data, @Nonnull String key, StringValidator validator, BuilderParameters parameters)
```

Static helpers for reading primitives and arrays from JSON objects.

```java
public static <E extends Enum<E>> String getDomain(E[] constants)
```

Generates a comma-separated domain string from enum constants.

## Related Types

- [Builder](Builder.md) -- the interface this class implements
- [BuilderBaseWithType](BuilderBaseWithType.md) -- extends this with a `Type` field
- [SpawnableWithModelBuilder](SpawnableWithModelBuilder.md) -- extends this for spawnable entities
- [BuilderComponent](BuilderComponent.md) -- extends this for generic components
- [BuilderFactory](BuilderFactory.md) -- creates instances via type discriminator
- [BuilderValidationHelper](BuilderValidationHelper.md) -- bundles validation context
