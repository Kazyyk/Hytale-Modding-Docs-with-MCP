# UsedTeleporter

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.interaction.server | Implements: Component<EntityStore>

public class UsedTeleporter implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Fields

- destinationWorldUuid | UUID | UUID field.
- destinationPosition | Vector3d | Vector3d field.
- clearOutXZ | double | double field.
- clearOutXZSquared | double | double field.
- clearOutY | double | double field.

## Constructors

- UsedTeleporter() | Creates a new UsedTeleporter instance.
- UsedTeleporter(@Nullable UUID destinationWorldUuid, Vector3d destinationPosition, double clearOutXZ, double clearOutY) | Creates a new UsedTeleporter instance.

## Methods

- getComponentType() | ComponentType<EntityStore, UsedTeleporter> | static public method.
- getDestinationWorldUuid() | UUID | public method.
- getDestinationPosition() | Vector3d | public method.
- getClearOutXZ() | double | public method.
- getClearOutXZSquared() | double | public method.
- getClearOutY() | double | public method.
- clone() | Component<EntityStore> | public method.
