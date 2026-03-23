# TeleportConfigInstanceInteraction

Type: class | Package: com.hypixel.hytale.builtin.instances.interactions | Extends: SimpleBlockInteraction

public class TeleportConfigInstanceInteraction extends SimpleBlockInteraction

## Fields

- private static final HytaleLogger LOGGER
- private static final Message MESSAGE_GENERAL_INTERACTION_CONFIGURE_INSTANCE_NO_INSTANCE_NAME
- public static final BuilderCodec<TeleportConfigInstanceInteraction> CODEC
- private static final int SET_BLOCK_SETTINGS
- Ref<EntityStore> ref
- Player playerComponent
- Archetype<EntityStore> archetype
- InstancesPlugin module
- Universe universe
- ChunkStore chunkStore
- Ref<ChunkStore> chunkRef
- BlockComponentChunk blockComponentChunk
- Ref<ChunkStore> blockRef
- ConfigurableInstanceBlock configurableInstanceBlock
- CompletableFuture<World> targetWorldFuture
- Transform returnPoint
- World targetWorld
- UUID worldUuid
- Transform personalReturnPoint
- double removeBlockAfter
- long chunkIndex
- WorldChunk worldChunk
- int block
- WorldChunk worldChunkx
- BlockPosition targetBlock
- World world
- Store<ChunkStore> chunkComponentStore
- BlockChunk blockChunkComponent
- WorldChunk worldChunkComponent
- BlockType blockType
- IndexedLookupTableAssetMap<String, BlockBoundingBoxes> hitboxAssetMap
- BlockSection section
- int rotationIndex
- RotationTuple rotation
- BlockBoundingBoxes hitboxAsset
- Box hitbox
- Vector3d position
- Vector3f rotationOutput

## Methods

- public WaitForDataFrom getWaitForDataFrom()
- protected void interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i targetBlock,
        @Nonnull CooldownHandler cooldownHandler)` |
| `` | `new` | `CompletableFuture()` |
| `protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |
| `private static` | `Transform` | `getPersonalReturnPoint(@Nonnull ConfigurableInstanceBlock state,
        @Nonnull InteractionContext context,
        @Nullable Transform returnPoint,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `private static` | `Transform` | `makeReturnPoint(@Nonnull ConfigurableInstanceBlock state, @Nonnull InteractionContext context, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `throw new` | `IllegalArgumentException("Can't use OriginSource.BLOCK without a target block")` |
| `` | `throw new` | `IllegalArgumentException("Block chunk component not found")` |
| `` | `throw new` | `IllegalArgumentException("World chunk component not found")` |
| `` | `throw new` | `IllegalArgumentException("Block type not found")` |
| `` | `throw new` | `IllegalArgumentException("Hitbox asset not found for block type: " + blockType.getId()` |
| `` | `return new` | `Transform(position, rotationOutput)` |
| `` | `throw new` | `IllegalArgumentException("Chunk not loaded")` |

Also in this package: ExitInstanceInteraction, OriginSource, TeleportInstanceInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  private static Transform getPersonalReturnPoint(ConfigurableInstanceBlock state, InteractionContext context, Transform returnPoint, ComponentAccessor<EntityStore> componentAccessor)
  private static Transform makeReturnPoint(ConfigurableInstanceBlock state, InteractionContext context, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final HytaleLogger LOGGER
private static final Message MESSAGE_GENERAL_INTERACTION_CONFIGURE_INSTANCE_NO_INSTANCE_NAME
public static final BuilderCodec<TeleportConfigInstanceInteraction> CODEC
private static final int SET_BLOCK_SETTINGS
