---
title: "BuilderToolsUserData"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsUserData"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class BuilderToolsUserData implements Component<EntityStore>
```

An `EntityStore` component that stores per-player builder tools preferences. Registered with component ID `"BuilderTools"` during [BuilderToolsPlugin](BuilderToolsPlugin.md) setup. Currently tracks a single setting: whether changes to the block selection box are recorded in the undo/redo history.

## Constants

```java
public static final String ID = "BuilderTools"
```

The component registration ID.

## Codec

```java
public static final BuilderCodec<BuilderToolsUserData> CODEC
```

Serialization codec with a single `"SelectionHistory"` boolean field.

## Static Methods

### get

```java
@Nonnull
public static BuilderToolsUserData get(@Nonnull Player player)
```

Returns the `BuilderToolsUserData` component from the player's entity holder, or a new default instance if the component is not present.

### getComponentType

```java
public static ComponentType<EntityStore, BuilderToolsUserData> getComponentType()
```

Returns the registered `ComponentType` from the plugin singleton.

## Instance Methods

### isRecordingSelectionHistory

```java
public boolean isRecordingSelectionHistory()
```

Returns `true` if selection changes should be recorded in the undo/redo history. Defaults to `true`.

### setRecordSelectionHistory

```java
public void setRecordSelectionHistory(boolean selectionHistory)
```

Sets whether selection changes are recorded in the undo/redo history.

### clone

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a deep copy of this component with the same `selectionHistory` value.

### toString

```java
@Nonnull
@Override
public String toString()
```

Returns a string representation including the `selectionHistory` field value.

### equals / hashCode

Standard `equals()` and `hashCode()` implementations based on the `selectionHistory` field.

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- registers this component type during setup
- [BuilderToolsUserDataSystem](BuilderToolsUserDataSystem.md) -- ensures this component is present on all player entities
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- reads `selectionHistory` to determine undo behavior
