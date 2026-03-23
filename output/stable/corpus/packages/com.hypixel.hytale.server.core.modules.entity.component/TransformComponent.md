# TransformComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class TransformComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private WorldChunk chunk
- @Nullable private Ref<ChunkStore> chunkRef

## Methods

- public static ComponentType<EntityStore, TransformComponent> getComponentType()
- @Nonnull public Vector3d getPosition()
- public void setPosition(@Nonnull Vector3d position)
- public void teleportPosition(@Nonnull Vector3d position)
- @Nonnull public Vector3f getRotation()
- public void setRotation(@Nonnull Vector3f rotation)
- @Nonnull public Transform getTransform()
- return new Transform(this.position, this.rotation)
- public void teleportRotation(@Nonnull Vector3f rotation)
- @Nonnull public ModelTransform getSentTransform()
- @Deprecated public WorldChunk getChunk()
- @Nullable public Ref<ChunkStore> getChunkRef()
- public void markChunkDirty(@Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void setChunkLocation(@Nullable Ref<ChunkStore> chunkRef, @Nullable WorldChunk chunk)
