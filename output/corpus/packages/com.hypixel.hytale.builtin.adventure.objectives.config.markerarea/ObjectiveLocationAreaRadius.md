# ObjectiveLocationAreaRadius

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.markerarea | Extends: ObjectiveLocationMarkerArea

public class ObjectiveLocationAreaRadius extends ObjectiveLocationMarkerArea

Concrete implementation extending `ObjectiveLocationMarkerArea`.

## Fields

- DEFAULT_ENTRY_RADIUS | int | Static final int field.
- DEFAULT_EXIT_RADIUS | int | Static final int field.
- entryArea | int | int field.
- exitArea | int | int field.

## Constructors

- ObjectiveLocationAreaRadius(int entryRadius, int exitRadius) | Creates a new ObjectiveLocationAreaRadius instance.
- ObjectiveLocationAreaRadius() | Creates a new ObjectiveLocationAreaRadius instance.

## Methods

- getEntryArea() | int | public method.
- getExitArea() | int | public method.
- isPlayerInEntryArea(@Nonnull Vector3d playerPosition, @Nonnull Vector3d markerPosition) | boolean | public method.
- computeAreaBoxes() | void | protected method.
- toString() | String | public method.
