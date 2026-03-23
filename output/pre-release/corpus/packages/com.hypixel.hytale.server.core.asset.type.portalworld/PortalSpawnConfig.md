# PortalSpawnConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.portalworld | Extends: java.lang.Object

public class PortalSpawnConfig

Configures spawn behavior for portal world fragment instances. Controls whether a return portal block is placed at the spawn location, provides an optional spawn provider override, and allows overriding the return portal block type.

## Fields

- spawnReturnPortal | boolean | true | Whether to spawn a return portal block at the fragment spawn
- spawnProviderOverride | ISpawnProvider | null | Overrides the world's spawn provider for this portal type
- returnBlockId | String | null | Overrides the block type used for the return portal

## Methods


public boolean isSpawningReturnPortal()

Returns whether a return portal block should be spawned.


public ISpawnProvider getSpawnProviderOverride()

Returns the spawn provider override, or `null` if the world default should be used.


public String getReturnBlockOverrideId()

Returns the return block type asset key override, or `null`.


@Nullable
public BlockType getReturnBlockOverride()

Resolves and returns the override `BlockType` for the return portal, or `null` if not set.

## Related Types

- `PortalType` -- references this for spawn configuration
