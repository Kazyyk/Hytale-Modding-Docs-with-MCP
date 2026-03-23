# SpawnPrefabInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class SpawnPrefabInteraction extends SimpleInstantInteraction

Spawns a prefab at the current location. Supports two origin sources: `ENTITY` (entity position + offset) and `BLOCK` (target block position + rotated offset inheriting block rotation). Loads the prefab from the asset store and pastes it into the world with the configured rotation.

## Codec Properties

- PrefabPath | String | No (inherited) | -- | File path of the prefab asset to spawn.
- Offset | Vector3i | Yes (inherited) | Vector3i.ZERO | Positional offset from the origin.
- RotationYaw | Rotation | Yes (inherited) | Rotation.None | Yaw rotation to apply to the prefab.
- OriginSource | OriginSource` enum | Yes (inherited) | ENTITY | Whether the origin is the entity's position or the target block's position.
- Force | boolean | No (inherited) | false | Whether to force-paste the prefab (overwriting existing blocks).

## Inner Enums

- `OriginSource` -- `ENTITY` or `BLOCK`

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Resolves the prefab path, loads the cached prefab buffer, determines the target position based on origin source, and calls `PrefabUtil.paste`.

## See Also

- `PrefabStore` -- resolves prefab asset paths
- `PrefabUtil` -- handles prefab pasting into the world
