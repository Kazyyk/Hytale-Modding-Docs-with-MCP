# ObjectiveLocationAreaBox

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.markerarea | Extends: ObjectiveLocationMarkerArea

public class ObjectiveLocationAreaBox extends ObjectiveLocationMarkerArea

Concrete implementation extending `ObjectiveLocationMarkerArea`.

## Fields

- entryArea | Box | Box field.
- exitArea | Box | Box field.

## Constructors

- ObjectiveLocationAreaBox(Box entryBox, Box exitBox) | Creates a new ObjectiveLocationAreaBox instance.
- ObjectiveLocationAreaBox() | Creates a new ObjectiveLocationAreaBox instance.

## Methods

- getEntryArea() | Box | public method.
- getExitArea() | Box | public method.
- isPlayerInEntryArea(@Nonnull Vector3d playerPosition, @Nonnull Vector3d markerPosition) | boolean | public method.
- getRotatedArea(float yaw, float pitch) | ObjectiveLocationMarkerArea | public method.
- computeAreaBoxes() | void | protected method.
- toString() | String | public method.
