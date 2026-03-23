# TeleportHistory

Type: class | Package: com.hypixel.hytale.builtin.teleport.components | Implements: Component<EntityStore>

public class TeleportHistory implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Fields

- MAX_TELEPORT_HISTORY | int | Static final int field.

## Methods

- getComponentType() | ComponentType<EntityStore, TeleportHistory> | static public method.
- forward(@Nonnull Ref<EntityStore> ref, int count) | void | public method.
- back(@Nonnull Ref<EntityStore> ref, int count) | void | public method.
- getForwardSize() | int | public method.
- getBackSize() | int | public method.
- append(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f rotation, @Nonnull String key) | void | public method.
- toString() | String | public method.
- clone() | Component<EntityStore> | public method.
