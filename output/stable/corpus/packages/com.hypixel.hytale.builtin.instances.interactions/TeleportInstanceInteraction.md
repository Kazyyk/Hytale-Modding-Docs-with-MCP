# TeleportInstanceInteraction

Type: class | Package: com.hypixel.hytale.builtin.instances.interactions | Extends: SimpleInstantInteraction

public class TeleportInstanceInteraction extends SimpleInstantInteraction

## Fields

- public static final BuilderCodec<TeleportInstanceInteraction> CODEC
- private static final int SET_BLOCK_SETTINGS
- private String instanceName
- private String instanceKey
- private Vector3d positionOffset
- private Vector3f rotation
- private TeleportInstanceInteraction.OriginSource originSource
- private boolean personalReturnPoint
- private boolean closeOnBlockRemove
- private double removeBlockAfter
- CommandBuffer<EntityStore> commandBuffer
- Ref<EntityStore> ref
- Player playerComponent
- Archetype<EntityStore> archetype
- World world
- InstancesPlugin module
- Universe universe
- CompletableFuture<World> targetWorldFuture
- Transform returnPoint
- World targetWorld
- BlockPosition targetBlock
- ChunkStore chunkStore
- Ref<ChunkStore> chunkRef
- BlockComponentChunk blockComponentChunk
- int index
- Ref<ChunkStore> blockRef
- InstanceBlock instanceState
- Holder<ChunkStore> holder
- UUID worldName
- Ref<ChunkStore> finalBlockRef
- InstanceBlock finalInstanceState
- Transform personalReturnPoint
- BlockPosition targetBlockx
- int block
- Transform transform
- TransformComponent transformComponent
- WorldChunk chunk
- BlockType blockType
- int rotationIndex
- RotationTuple rotationTuple
- IndexedLookupTableAssetMap<String, BlockBoundingBoxes> hitboxAssetMap
- Box hitbox
- Vector3d position
- Vector3f rotation
- PLAYER, BLOCK
- public static EnumCodec<TeleportInstanceInteraction.OriginSource> CODEC

## Methods

- public WaitForDataFrom getWaitForDataFrom()
- protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- new CompletableFuture()
- private Transform getPersonalReturnPoint(@Nonnull Ref<EntityStore> playerRef,
        @Nonnull InteractionContext context,
        @Nullable Transform returnPoint,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `private` | `Transform` | `makeReturnPoint(@Nonnull Ref<EntityStore> playerRef, @Nonnull InteractionContext context, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `throw new` | `IllegalArgumentException("Can't use OriginSource.BLOCK without a target block")` |
| `` | `throw new` | `IllegalArgumentException("Missing chunk")` |

## Inner Types

- `TeleportInstanceInteraction.OriginSource`

Also in this package: ExitInstanceInteraction, OriginSource, TeleportConfigInstanceInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private Transform getPersonalReturnPoint(Ref<EntityStore> playerRef, InteractionContext context, Transform returnPoint, ComponentAccessor<EntityStore> componentAccessor)
  private Transform makeReturnPoint(Ref<EntityStore> playerRef, InteractionContext context, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<TeleportInstanceInteraction> CODEC
private static final int SET_BLOCK_SETTINGS
private String instanceName
private String instanceKey
private Vector3d positionOffset
private Vector3f rotation
private TeleportInstanceInteraction.OriginSource originSource
private boolean personalReturnPoint
private boolean closeOnBlockRemove
private double removeBlockAfter
