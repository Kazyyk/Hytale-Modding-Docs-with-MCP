# DeployablesUtils

Type: class | Package: com.hypixel.hytale.builtin.deployables

public class DeployablesUtils

## Fields

- @Nonnull private static final String DEPLOYABLE_MAX_STAT_MODIFIER

## Methods

- @Nonnull public static Ref<EntityStore> spawnDeployable(@Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull Store<EntityStore> store,
        @Nonnull DeployableConfig config,
        @Nonnull Ref<EntityStore> deployerRef,
        @Nonnull Vector3f position,
        @Nonnull Vector3f rotation,
        @Nonnull String spawnFace)` |
| `static` | `void` | `populateStats(@Nonnull DeployableConfig config, @Nonnull EntityStatMap entityStatMapComponent)` |
| `public static` | `void` | `playAnimation(@Nonnull Store<EntityStore> store,
        int networkId,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull DeployableConfig config,
        @Nonnull AnimationSlot animationSlot,
        @Nullable String itemAnimationsId,
        @Nonnull String animationId)` |
| `public static` | `void` | `stopAnimation(@Nonnull Store<EntityStore> store, int networkId, @Nonnull Ref<EntityStore> ref, @Nonnull AnimationSlot animationSlot)` |
| `public static` | `void` | `playSoundEventsAtEntity(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, int localIndex, int worldIndex, @Nonnull Vector3d pos)` |

Also in this package: DeployablesPlugin

Complete API:
  public static Ref<EntityStore> spawnDeployable(CommandBuffer<EntityStore> commandBuffer, Store<EntityStore> store, DeployableConfig config, Ref<EntityStore> deployerRef, Vector3f position, Vector3f rotation, String spawnFace)
  static void populateStats(DeployableConfig config, EntityStatMap entityStatMapComponent)
  public static void playAnimation(Store<EntityStore> store, int networkId, Ref<EntityStore> ref, DeployableConfig config, AnimationSlot animationSlot, String itemAnimationsId, String animationId)
  public static void stopAnimation(Store<EntityStore> store, int networkId, Ref<EntityStore> ref, AnimationSlot animationSlot)
  public static void playSoundEventsAtEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, int localIndex, int worldIndex, Vector3d pos)

Fields:
private static final String DEPLOYABLE_MAX_STAT_MODIFIER
