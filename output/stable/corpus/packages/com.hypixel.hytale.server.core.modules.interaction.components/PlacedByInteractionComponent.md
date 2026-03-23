# PlacedByInteractionComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.components | Implements: Component

public class PlacedByInteractionComponent implements Component<ChunkStore>

ECS component stored in `ChunkStore`. Serialized via `BuilderCodec`.

## Accessors

- getComponentType() | ComponentType<ChunkStore, PlacedByInteractionComponent> | Accessor method.
- getWhoPlacedUuid() | UUID | Accessor method.

Complete API:
  public static ComponentType<ChunkStore,PlacedByInteractionComponent> getComponentType()
  public UUID getWhoPlacedUuid()
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<PlacedByInteractionComponent> CODEC
private UUID whoPlacedUuid
