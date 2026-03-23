# TrackedPlacement

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.blocktrack | Implements: Component<ChunkStore>

public class TrackedPlacement implements Component<ChunkStore>

Implementation of `Component<ChunkStore>`.

## Fields

- blockName | String | String field.

## Constructors

- TrackedPlacement() | Creates a new TrackedPlacement instance.
- TrackedPlacement(String blockName) | Creates a new TrackedPlacement instance.

## Methods

- getComponentType() | ComponentType<ChunkStore, TrackedPlacement> | static public method.
- clone() | Component<ChunkStore> | public method.

Also in this package: BlockCounter, OnAddRemove

Complete API:
  public static ComponentType<ChunkStore,TrackedPlacement> getComponentType()
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<TrackedPlacement> CODEC
private String blockName
