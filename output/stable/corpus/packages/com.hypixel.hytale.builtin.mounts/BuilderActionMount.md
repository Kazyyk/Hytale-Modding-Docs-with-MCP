# BuilderActionMount

Type: class | Package: com.hypixel.hytale.builtin.mounts.npc.builders | Extends: BuilderActionBase

public class BuilderActionMount extends BuilderActionBase

Builder and JSON configuration reader for ActionMount NPC action definitions. Reads anchor offsets and movement config from JSON data and builds an `ActionMount` instance.

## Fields

- anchorX | FloatHolder | X anchor position holder.
- anchorY | FloatHolder | Y anchor position holder.
- anchorZ | FloatHolder | Z anchor position holder.
- movementConfig | StringHolder | Movement config asset ID holder.

## Methods

### getShortDescription


@Nonnull
@Override
public String getShortDescription()

Returns `"Enable the player to mount the entity"`.

### getLongDescription


@Nonnull
@Override
public String getLongDescription()

Returns the same as `getShortDescription()`.

### getBuilderDescriptorState


@Nonnull
@Override
public BuilderDescriptorState getBuilderDescriptorState()

Returns `BuilderDescriptorState.Stable`.

### Accessor Methods

- getAnchorX(BuilderSupport support) | Returns the X anchor from the execution context.
- getAnchorY(BuilderSupport support) | Returns the Y anchor from the execution context.
- getAnchorZ(BuilderSupport support) | Returns the Z anchor from the execution context.
- getMovementConfig(BuilderSupport support) | Returns the movement config ID from the execution context.

### build


@Nonnull
public ActionMount build(@Nonnull BuilderSupport builderSupport)

Creates an ActionMount from this builder's configuration.

### readConfig


@Override
public Builder<Action> readConfig(@Nonnull JsonElement data)

Reads four required fields from JSON:
- `AnchorX` (float, Stable) -- "The X anchor pos"
- `AnchorY` (float, Stable) -- "The Y anchor pos"
- `AnchorZ` (float, Stable) -- "The Z anchor pos"
- `MovementConfig` (string, Stable) -- "The MovementConfig to use for this mount"

## Related Types

- ActionMount -- the action built by this builder
- MountPlugin -- registers this builder as the `"Mount"` core component type
