# BlockSpawner

Type: class | Package: com.hypixel.hytale.builtin.blockspawner.state | Implements: Component

public class BlockSpawner implements Component<ChunkStore>

ECS component stored in `ChunkStore`. Serialized via `BuilderCodec`.

## Accessors

- getComponentType() | ComponentType<ChunkStore, BlockSpawner> | Accessor method.
- getBlockSpawnerId() | String | Accessor method.
- setBlockSpawnerId(String blockSpawnerId) | void | Mutator method.

Complete API:
  public static ComponentType<ChunkStore,BlockSpawner> getComponentType()
  public String getBlockSpawnerId()
  public void setBlockSpawnerId(String blockSpawnerId)
  public String toString()
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<BlockSpawner> CODEC
private String blockSpawnerId
