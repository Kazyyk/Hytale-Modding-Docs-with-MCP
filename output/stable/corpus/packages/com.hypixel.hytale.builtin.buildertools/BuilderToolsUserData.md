# BuilderToolsUserData

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Implements: Component<EntityStore>

public class BuilderToolsUserData implements Component<EntityStore>

An `EntityStore` component that stores per-player builder tools preferences. Registered with component ID `"BuilderTools"` during BuilderToolsPlugin setup. Currently tracks a single setting: whether changes to the block selection box are recorded in the undo/redo history.

## Constants


public static final String ID = "BuilderTools"

The component registration ID.

## Codec


public static final BuilderCodec<BuilderToolsUserData> CODEC

Serialization codec with a single `"SelectionHistory"` boolean field.

## Static Methods

### get


@Nonnull
public static BuilderToolsUserData get(@Nonnull Player player)

Returns the `BuilderToolsUserData` component from the player's entity holder, or a new default instance if the component is not present.

### getComponentType


public static ComponentType<EntityStore, BuilderToolsUserData> getComponentType()

Returns the registered `ComponentType` from the plugin singleton.

## Instance Methods

### isRecordingSelectionHistory


public boolean isRecordingSelectionHistory()

Returns `true` if selection changes should be recorded in the undo/redo history. Defaults to `true`.

### setRecordSelectionHistory


public void setRecordSelectionHistory(boolean selectionHistory)

Sets whether selection changes are recorded in the undo/redo history.

### clone


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a deep copy of this component with the same `selectionHistory` value.

### toString


@Nonnull
@Override
public String toString()

Returns a string representation including the `selectionHistory` field value.

### equals / hashCode

Standard `equals()` and `hashCode()` implementations based on the `selectionHistory` field.

## Related Types

- BuilderToolsPlugin -- registers this component type during setup
- BuilderToolsUserDataSystem -- ensures this component is present on all player entities
- BuilderToolsPlugin.BuilderState -- reads `selectionHistory` to determine undo behavior
