# BuilderCodecObjectHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderCodecObjectHelper<T>

A helper class that reads a JSON element into a typed value using a `Codec<T>` and optionally validates it. Used by builders that embed codec-decoded configuration objects (such as combat configs and interaction variables).

## Type Parameters

- T | The decoded value type.

## Fields

- codec | Codec<T> | The codec used to decode JSON to BSON to the target type.
- classType | Class<?> | The class of the decoded type.
- validator | Validator<T> | Optional codec-level validator.
- value | T | The decoded value, or `null` if not yet read.

## Constructor


public BuilderCodecObjectHelper(Class<?> classType, Codec<T> codec, Validator<T> validator)

## Methods

### build


@Nullable
public T build()

Returns the decoded value.

### readConfig


public void readConfig(@Nonnull JsonElement data, @Nonnull ExtraInfo extraInfo)

Decodes the JSON element via the codec (translating JSON to BSON first), runs the validator if present, and processes validation results.

### hasValue


public boolean hasValue()

Returns `true` if a value has been decoded.

### getClassType


public Class<?> getClassType()

Returns the class type.

## Related Types

- BuilderCombatConfig -- extends this for combat configuration
- BuilderTemplateInteractionVars -- extends this for interaction variable maps
