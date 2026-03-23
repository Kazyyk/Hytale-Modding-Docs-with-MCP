# NPCMountComponent

Type: class | Package: com.hypixel.hytale.builtin.mounts | Implements: Component<EntityStore>

public class NPCMountComponent implements Component<EntityStore>

An `EntityStore` ECS component storing NPC-specific mount state. Tracks the NPC's original role index (to restore on dismount), the owning player reference, and the anchor position offset where the player attaches to the NPC.

Serialized with codec key `"Mount"` and a `BuilderCodec` that persists `OriginalRoleIndex`.

## Component Type


public static ComponentType<EntityStore, NPCMountComponent> getComponentType()

Delegates to `MountPlugin.getInstance().getMountComponentType()`.

## Codec


public static final BuilderCodec<NPCMountComponent> CODEC

Serializes/deserializes the `OriginalRoleIndex` field as an integer.

## Accessors

- getOriginalRoleIndex() | int | The NPC role index before mounting, used to restore the role on dismount.
- getOwnerPlayerRef() | @Nullable PlayerRef | The player who mounted this NPC, or `null`.
- getAnchorX() | float | X component of the player attachment offset.
- getAnchorY() | float | Y component of the player attachment offset.
- getAnchorZ() | float | Z component of the player attachment offset.

## Mutators

- setOriginalRoleIndex(int originalRoleIndex) | Sets the original role index.
- setOwnerPlayerRef(PlayerRef ownerPlayerRef) | Sets the owning player reference.
- setAnchor(float x, float y, float z) | Sets the anchor attachment offset.

## Clone


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a copy with all fields duplicated.

## Related Types

- NPCMountSystems -- systems reacting to this component
- ActionMount -- NPC action that creates this component
- MountPlugin -- registers this component type
