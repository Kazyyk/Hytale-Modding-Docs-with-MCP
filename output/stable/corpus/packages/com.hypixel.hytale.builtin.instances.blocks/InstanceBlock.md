# InstanceBlock

Type: class | Package: com.hypixel.hytale.builtin.instances.blocks | Implements: Component<ChunkStore>

public class InstanceBlock implements Component<ChunkStore>

A `ChunkStore` component storing InstanceBlock-related data on chunks.

## Fields

- protected UUID worldUUID
- protected CompletableFuture<World> worldFuture
- protected boolean closeOnRemove

## Methods

- public InstanceBlock()
- public InstanceBlock(UUID worldUUID, boolean closeOnRemove)
- @Nonnull public static ComponentType<ChunkStore, InstanceBlock> getComponentType()
- public UUID getWorldUUID()
- public void setWorldUUID(UUID worldUUID)
- public CompletableFuture<World> getWorldFuture()
- public void setWorldFuture(CompletableFuture<World> worldFuture)
- public boolean isCloseOnRemove()
- public void setCloseOnRemove(boolean closeOnRemove)
- @Nullable @Override public Component<ChunkStore> clone()

Also in this package: ConfigurableInstanceBlock, OnRemove, OnRemove

Complete API:
  public static ComponentType<ChunkStore,InstanceBlock> getComponentType()
  public UUID getWorldUUID()
  public void setWorldUUID(UUID worldUUID)
  public CompletableFuture<World> getWorldFuture()
  public void setWorldFuture(CompletableFuture<World> worldFuture)
  public boolean isCloseOnRemove()
  public void setCloseOnRemove(boolean closeOnRemove)
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<InstanceBlock> CODEC
protected UUID worldUUID
protected CompletableFuture<World> worldFuture
protected boolean closeOnRemove
