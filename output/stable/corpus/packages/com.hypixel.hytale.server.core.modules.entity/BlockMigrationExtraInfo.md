# BlockMigrationExtraInfo

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: ExtraInfo

public class BlockMigrationExtraInfo extends ExtraInfo

Carries block migration context during codec deserialization. Extends `ExtraInfo` (which provides a version number) with a string-to-string remapping function that translates old block type identifiers to their current equivalents. Used during data migration when loading entities that reference block types from older save formats.

## Constructor


public BlockMigrationExtraInfo(int version, Function<String, String> blockMigration)

Constructs a migration info with the specified data version and block identifier remapping function.

## Methods


public Function<String, String> getBlockMigration()

Returns the block identifier migration function. Given an old block type key, returns the corresponding current key.

## Related Types

- `ExtraInfo` -- base class providing the version field
- EntityModule -- the module that manages entity serialization/deserialization
- BlockEntitySystems -- systems that process block entities which may require migration

Also in this package: AllLegacyEntityTypesQuery, AllLegacyLivingEntityTypesQuery, BlockEntitySetupSystem, BlockEntitySystems, BlockEntityTrackerSystem, DespawnComponent, DespawnSystem, EntityModule, EntityRegistration, EntityRegistry, HiddenFromPlayerMigrationSystem, LegacyEntityHolderSystem, LegacyEntityRefSystem, LegacyProjectileSystems, LegacyTransformSystem, LegacyUUIDSystem, LegacyUUIDUpdateSystem, MigrationSystem, OnAddHolderSystem, OnAddRefSystem (and 4 more)

Complete API:
  public Function<String,String> getBlockMigration()

Fields:
private final Function<String,String> blockMigration
