# BuilderBase

Type: abstract class | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: Builder<T>

public abstract class BuilderBase<T> implements Builder<T>

The abstract base implementation of the Builder interface. Provides the complete infrastructure for reading NPC JSON configuration files: attribute parsing (strings, ints, doubles, booleans, enums, arrays, assets, objects), expression evaluation, validation, schema generation, feature evaluation, state mapping, and instruction context handling.

This is the largest class in the builder package. Concrete builder types (for Actions, Sensors, BodyMotions, HeadMotions, Instructions, etc.) extend `BuilderBase` and override `readConfig(JsonElement)` to declare their specific JSON attributes.

## Type Parameters

- T | The runtime type this builder produces.

## Key Fields

- fileName | String | Name of the JSON file being read.
- queriedKeys | Set<String> | Set of JSON keys that have been read, used to detect unknown attributes.
- useDefaultsOnly | boolean | When true, attribute readers return defaults without reading JSON.
- label | String | Label for breadcrumb error reporting.
- typeName | String | Type discriminator name from the factory.
- evaluatorHelper | FeatureEvaluatorHelper | Feature provider evaluation.
- stateHelper | StateMappingHelper | State machine index mapping.
- instructionContextHelper | InstructionContextHelper | Instruction context validation.
- builderParameters | BuilderParameters | Parameter definitions and scope.
- builderManager | BuilderManager | The manager loading this builder.
- builderDescriptor | BuilderDescriptor | Schema descriptor.
- readErrors | List<String> | Errors accumulated during read.

## Configuration Reading Lifecycle


public final void readConfig(BuilderContext owner, @Nonnull JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)

Orchestrates the full read lifecycle:
1. `preReadConfig` -- initializes fields from the validation helper.
2. `readCommonConfig` -- reads common attributes shared by all builders.
3. `readConfig(JsonElement)` -- subclass-specific attribute reading (abstract).
4. `postReadConfig` -- detects unknown JSON keys.

## Abstract Methods


@Nonnull
public abstract Builder<T> readConfig(@Nonnull JsonElement data);

Subclasses override this to read their specific JSON attributes.


@Nullable
public abstract String getShortDescription();

Returns a brief description for schema/documentation.


@Nullable
public abstract String getLongDescription();

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


public static JsonElement expectKey(@Nonnull JsonObject jsonObject, @Nonnull String key)

Returns the value for a required JSON key, throwing if absent.


public static JsonObject expectObject(@Nonnull JsonElement element)
public static JsonObject expectObject(@Nonnull JsonElement element, @Nonnull String name)

Casts a JSON element to an object, throwing a descriptive error on type mismatch.


public static boolean readBoolean(@Nonnull JsonObject data, @Nonnull String key, boolean defaultValue)
public static String readString(@Nonnull JsonObject data, @Nonnull String key)
public static String readString(@Nonnull JsonObject data, @Nonnull String key, String defaultValue)
public static String[] readStringArray(@Nonnull JsonObject data, @Nonnull String key, StringValidator validator, BuilderParameters parameters)

Static helpers for reading primitives and arrays from JSON objects.


public static <E extends Enum<E>> String getDomain(E[] constants)

Generates a comma-separated domain string from enum constants.

## Related Types

- Builder -- the interface this class implements
- BuilderBaseWithType -- extends this with a `Type` field
- SpawnableWithModelBuilder -- extends this for spawnable entities
- BuilderComponent -- extends this for generic components
- BuilderFactory -- creates instances via type discriminator
- BuilderValidationHelper -- bundles validation context
