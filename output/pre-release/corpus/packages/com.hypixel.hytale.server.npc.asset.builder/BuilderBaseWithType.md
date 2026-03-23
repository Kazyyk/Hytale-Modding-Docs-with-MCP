# BuilderBaseWithType

Type: abstract class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderBase<T> | Implements: ISpawnable

public abstract class BuilderBaseWithType<T> extends BuilderBase<T> implements ISpawnable

An abstract builder base that adds a `Type` string field to the standard BuilderBase. Used by builder categories that require a secondary type discriminator in addition to the factory type tag. Implements `ISpawnable` to participate in the spawning system.

## Type Parameters

- T | The runtime type this builder produces.

## Fields

- type | String | The type string read from the JSON `Type` key.

## Methods

### readTypeKey


protected void readTypeKey(@Nonnull JsonElement data, String typeKey)

Reads the type discriminator from the JSON data using the specified key name. Validates the value is a non-empty string via `StringNotEmptyValidator`.


protected void readTypeKey(@Nonnull JsonElement data)

Reads the type discriminator using the default key `"Type"`.

### getType


public String getType()

Returns the type string previously read from JSON.

### readCommonConfig


@Override
public Builder<T> readCommonConfig(JsonElement data)

Delegates to `BuilderBase.readCommonConfig`.

## Related Types

- BuilderBase -- parent class
- Builder -- root builder interface

Known subclasses: BuilderMotionControllerBase

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 29 more)

Complete API:
  public Builder<T> readCommonConfig(JsonElement data)
  protected void readTypeKey(JsonElement data, String typeKey)
  protected void readTypeKey(JsonElement data)
  public String getType()

Fields:
private String type
