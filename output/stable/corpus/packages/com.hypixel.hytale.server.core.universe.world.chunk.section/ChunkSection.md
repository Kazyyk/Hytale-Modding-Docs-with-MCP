# ChunkSection

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section | Implements: Component<ChunkStore>

public class ChunkSection implements Component<ChunkStore>

Lightweight ECS component that associates a chunk section entity with its parent chunk column and its 3D chunk-section coordinates (x, y, z where y is 0-9). Acts as the anchor component for the section entity in the `ChunkStore`, alongside `BlockSection`, `FluidSection`, and `BlockPhysics` components.

## Static Methods


public static ComponentType<ChunkStore, ChunkSection> getComponentType()

## Constructors


public ChunkSection(Ref<ChunkStore> chunkColumnReference, int x, int y, int z)

## Instance Methods


public Ref<ChunkStore> getChunkColumnReference()

Returns the reference to the parent chunk column entity.


public int getX()


public int getY()


public int getZ()


public void load(Ref<ChunkStore> chunkReference, int x, int y, int z)

Re-initializes this component with new coordinates and chunk reference (used during deserialization).

Also in this package: BlockSection, ChunkLightData, ChunkLightDataBuilder, ChunkSectionReference, FluidSection, Res, TickRequest

Complete API:
  public static ComponentType<ChunkStore,ChunkSection> getComponentType()
  public void load(Ref<ChunkStore> chunkReference, int x, int y, int z)
  public Ref<ChunkStore> getChunkColumnReference()
  public int getX()
  public int getY()
  public int getZ()
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<ChunkSection> CODEC
private Ref<ChunkStore> chunkColumnReference
private int x
private int y
private int z
